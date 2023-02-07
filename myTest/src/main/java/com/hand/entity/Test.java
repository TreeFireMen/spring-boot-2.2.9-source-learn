package com.hand.entity;

import java.util.HashMap;

import ognl.DefaultClassResolver;
import ognl.DefaultTypeConverter;
import ognl.MemberAccess;
import ognl.Ognl;
import ognl.OgnlContext;
import ognl.OgnlException;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2023-02-07
 */
public class Test {
	public static void main(String[] args) throws OgnlException {
		ADemo a = new ADemo();
		a.setName("zzj");
		a.setAge(10);

		PrintDemo print = new PrintDemo();
		print.setPrefix("ognl");
		print.setADemo(a);

		OgnlContext ognlContext = (OgnlContext) Ognl.createDefaultContext(print,
				new DefaultMemberAccess(true), new DefaultClassResolver(), new DefaultTypeConverter());
		ognlContext.setRoot(print);
		ognlContext.put("print", print);
		ognlContext.put("a", a);

		// #print,其中的print是实例名
//		Object ans = Ognl.getValue(Ognl.parseExpression("#print.sayHello(\"一灰灰blog\", 18)"),
//				ognlContext, ognlContext.getRoot());
//		System.out.println("实例方法执行： " + ans);

		// 静态类的访问需要传入全路径,使用@开头,类与方法之间也是用@分割
		// 比如:调用静态类中的方法 @com.hand.entity.PrintDemo@printfSome()
		// 比如:调用静态类中的静态属性 @com.hand.entity.PrintDemo@args
//		Object ans2 = Ognl.getValue(Ognl.parseExpression("@com.hand.entity.PrintDemo@args"),
//				ognlContext, ognlContext.getRoot());
//		System.out.println("实例方法执行： " + ans2);


		/**
		 * public <T> T print(String str, Class<T> clz) {
		 *     T obj = JSON.parseObject(str, clz);
		 *     System.out.println("class: " + obj);
		 *     return obj;
		 * }
		 *
		 * 想办法调用PrintDemo中的方法
		 */
//		Object ans2 = Ognl.getValue(Ognl.parseExpression("#print.print(\"{'name':'haha', 'age': 10}\", @com.hand.entity.ADemo@class)"),
//				ognlContext, ognlContext.getRoot());
//		System.out.println("实例方法执行： " + ans2);
//		Object ans3 = Ognl.getValue(Ognl.parseExpression("#print.print(\"{'name':'haha', 'age': 10}\", #a.getClass())"),
//				ognlContext, ognlContext.getRoot());
//		System.out.println("实例方法执行： " + ans3);


		/**
		 * public void print(String str, OgnlEnum ognlEnum) {
		 *     System.out.println("enum: " + str + ":" + ognlEnum);
		 * }
		 * 想办法调用printDemo中的此方法
		 */
		// 如何获取枚举参数
//		Object ans3 = Ognl.getValue(Ognl.parseExpression("#print.print(\"print enum\", @com.hand.entity.OgnlEnum@CONSOLE)"),
//				ognlContext, ognlContext.getRoot());
//		System.out.println("实例方法执行： " + ans3);

		/**
		 * 如何传递一个对象给参数
		 *
		 * public void print(String str, ADemo a) {
		 *     System.out.println("obj: " + str + ":" + a);
		 * }
		 */
		Object ans3 = Ognl.getValue(Ognl.parseExpression("#print.print(\"print enum\", new com.hand.entity.ADemo(\"test\", 20))"),
				ognlContext, ognlContext.getRoot());
		System.out.println("对象传参： " + ans3);



	}
}
