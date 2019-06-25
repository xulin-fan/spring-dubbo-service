package com.spring.dubbo.service;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@EnableDubbo
public class SpringDubboConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDubboConsumerApplication.class, args);
	}

}
