package com.hand.springbootdataaccess;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.hand.springbootdataaccess.mapper")
public class SpringbootDataaccessApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDataaccessApplication.class, args);
	}

}
