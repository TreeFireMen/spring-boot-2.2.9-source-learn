package com.hand.entity;


import com.alibaba.fastjson.JSON;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2023-02-07
 */
public class PrintDemo {

	private String prefix;

	private ADemo aDemo;

	public static final String args = "modeler";

	public static void printfSome() {
		System.out.println("PrintDemo....print");
	}

	public void sayHello(String name, int age) {
		System.out.println("name: " + name + " age: " + age);
	}

	private void print(ADemo a) {
		System.out.println(prefix + " => " + a);
	}

	public <T> T print(String str, Class<T> clz) {
		T obj = JSON.parseObject(str, clz);
		System.out.println("class: " + obj);
		return obj;
	}

	public void print(String str, String clz) {
		System.out.println("str2a: " + str + " clz: " + clz);
	}

	public void print(String str, OgnlEnum ognlEnum) {
		System.out.println("enum: " + str + ":" + ognlEnum);
	}

	public void print(String str, ADemo a) {
		System.out.println("obj: " + str + ":" + a);
	}

	public void show(Class clz) {
		System.out.println(clz.getName());
	}


	public PrintDemo() {
	}

	public PrintDemo(String prefix, ADemo aDemo) {
		this.prefix = prefix;
		this.aDemo = aDemo;
	}

	@Override
	public String toString() {
		return "PrintDemo{" +
				"prefix='" + prefix + '\'' +
				", aDemo=" + aDemo +
				'}';
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public ADemo getADemo() {
		return aDemo;
	}

	public void setADemo(ADemo aDemo) {
		this.aDemo = aDemo;
	}
}
