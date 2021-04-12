package com.xjf.algorithm.leetcode.suanfasixiang.dp;
//爬楼梯
/**
 * dp[i]表示爬上i层楼梯的方法数
 * 理解：分情况讨论，第一次上一层或者上两层
 * @author xjf
 *
 */
public class FeiBoNaQi01 {
	public static void main(String[] args) {

	}

	public int climbStairs(int n) {
		if(n==1) {
			return 1;
		}
		int[] dp = new int[n+1];
		dp[1]=1;
		dp[2]=2;
		for (int i = 3; i < n+1; i++) {
			dp[i]=dp[i-1]+dp[i-2];
		}
		return dp[n];
	}
}
