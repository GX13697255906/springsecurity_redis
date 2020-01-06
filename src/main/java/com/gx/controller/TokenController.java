package com.gx.controller;


import com.gx.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.collections.MapUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author xun.guo
 * @since 2019-12-31
 */
@RestController
@Api(value = "登录验证",tags = "登录验证")
public class TokenController {

    @Autowired
    private UserService userService;

    public Map<String,Object> login(@RequestBody HashMap<String,Object> params){
        return null;
    }

    @ApiOperation(value = "获取权限令牌",notes = "获取权限令牌")
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String registery(@RequestParam("username") String useranme,@RequestParam("password") String password) throws Exception{
        return null;
    }

    @ApiOperation(value = "退出登录",notes = "退出登录")
    @RequestMapping(value = "/logout",method = RequestMethod.GET)
    public String logout(){
        return null;
    }


}

