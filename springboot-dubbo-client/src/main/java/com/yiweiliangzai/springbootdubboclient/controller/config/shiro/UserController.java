package com.yiweiliangzai.springbootdubboclient.controller.config.shiro;


import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import yiwei.liangzai.domain.TbUser;
import yiwei.liangzai.service.login.Login0001;


/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author wangchen
 * @since 2021-05-07
 */
@RestController
public class UserController {
    @Reference
    private Login0001 login0001;
    //将dubbo bean接口注册到spring
    @Bean(name = "login0001")
    public Login0001 findAll() {

        return login0001;
    }
}

