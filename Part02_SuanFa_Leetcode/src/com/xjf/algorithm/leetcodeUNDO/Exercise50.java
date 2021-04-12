package com.xjf.algorithm.leetcodeUNDO;

public class Exercise50 {

	public static void main(String[] args) {

	}

	public double myPow(double x, int n) {
		double res = 1;
		if(n==0) {
			return 1;
		}
		if(n>0) {
			for (int i = 0; i < n; i++) {
				res = res * x;
			}
		}else {
			for (int i = 0; i < -n; i++) {
				res = res * x;
			}
			res = 1/res;
		}
		
		
		return res;
	}
}
