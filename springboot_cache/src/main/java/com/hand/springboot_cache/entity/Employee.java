package com.hand.springboot_cache.entity;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2023-02-01
 */
public class Employee {

	private int id;
	private String lastName;
	private String email;
	private int gender;
	private int dId;

	public Employee() {
	}

	public Employee(int id, String lastName, String email, int gender, int dId) {
		this.id = id;
		this.lastName = lastName;
		this.email = email;
		this.gender = gender;
		this.dId = dId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public int getdId() {
		return dId;
	}

	public void setdId(int dId) {
		this.dId = dId;
	}

	@Override
	public String toString() {
		return "Employee{" +
				"id=" + id +
				", lastName='" + lastName + '\'' +
				", email='" + email + '\'' +
				", gender=" + gender +
				", dId=" + dId +
				'}';
	}
}
