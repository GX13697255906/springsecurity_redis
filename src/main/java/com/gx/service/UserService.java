package com.gx.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gx.entity.User;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author xun.guo
 * @since 2019-12-31
 */
public interface UserService extends IService<User> {

    User getUserByUserName(String username);

    Map<String,Object> login(String username,String password);

    String registery(String username,String password);


}
