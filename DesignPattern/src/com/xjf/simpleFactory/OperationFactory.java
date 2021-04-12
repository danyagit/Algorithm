package com.xjf.simpleFactory;
//工厂，生产计算器，传入操作符来决定生产什么样的计算器。
public class OperationFactory {
	public static Operation getOperation(Character a) {
		Operation op = null;
		switch (a) {
		case '+':
			op = new Add();//用到了多态
			break;
		case '-':
			op = new Sub();
			break;
		}
		return op;
	}
}
