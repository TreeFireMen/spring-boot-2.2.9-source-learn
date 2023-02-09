package com.hand.streamSort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2023-02-09
 */
public class Stu {
	String name;
	int age;

	public Stu(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Stu{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}

	public static void main(String[] args) {
		List<Stu> stul = new ArrayList<>();
		stul.add(new Stu("b", 19));
		stul.add(new Stu("c", 17));
		stul.add(new Stu("a", 19));
		stul.add(new Stu("d", 18));
		stul.add(new Stu("b", 17));
		stul.add(new Stu("a", 17));
		stul.add(new Stu("c", 19));
		stul.add(new Stu("c", 18));


		/**
		 * 0 : 先把数据按照名称排序，再将排序结果按照年龄排序
		 * 1 ：先把数据按照名称排序，再在按照名称排序基础上，对相同名称的数据按照年龄排序
		 *
		 */
//		System.out.println("-0-");
//		stul.stream().sorted(Comparator.comparing(Stu::getName)).sorted(Comparator.comparing(Stu::getAge))
//				.forEachOrdered(stu -> System.out.println("name:" + stu.getName() + ";age:" + stu.getAge()));
//		System.out.println("-1-");
//		stul.stream().sorted(Comparator.comparing(Stu::getName).thenComparing(Stu::getAge))
//				.forEachOrdered(stu -> System.out.println("name:" + stu.getName() + ";age:" + stu.getAge()));

		System.out.println("-2-");
		stul.stream().sorted(Comparator.comparing(Stu::getAge).thenComparing(Stu::getName))
				.forEachOrdered(stu -> System.out.println("name:" + stu.getName() + ";age:" + stu.getAge()));

		System.out.println("-3-");
		stul.stream().sorted(Comparator.comparing(Stu::getAge).thenComparing(Stu::getName).reversed())
				.forEachOrdered(stu -> System.out.println("name:" + stu.getName() + ";age:" + stu.getAge()));

		System.out.println("-4-");
		stul.stream().sorted(Comparator.comparing(Stu::getAge).reversed().thenComparing(Stu::getName))
				.forEachOrdered(stu -> System.out.println("name:" + stu.getName() + ";age:" + stu.getAge()));


		/**
		 * 这个例子深刻理解：reversed()作用：
		 * 先age升，然后reversed，得到age降，第二个name升，再reversed（当前age降name升）得到age升name降；
		 */
		System.out.println("-5-");
		stul.stream().sorted(Comparator.comparing(Stu::getAge).reversed().thenComparing(Stu::getName).reversed())
				.forEachOrdered(stu -> System.out.println("name:" + stu.getName() + ";age:" + stu.getAge()));
	}
}

