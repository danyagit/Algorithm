package com.xjf.algorithm.leetcode.suanfasixiang.dp;

//零钱兑换 II
//dp[i]存放组合数。以前都是存的物品价值/重量这些
public class ZeroOnePackage05 {

	public static void main(String[] args) {
		ZeroOnePackage05 zeroOnePackage05 = new ZeroOnePackage05();
		int coins[] = { 1, 2, 5 };
		int change = zeroOnePackage05.change(5, coins);
		System.out.println(change);
	}

	public int change(int amount, int[] coins) {
		int dp[] = new int[amount + 1];
		dp[0] = 1;
		for (int i = 0; i < coins.length; i++) {
			for (int j = 1; j < dp.length; j++) {
				if (j >= coins[i]) {
					dp[j] = dp[j] + dp[j - coins[i]];
				}
			}
		}
		return dp[amount];
	}
}
