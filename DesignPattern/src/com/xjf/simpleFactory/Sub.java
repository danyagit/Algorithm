package com.xjf.simpleFactory;
//¼õ·¨ÔËËãÆ÷
public class Sub extends Operation {
	@Override
	public double getResult() {
		return getNumA() - getNumB();
	}

}
