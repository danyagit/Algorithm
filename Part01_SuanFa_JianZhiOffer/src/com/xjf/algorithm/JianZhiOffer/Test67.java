package com.xjf.algorithm.JianZhiOffer;

//���ַ���ת��������
//��һ���ַ���ת����һ��������Ҫ����ʹ���ַ���ת�������Ŀ⺯����
//��ֵΪ0�����ַ�������һ���Ϸ�����ֵ�򷵻�0
public class Test67 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int StrToInt(String str) {
		if(str==null||str.length()==0) {
			return 0;
		}
		
		int num=0;
		for (int i = 0; i < str.length(); i++) {
			if(i==0&&(str.charAt(i)=='+'||str.charAt(i)=='-')) {
				continue;
			}
			if(str.charAt(i)<'0'||str.charAt(i)>'9') {//�ж�����
				return 0;
			}else {
				num=num*10+str.charAt(i)-'0';//�ַ�ת����
			}
		}
		if(str.charAt(0)=='+') {
			return num;
		}else if(str.charAt(0)=='-') {
			return -num;
		}
		return num;
	}

}
