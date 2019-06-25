package com.spring.dubbo.service;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class SpringDubboProviderMockApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDubboProviderMockApplication.class, args);
	}

}
