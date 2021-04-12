package com.xjf.singleton;

//懒汉式单例模式，按需初始化。但是带来了线程不安全的问题
public class LazySingleton {
	private static LazySingleton l;

	private LazySingleton() {

	}

	public static LazySingleton getInstance() {
		if (l == null) {
			l = new LazySingleton();
		}
		return l;
	}

}
