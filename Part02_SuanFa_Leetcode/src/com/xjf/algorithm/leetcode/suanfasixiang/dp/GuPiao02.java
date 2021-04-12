package com.xjf.algorithm.leetcode.suanfasixiang.dp;
//买卖股票的最佳时机含手续费
public class GuPiao02 {

	public static void main(String[] args) {

	}

	public int maxProfit(int[] prices, int fee) {
		int length = prices.length;
		int[][]dp = new int[length][2];
		//dp[i][0]表示第i+1天持有股票的最大收益
		//dp[i][1]表示第i+1天未持有股票的最大收益
		dp[0][0]=-prices[0];
		dp[0][1]=0;
		int max=0;
		for (int i = 1; i < dp.length; i++) {
			dp[i][0]=Math.max(dp[i-1][0], dp[i-1][1]-prices[i]);
			dp[i][1]=Math.max(dp[i-1][1], dp[i-1][0]-fee+prices[i]);
			max=Math.max(max, dp[i][1]);
		}
		return max;
    }
}
