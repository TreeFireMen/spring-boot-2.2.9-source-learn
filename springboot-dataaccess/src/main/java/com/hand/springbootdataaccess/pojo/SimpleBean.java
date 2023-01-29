package com.hand.springbootdataaccess.pojo;

import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2023-01-29
 */
public class SimpleBean {

	private String name;
	private String age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "SimpleBean{" +
				"name='" + name + '\'' +
				", age='" + age + '\'' +
				'}';
	}
}
