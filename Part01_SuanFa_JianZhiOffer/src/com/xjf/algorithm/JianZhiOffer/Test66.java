package com.xjf.algorithm.JianZhiOffer;

//�����˻����飺��
//����һ������ A[0, 1,..., n-1]��
//�빹��һ������ B[0, 1,..., n-1]������ B �е�Ԫ�� 
//B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]��
//Ҫ����ʹ�ó�����
public class Test66 {

	public static void main(String[] args) {

	}

	public int[] multiply(int[] A) {
		int[] B = new int[A.length];
		for (int i = 0; i < A.length; i++) {
			B[i] = fun(A,i);
		}
		
		return B;
	}
	public int fun(int[]A,int index) {
		int mult=1;
		for (int i = 0; i < index; i++) {
			mult = mult*A[i];
		}
		for (int i = index+1; i < A.length; i++) {
			mult = mult*A[i];
		}
		return mult;
	}

}
