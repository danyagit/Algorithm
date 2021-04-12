package com.xjf.singleton;

public class HungrySingleton {
	//类加载时就初始化这个值
	private static final HungrySingleton h = new HungrySingleton();

	//私有的构造器，供属性使用
	private HungrySingleton() {

	}
	
	public static HungrySingleton getInstance() {
		return h;
	}
}
