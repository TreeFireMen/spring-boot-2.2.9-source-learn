package com.hand.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2023-01-27
 */
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "simplebean")
public class SimpleBean {

	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "SimpleBean{" +
				"id=" + id +
				", name='" + name + '\'' +
				'}';
	}
}
