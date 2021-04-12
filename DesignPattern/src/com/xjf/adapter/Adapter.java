package com.xjf.adapter;
//是A还有B
public class Adapter extends A {//是A
	B b = new B();//有B
	
	@Override
	public void getVoltage() {
		b.getChinaVoltage();
	}
}
