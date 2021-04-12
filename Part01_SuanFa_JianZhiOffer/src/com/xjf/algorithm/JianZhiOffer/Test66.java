package com.xjf.algorithm.JianZhiOffer;

//构建乘积数组：简单
//给定一个数组 A[0, 1,..., n-1]，
//请构建一个数组 B[0, 1,..., n-1]，其中 B 中的元素 
//B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。
//要求不能使用除法。
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
