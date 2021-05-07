package com.yiweiliangzai.springbootdubboclient.controller;


import com.yiwei.liangzai.springbootdubboserver.dao.entity.User;
import com.yiwei.liangzai.springbootdubboserver.dao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    @Resource
    private UserService userService;

    public User findAll() {
        return userService.findAll();
    }
}

