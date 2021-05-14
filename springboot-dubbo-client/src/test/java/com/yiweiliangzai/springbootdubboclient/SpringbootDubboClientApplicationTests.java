package com.yiweiliangzai.springbootdubboclient;


import com.yiweiliangzai.springbootdubboclient.controller.config.shiro.UserController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootDubboClientApplicationTests {
@Autowired
private UserController userController;
	@Test
	void contextLoads() {

	}

}
