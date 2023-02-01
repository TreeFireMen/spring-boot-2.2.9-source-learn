package com.hand.test;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2023-01-31
 */
@Configuration
// 通常是引入配置类
@Import(ConfigB.class)
public class ConfigA {

	@Bean
	@ConditionalOnMissingBean
	public ServiceInterface getServiceA() {
		return new ServiceA();
	}

	public static void main(String[] args) {
		// AnnotationConfigApplicationContext 参数指定 Java文件的[配置]类
		ApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigA.class);
		ServiceInterface bean = ctx.getBean(ServiceInterface.class);
		bean.test();
	}
}

@Configuration
class ConfigB {

	@Bean
	@ConditionalOnMissingBean
	public ServiceInterface getServiceB() {
		return new ServiceB();
	}
}

