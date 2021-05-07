package com.yiwei.liangzai.springbootdubboserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sql.DataSource;

@SpringBootApplication
public class SpringbootDubboServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDubboServerApplication.class, args);
		Logger logger = LoggerFactory.getLogger(SpringbootDubboServerApplication.class);
		logger.info("ssssssssssssssssss");
		System.out.println(DataSource.class);
	}


}
