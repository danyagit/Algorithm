package com.xjf.algorithm.JianZhiOffer;

//��һ��ֻ����һ�ε��ַ�:
//��һ���ַ���(0<=�ַ�������<=10000��ȫ������ĸ���)��
//�ҵ���һ��ֻ����һ�ε��ַ�,����������λ��, ���û���򷵻� -1
//����Ҫ���ִ�Сд��.����0��ʼ������
public class Test50 {

	public static void main(String[] args) {

	}
	//hashmap������������
	
	
	public int FirstNotRepeatingChar(String str) {
        char[] array = str.toCharArray();
        for(int i =0;i<array.length;i++) {
        	for(int j =0;j<array.length;j++) {
        		if(array[j]==array[i]&&i!=j) {
        			break;
        		}
        		if(j==array.length-1) {
        			return i;
        		}
        	}
        }
		return -1;
    }

}
