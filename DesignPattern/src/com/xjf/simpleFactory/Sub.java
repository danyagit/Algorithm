package com.xjf.simpleFactory;
//����������
public class Sub extends Operation {
	@Override
	public double getResult() {
		return getNumA() - getNumB();
	}

}
