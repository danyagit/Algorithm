package com.xjf.adapter;
//��A����B
public class Adapter extends A {//��A
	B b = new B();//��B
	
	@Override
	public void getVoltage() {
		b.getChinaVoltage();
	}
}
