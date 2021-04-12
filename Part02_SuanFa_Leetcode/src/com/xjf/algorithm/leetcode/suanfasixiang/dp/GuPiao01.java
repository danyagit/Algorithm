package com.xjf.algorithm.leetcode.suanfasixiang.dp;

//最佳买卖股票时机含冷冻期
public class GuPiao01 {

	public static void main(String[] args) {

	}

	public int maxProfit(int[] prices) {
		if (prices.length == 0) {
			return 0;
		}

		int length = prices.length;
		int dp[][] = new int[length][3];

		dp[0][0] = -prices[0];
		for (int i = 1; i < length; i++) {
			/**
			 * dp[4][0]表示:在第四天操作之后依然持有股票的情况,第四天操作之后最大的收益.可能是第四天买的,也可能是前一天已经持有的.
			 * 因此它是dp[3][2]-prices[4]或者dp[3][0]
			 * dp[4][1]表示:在第四天操作之后,变成冷冻期的情况,第四天操作之后最大的收益.因此它是第四天卖的,前一天肯定持有股票,此时的最大收益是dp[3][0]+prices[4]
			 * dp[4][2]表示:在第四天操作之后,未处于冷冻期而且没持有股票的情况,第四天操作之后最大的收益.因此,它可能是刚过冷冻期,也可能是和前一天一样,此时的最大收益是:
			 * dp[3][2]或者dp[3][1]
			 */
			dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][2] - prices[i]);
			dp[i][1] = dp[i - 1][0] + prices[i];
			dp[i][2] = Math.max(dp[i - 1][1], dp[i - 1][2]);
		}
		return Math.max(dp[length - 1][1], dp[length - 1][2]);
	}
}
