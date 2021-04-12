package com.xjf.factory;

public class Factory {
	public static Product makeProduct(String className) throws Exception {
		//���÷������Ľ�����ģʽ��
		Class<?> class1 = Class.forName(className);
		Product newInstance = (Product)class1.newInstance();
		return newInstance;
	}
}
