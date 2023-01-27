package com.hand.config;

import com.hand.pojo.SimpleBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2023-01-27
 */
@Configuration
public class MyAutoConfiguration {

	static {
		System.out.println("MyAutoConfiguration init...");
	}

	@Bean
	public SimpleBean simpleBean() {
		return new SimpleBean();
	}

}
