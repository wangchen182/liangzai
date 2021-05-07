package com.yiwei.liangzai.springbootdubboserver.dao.controller;


import com.yiwei.liangzai.springbootdubboserver.dao.entity.User;
import com.yiwei.liangzai.springbootdubboserver.dao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author wangchen
 * @since 2021-05-07
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    public User findAll() {
        return userService.findAll();
    }
}

