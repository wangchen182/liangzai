package com.yiweiliangzai.springbootdubboclient.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import yiwei.liangzai.domain.User;
import yiwei.liangzai.service.login.Login;

import javax.annotation.Resource;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author wangchen
 * @since 2021-05-07
 */
@RestController
@RequestMapping("/usser")



public class UserController {
    @Reference
    private Login login;

    public User findAll() {
        return login.find();
    }
}

