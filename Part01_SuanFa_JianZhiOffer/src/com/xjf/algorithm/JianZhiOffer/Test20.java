package com.xjf.algorithm.JianZhiOffer;

//��ʾ��ֵ���ַ�����������ʽ
//��ʵ��һ�����������ж��ַ����Ƿ��ʾ��ֵ������������С������
//���磬�ַ���"+100","5e2","-123","3.1416"��"-1E-16"����ʾ��ֵ�� 
//����"12e","1a3.14","1.2.3","+-5"��"12e+4.3"�����ǡ�
//public class Solution {
//    public boolean isNumeric(char[] str) {
//        
//    }
//}

/**
 * ƥ�����֣���ȫ�ǿ���������ʽ���㶮����������ʽ�ʼ�
 * @author xjf
 *
 */

public class Test20 {

	public static void main(String[] args) {

	}

	public boolean isNumeric(char[] str) {
		if (str == null || str.length == 0)
			return false;
		return new String(str).matches("[+-]?\\d*(\\.\\d+)?([eE][+-]?\\d+)?");
	}

}
