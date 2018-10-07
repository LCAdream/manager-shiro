package com.lcadream.www.core;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lcadream.www.core.mappers")
public class ManagerCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManagerCoreApplication.class, args);
	}
}
