package com.hand.springbootdataaccess.config;

import javax.sql.DataSource;

import com.alibaba.druid.pool.DruidDataSource;
import com.hand.springbootdataaccess.pojo.SimpleBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2023-01-29
 */
@Configuration
public class DruidConfig {


	@Bean
	@ConfigurationProperties(prefix = "spring.datasource")
	public DataSource dataSource() {
		return new DruidDataSource();
	}

	@Bean
	@ConfigurationProperties(prefix = "spring.simple")
	public SimpleBean simpleBean() {
		return new SimpleBean();
	}
}
