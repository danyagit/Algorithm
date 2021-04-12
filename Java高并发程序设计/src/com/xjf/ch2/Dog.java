package com.xjf.ch2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Dog implements Animal {
	@Override
	public void run() {
		System.out.println("π∑≈‹");
	}
	
	public static void main(String[] args) {
//		Animal dog = new Dog();
//		dog.run();
		ExecutorService  es = Executors.newFixedThreadPool(1);
	}
}
