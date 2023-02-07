package com.hand.entity;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2023-02-07
 */
public class ADemo {

	private String name;

	private Integer age;

	public ADemo() {
	}

	public ADemo(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "ADemo{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}
