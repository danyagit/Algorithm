package com.xjf.simpleFactory;

//加法运算器，与减法运算器解耦，将来修改加法方法的时候就简单了，不会对减法代码产生影响
public class Add extends Operation {

	
	@Override
	public double getResult() {
		return getNumA()+getNumB();
	}

}
