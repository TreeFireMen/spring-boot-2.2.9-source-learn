package com.hand;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableRegisterServer
public class MyTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyTestApplication.class, args);
	}

}
