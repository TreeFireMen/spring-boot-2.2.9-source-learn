package com.hand.springboot_cache;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
@MapperScan(basePackages = "com.hand.springboot_cache.mapper")
public class SpringbootCacheApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootCacheApplication.class, args);
	}

}
 