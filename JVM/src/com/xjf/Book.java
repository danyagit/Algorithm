package com.xjf;

public class Book {
	public static void main(String[] args) {
		//��ʼ��˳����ĳ�ʼ�������������Ĵ���顣��static���Σ�������ĳ�ʼ��
		System.out.println("Hello ShuYi.");
		new Book();
	}

	Book() {
		System.out.println("��Ĺ��췽��");
		System.out.println("price=" + price + ",amount=" + amount);
	}

	{
		System.out.println("�����ͨ�����");
	}

	int price = 110;

	static {
		System.out.println("��ľ�̬�����");
	}

	static int amount = 112;
}
