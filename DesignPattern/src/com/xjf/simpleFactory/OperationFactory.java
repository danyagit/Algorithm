package com.xjf.simpleFactory;
//�������������������������������������ʲô���ļ�������
public class OperationFactory {
	public static Operation getOperation(Character a) {
		Operation op = null;
		switch (a) {
		case '+':
			op = new Add();//�õ��˶�̬
			break;
		case '-':
			op = new Sub();
			break;
		}
		return op;
	}
}
