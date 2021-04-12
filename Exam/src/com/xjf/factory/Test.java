package com.xjf.factory;

public class Test {

	public static void main(String[] args) throws Exception {
		Product makeProduct = Factory.makeProduct("com.xjf.factory.Product2");
		makeProduct.fun();
	}
}
