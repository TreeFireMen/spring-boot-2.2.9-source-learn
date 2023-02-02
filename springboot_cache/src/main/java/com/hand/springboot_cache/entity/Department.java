package com.hand.springboot_cache.entity;

import java.io.Serializable;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2023-02-01
 */
public class Department implements Serializable {

	private int id;
	private String departmentName;

	public Department() {
	}

	public Department(int id, String departmentName) {
		this.id = id;
		this.departmentName = departmentName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	@Override
	public String toString() {
		return "Department{" +
				"id=" + id +
				", departmentName='" + departmentName + '\'' +
				'}';
	}
}
