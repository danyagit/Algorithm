package com.xjf.algorithm.leetcode.suanfasixiang.dp;
//零钱兑换
/**
 * 和前三题不一样的是，本题的物品是可重复使用的，属于完全背包问题。
 * 解答此类问题的方法是，将以前的逆序遍历物品换为顺序遍历。
 * 
 *普通的背包问题为什么要逆序遍历呢？
 *因为普通的背包问题如果从前往后遍历dp，那么dp中前面的数据总会领先后面，在为后面的数赋值的时候，前面的数据就不能用了。
 *而逆序遍历可以保证dp数组中前面的数据总是上一轮的，是可以用的。
 *
 *完全背包问题为什么要顺序遍历呢? TODO
 *
 */
public class ZeroOnePackage04 {

	public static void main(String[] args) {
		ZeroOnePackage04 zeroOnePackage04 = new ZeroOnePackage04();
		int[]coins= {1,2,5};
		int coinChange = zeroOnePackage04.coinChange(coins, 11);
		System.out.println(coinChange);
	}
	public int coinChange(int[] coins, int amount) {
	    if (amount == 0 || coins == null) return 0;
	    int[] dp = new int[amount + 1];
	    for (int coin : coins) {
	        for (int i = coin; i <= amount; i++) { //将逆序遍历改为正序遍历
	            if (i == coin) {
	                dp[i] = 1;
	            } else if (dp[i] == 0 && dp[i - coin] != 0) {
	                dp[i] = dp[i - coin] + 1;

	            } else if (dp[i - coin] != 0) {
	                dp[i] = Math.min(dp[i], dp[i - coin] + 1);
	            }
	        }
	    }
	    return dp[amount] == 0 ? -1 : dp[amount];
	}
}
