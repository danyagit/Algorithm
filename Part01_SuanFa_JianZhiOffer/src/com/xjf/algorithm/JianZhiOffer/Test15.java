package com.xjf.algorithm.JianZhiOffer;

//��������1�ĸ���������ת�� ���뷴��ԭ�� ��ѧ
//����һ���������������32λ�����Ʊ�ʾ��1�ĸ��������и����ò����ʾ��
//public class Solution {
//    public int NumberOf1(int n) {
//
//    }
//}
public class Test15 {

	public static void main(String[] args) {
		System.out.println(NumberOf1(7));
	}

	public static int NumberOf1(int n) {
		int cnt = 0;
		while (n != 0) {
			cnt++;
			//λ����&�����¶���1����1.�����n��ʮ���ƵĻ��Զ�ת��Ϊ�����ƽ���λ����
			//n��n-1����λ����&��Ч��������һ��1
			n &= (n - 1);
		}
		return cnt;
	}
}
