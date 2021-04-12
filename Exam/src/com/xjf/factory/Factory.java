package com.xjf.factory;

public class Factory {
	public static Product makeProduct(String className) throws Exception {
		//利用反射来改进工厂模式，
		Class<?> class1 = Class.forName(className);
		Product newInstance = (Product)class1.newInstance();
		return newInstance;
	}
}
