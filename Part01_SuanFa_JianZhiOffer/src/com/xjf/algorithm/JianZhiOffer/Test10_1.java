package com.xjf.algorithm.JianZhiOffer;
//쳲���������
//��Ҷ�֪��쳲��������У�����Ҫ������һ������n��
//�������쳲��������еĵ�n���0��ʼ����0��Ϊ0����1����1����
//n<=39
//public class Solution {
//    public int Fibonacci(int n) {
//
//    }
//}
public class Test10_1 {

	public static void main(String[] args) {
		
	}
	
	public int Fibonacci(int n) {
		if(n==0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
		else {
			return Fibonacci(n-1)+Fibonacci(n-2);
		}
    }
	
}
