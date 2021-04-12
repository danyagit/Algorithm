package com.xjf.algorithm.JianZhiOffer;

//把一根绳子剪成多段，并且使得每段的长度乘积最大。动态规划
//n = 2
//return 1 (2 = 1 + 1)
//n = 10
//return 36 (10 = 3 + 3 + 4)
public class Test14 {

	public static void main(String[] args) {

	}

	public int cuttingRope(int n) {
		int dp[] = new int[n + 1];
		// dp[i]表示将i拆分之后的最大乘积,dp[1]是0，所以从dp[2]开始
		for (int i = 2; i < dp.length; i++) {
			// j不能从2开始，因为2必须拆成1+1，不能不拆
			for (int j = 1; j < i; j++) {
				dp[i] = Math.max(dp[i], Math.max(j * (i - j), j * dp[i - j]));
			}
		}
		return dp[n];
	}

}
