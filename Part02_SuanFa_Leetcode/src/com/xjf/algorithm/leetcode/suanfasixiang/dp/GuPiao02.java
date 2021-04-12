package com.xjf.algorithm.leetcode.suanfasixiang.dp;
//������Ʊ�����ʱ����������
public class GuPiao02 {

	public static void main(String[] args) {

	}

	public int maxProfit(int[] prices, int fee) {
		int length = prices.length;
		int[][]dp = new int[length][2];
		//dp[i][0]��ʾ��i+1����й�Ʊ���������
		//dp[i][1]��ʾ��i+1��δ���й�Ʊ���������
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
