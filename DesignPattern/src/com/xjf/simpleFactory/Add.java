package com.xjf.simpleFactory;

//�ӷ����������������������������޸ļӷ�������ʱ��ͼ��ˣ�����Լ����������Ӱ��
public class Add extends Operation {

	
	@Override
	public double getResult() {
		return getNumA()+getNumB();
	}

}
