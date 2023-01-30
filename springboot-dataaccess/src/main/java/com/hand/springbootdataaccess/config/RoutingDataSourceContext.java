package com.hand.springbootdataaccess.config;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2023-01-30
 */
public class RoutingDataSourceContext {

	static final ThreadLocal<String> threadLocal = new ThreadLocal<>();

	// set key
	public RoutingDataSourceContext(String key) {
		threadLocal.set(key);
	}

	// get key  	default : "master"
	public static String getDataSourceRoutingKey() {
		return threadLocal.get() == null ? MyDataSourceAutoConfiguration.MASTER : threadLocal.get();
	}

	public void close() {
		threadLocal.remove();
	}
}
