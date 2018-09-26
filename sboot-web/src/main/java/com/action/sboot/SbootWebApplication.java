package com.action.sboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//启动类要放在com.action
@SpringBootApplication
@MapperScan("com.action.sboot.mapper")
public class SbootWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbootWebApplication.class, args);
	}
}
