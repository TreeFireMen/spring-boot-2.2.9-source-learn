package com.hand.test;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2023-01-31
 */
public interface ServiceInterface {

	void test();
}

class ServiceA implements ServiceInterface {
	@Override
	public void test() {
		System.out.println("ServiceA");
	}
}

class ServiceB implements ServiceInterface {
	@Override
	public void test() {
		System.out.println("ServiceB");
	}
}
