package com.xjf.ch2;

public class Singleton {
	public Integer integer;
	public static int STATUS=1;
	private Singleton() {
		System.out.println(111);
	}
	public static Singleton instance=new Singleton();
	public static Singleton getSingleton() {
		return instance;
	}
	
	
}
