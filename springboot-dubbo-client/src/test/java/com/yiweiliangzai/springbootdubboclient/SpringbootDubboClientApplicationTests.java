package com.yiweiliangzai.springbootdubboclient;


import com.yiweiliangzai.springbootdubboclient.controller.UserController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import yiwei.liangzai.domain.User;

@SpringBootTest
class SpringbootDubboClientApplicationTests {
@Autowired
private UserController userController;
	@Test
	void contextLoads() {
		User user = userController.findAll();
		System.out.println(user.getAge()+"BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB");
	}

}
