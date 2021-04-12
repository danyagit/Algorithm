package com.xjf.thinkingInJava;

public class TestString {
	private final int value[]= { 1, 2, 4 } ;
//	public TestString(int a[]) {
//		value=a;
//	}
	public void change(int a) {
		value[2] = a;
	}

	public static void main(String[] args) {
		TestString test = new TestString();
		
		System.out.println(test.value[2]);
		test.change(5);
		System.out.println(test.value[2]);
	}

}
