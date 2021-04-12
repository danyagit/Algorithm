package com.xjf.adapter;

public class Test {

	public static void main(String[] args) {
		A a = new Adapter();
		a.getVoltage();//实际上是调的B的getChinaVoltage
	}

}
