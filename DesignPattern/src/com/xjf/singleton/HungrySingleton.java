package com.xjf.singleton;

public class HungrySingleton {
	//�����ʱ�ͳ�ʼ�����ֵ
	private static final HungrySingleton h = new HungrySingleton();

	//˽�еĹ�������������ʹ��
	private HungrySingleton() {

	}
	
	public static HungrySingleton getInstance() {
		return h;
	}
}
