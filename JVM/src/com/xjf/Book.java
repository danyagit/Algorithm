package com.xjf;

public class Book {
	public static void main(String[] args) {
		//初始化顺序：类的初始化（类变量、类的代码块。即static修饰）、对象的初始化
		System.out.println("Hello ShuYi.");
		new Book();
	}

	Book() {
		System.out.println("书的构造方法");
		System.out.println("price=" + price + ",amount=" + amount);
	}

	{
		System.out.println("书的普通代码块");
	}

	int price = 110;

	static {
		System.out.println("书的静态代码块");
	}

	static int amount = 112;
}
