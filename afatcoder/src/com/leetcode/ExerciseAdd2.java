package com.leetcode;

public class ExerciseAdd2 {

	public static void main(String[] args) {

	}
	//求走k步回到0的方案数，length为元素个数
	public int backToOrigin(int k,int length) {
		//dp[i][j]表示i步走到j的方案数,显然，dp[i][j]=dp[i-1][j-1]+dp[i-1][j+1]
		int dp[][] = new int[k+1][length];
		dp[0][0]=1;
		for (int i = 1; i < length; i++) {
			dp[0][i]=0;
		}
		for (int i = 1; i < k+1; i++) {
			for (int j = 0; j < length; j++) {
				dp[i][j]=dp[i-1][(j-1+length)%length]+dp[i-1][(j+1)%length];
			}
		}
		return dp[k][0];
		
	}
}
