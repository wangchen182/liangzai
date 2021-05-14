package com.yiweiliangzai.springbootdubboclient;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ImportResource;

@EnableDubbo
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class SpringbootDubboClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDubboClientApplication.class, args);
	}

}
