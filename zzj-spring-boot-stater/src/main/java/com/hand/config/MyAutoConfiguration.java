package com.hand.config;

import com.hand.pojo.SimpleBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2023-01-27
 */
@Configuration
@ConditionalOnBean(ConfigMarker.class)  // 上下文中必须存在ConfigMarker  bean，才会让当前自动配置类生效
public class MyAutoConfiguration {

	static {
		System.out.println("MyAutoConfiguration init...");
	}

	@Bean
	public SimpleBean simpleBean() {
		return new SimpleBean();
	}
}
