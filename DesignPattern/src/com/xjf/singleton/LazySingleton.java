package com.xjf.singleton;

//����ʽ����ģʽ�������ʼ�������Ǵ������̲߳���ȫ������
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
