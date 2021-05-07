package com.yiwei.liangzai.springbootdubboserver;


import com.yiwei.liangzai.springbootdubboserver.dao.controller.UserController;
import com.yiwei.liangzai.springbootdubboserver.dao.entity.User;
import com.yiwei.liangzai.springbootdubboserver.dao.mapper.UserMapper;
import com.yiwei.liangzai.springbootdubboserver.dao.service.impl.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootDubboServerApplicationTests {
	@Autowired
	private UserController userController;


	@Test
	void contextLoads() {
		User user = userController.findAll();
		System.out.println(user.getAge()+"AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
	}

}
