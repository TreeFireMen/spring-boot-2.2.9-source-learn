package com.hand.springbootdataaccess.config;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * 数据源的自动配置对象
 *
 * @author zijian.zeng@hand-china.com
 * @since 2023-01-30
 */
@Configuration
public class MyDataSourceAutoConfiguration {


	Logger logger = LoggerFactory.getLogger(MyDataSourceAutoConfiguration.class);

	/**
	 * master datasource
	 */
	@Bean
	@ConfigurationProperties(prefix = "spring.druid.datasource.master")
	public DataSource masterDataSource() {
		logger.info("create master datasource");
		return DataSourceBuilder.create().build();
	}


	/**
	 * slave datasource
	 */
	@Bean
	@ConfigurationProperties(prefix = "spring.druid.datasource.slave")
	public DataSource slaveDataSource() {
		logger.info("create slave datasource");
		return DataSourceBuilder.create().build();
	}


	/**
	 * primary datasource
	 */
	@Bean
	// 由于此类中的三个方法都会执行,并且生成的都是DataSource对象,所以需要指定以哪个[为准]
	@Primary
	public DataSource primaryDataSource(
			@Autowired @Qualifier("masterDataSource") DataSource masterDataSource,
			@Autowired @Qualifier("slaveDataSource") DataSource slaveDataSource
	) {
		logger.info("create primary datasource");
		RoutingDataSource routingDataSource = new RoutingDataSource();
		Map<Object, Object> map = new HashMap<>();
		map.put("master", masterDataSource);
		map.put("slave", slaveDataSource);
		routingDataSource.setTargetDataSources(map);
		return routingDataSource;
	}


}
