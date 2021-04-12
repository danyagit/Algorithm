package com.bishi;

public class Exercise1411 {

	public static void main(String[] args) {
		int numOfWays = numOfWays(2);
		System.out.println(numOfWays);
	}

	public static int numOfWays(int n) {
		long a = 6;
		long b = 6;
		long temp = 0;
		while(n>1) {
			temp=a;
			a=(2*a)%1000000007l+(2*b)%1000000007l;
			b=(2*temp)%1000000007l+(3*b)%1000000007l;
			n--;
		}
		return (int) ((a+b)%1000000007l);
	}
}
