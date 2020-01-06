package com.gx.config.security;

import com.alibaba.fastjson.JSON;
import com.gx.config.Exception.ExceptionEnum;
import com.gx.config.Exception.SecurityException;
import com.gx.util.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: zzx
 * @date: 2018/10/15 17:30
 * @description: 确保在一次请求只通过一次filter，而不需要重复执行
 */
@Slf4j
@Component
public class JwtAuthenticationTokenFilter extends OncePerRequestFilter {

    @Value("${token.expirationSeconds}")
    private int expirationSeconds;
    @Value("${token.validTime}")
    private int validTime;
    @Autowired
    private SelfUserDetailsService userDetailsService;
    @Autowired
    private UtilRedis utilRedis;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws IOException, ServletException, SecurityException {
        response.setCharacterEncoding("UTF-8");  //重点  相应编码格式
        String authHeader = request.getHeader("Authorization");
        String currentIp = UtilAccessAddress.getIpAddress(request);
        if (authHeader != null && authHeader.startsWith("Bearer")) {
            String authToken = authHeader.substring("Bearer".length());

            String username = JwtTokenUtil.parseToken(authToken, "_secret");
            String ip = UtilCollection.getMapValue(JwtTokenUtil.getClaims(authToken),"ip");

            //进入黑名单
            if(utilRedis.isBlackList(authToken)){
                log.info("用户：{}的token：{}在黑名单之中，拒绝访问",username,authToken);
                response.getWriter().write(JSON.toJSONString(ResultVO.result(ResultEnum.TOKEN_IS_BLACKLIST, false)));
                return;
            }

            //判断token是否过期
            /*
             * 过期的话，从redis中读取有效时间（比如七天登录有效），再refreshToken（根据以后业务加入，现在直接refresh）
             * 同时，已过期的token加入黑名单
             */
            if (utilRedis.hasKey(authToken)) {//判断redis是否有保存
                String expirationTime = utilRedis.hget(authToken,"expirationTime").toString();
                if (JwtTokenUtil.isExpiration(expirationTime)) {
                    //获得redis中用户的token刷新时效
                    String tokenValidTime = (String) utilRedis.getTokenValidTimeByToken(authToken);
                    String currentTime = UtilDate.getTime();
                    //这个token已作废，加入黑名单
                    log.info("{}已作废，加入黑名单",authToken);
                    utilRedis.hset("blacklist", authToken, UtilDate.getTime());

                    if (UtilDate.compareDate(currentTime, tokenValidTime)) {

                        //超过有效期，不予刷新
                        log.info("{}已超过有效期，不予刷新",authToken);
                        response.getWriter().write(JSON.toJSONString(ResultVO.result(ResultEnum.LOGIN_IS_OVERDUE, false)));
                        return;
                    } else {//仍在刷新时间内，则刷新token，放入请求头中
                        String usernameByToken = (String) utilRedis.getUsernameByToken(authToken);
                        username = usernameByToken;//更新username

                        ip = (String) utilRedis.getIPByToken(authToken);//更新ip

                        //获取请求的ip地址
                        Map<String, Object> map = new HashMap<>();
                        map.put("ip", ip);
                        String jwtToken = JwtTokenUtil.generateToken(usernameByToken, expirationSeconds, map);

                        //更新redis
                        utilRedis.setTokenRefresh(jwtToken,usernameByToken,ip);
                        //删除旧的token保存的redis
                        utilRedis.deleteKey(authToken);
                        //新的token保存到redis中
                        utilRedis.setTokenRefresh(jwtToken,username,ip);

                        log.info("redis已删除旧token：{},新token：{}已更新redis",authToken,jwtToken);
                        authToken = jwtToken;//更新token，为了后面
                        response.setHeader("Authorization", "Bearer " + jwtToken);
                    }
                }

            }

            if (username != null && SecurityContextHolder.getContext().getAuthentication() == null) {

                /*
                 * 加入对ip的验证
                 * 如果ip不正确，进入黑名单验证
                 */
                if (!ip.equals(currentIp)) {//地址不正确
                    log.info("用户：{}的ip地址变动，进入黑名单校验",username);
                    //进入黑名单验证
                    if (utilRedis.isBlackList(authToken)) {
                        log.info("用户：{}的token：{}在黑名单之中，拒绝访问",username,authToken);
                        response.getWriter().write(JSON.toJSONString(ResultVO.result(ResultEnum.TOKEN_IS_BLACKLIST, false)));
                        return;
                    }
                    //黑名单没有则继续，如果黑名单存在就退出后面
                }
                UserDetails userDetails = userDetailsService.loadUserByUsername(username);
                if (userDetails != null) {
                    UsernamePasswordAuthenticationToken authentication =
                            new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
                    authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));

                    SecurityContextHolder.getContext().setAuthentication(authentication);
                }
            }
        }
        filterChain.doFilter(request, response);
    }
}