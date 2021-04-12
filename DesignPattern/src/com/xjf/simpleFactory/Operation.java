package com.xjf.simpleFactory;

//加、减法运算器的父类。也是生产者返回的类型。客户端通过set方法传入要计算的值
public class Operation {
	private double numA;
	private double numB;
	
	public double getResult() {
		return 0;
	}
	public double getNumA() {
		return numA;
	}

	public void setNumA(double numA) {
		this.numA = numA;
	}

	public double getNumB() {
		return numB;
	}

	public void setNumB(double numB) {
		this.numB = numB;
	}


}
