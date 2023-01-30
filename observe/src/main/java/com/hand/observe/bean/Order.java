package com.hand.observe.bean;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2023-01-30
 */
public class Order {

	private long id;

	private String name;

	public Order() {
	}

	public Order(long id, String name) {
		this.id = id;
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
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
		return "Order{" +
				"id=" + id +
				", name='" + name + '\'' +
				'}';
	}
}
