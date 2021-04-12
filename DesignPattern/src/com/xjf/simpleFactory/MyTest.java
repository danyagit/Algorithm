package com.xjf.simpleFactory;

public class MyTest {

	public static void main(String[] args) {
		Operation operation = OperationFactory.getOperation('+');
		operation.setNumA(5);
		operation.setNumB(6);
		System.out.println(operation.getResult());
	}

}
