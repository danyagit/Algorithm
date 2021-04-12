package com.xjf.algorithm.leetcode.suanfasixiang.dp;
//等差数列划分
public class ShuZuQuJian02 {

	public static void main(String[] args) {
		ShuZuQuJian02 shuZuQuJian02 = new ShuZuQuJian02();
		int[]A= {1,2,3,4};
		int numberOfArithmeticSlices = shuZuQuJian02.numberOfArithmeticSlices(A);
		System.out.println(numberOfArithmeticSlices);
	}
	public int numberOfArithmeticSlices(int[] A) {
		if(A==null||A.length<3) {
			return 0;
		}
		int dp[]=new int [A.length];
		dp[0]=0;
		dp[1]=0;
		if(A[2]-A[1]==A[1]-A[0]) {
			dp[2]=1;
		}else {
			dp[2]=0;
		}
		for (int i = 3; i < A.length; i++) {
			if(A[i]-A[i-1]==A[i-1]-A[i-2]) {
				dp[i]=dp[i-1]+1;
			}else {
				dp[i]=0;
			}
		}
		int sumOfdp=0;
		for (int i : dp) {
			sumOfdp=sumOfdp+i;
		}
		return sumOfdp;
    }
}
