package com.yiweiliangzai.springbootdubboclient.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class SpringbootDubboClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDubboClientApplication.class, args);
	}

}
