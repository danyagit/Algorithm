package com.xjf.ch2;

public class Test01 {

	public static void main(String[] args) {
		//获得cpu数量
		int availableProcessors = Runtime.getRuntime().availableProcessors();
		System.out.println(availableProcessors);
		
	}
}
