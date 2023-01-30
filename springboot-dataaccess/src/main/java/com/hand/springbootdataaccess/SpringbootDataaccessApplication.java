package com.hand.springbootdataaccess;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

// 由于数据源的配置走的是自己配置的MyDataSourceAutoConfiguration,所以需要排除掉 DataSourceAutoConfiguration
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@MapperScan(value = "com.hand.springbootdataaccess.mapper")
public class SpringbootDataaccessApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDataaccessApplication.class, args);
	}

}
