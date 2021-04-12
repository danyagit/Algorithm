package com.xjf.algorithm.leetcode.suanfasixiang.dp;

//���������Ʊʱ�����䶳��
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
			 * dp[4][0]��ʾ:�ڵ��������֮����Ȼ���й�Ʊ�����,���������֮����������.�����ǵ��������,Ҳ������ǰһ���Ѿ����е�.
			 * �������dp[3][2]-prices[4]����dp[3][0]
			 * dp[4][1]��ʾ:�ڵ��������֮��,����䶳�ڵ����,���������֮����������.������ǵ���������,ǰһ��϶����й�Ʊ,��ʱ�����������dp[3][0]+prices[4]
			 * dp[4][2]��ʾ:�ڵ��������֮��,δ�����䶳�ڶ���û���й�Ʊ�����,���������֮����������.���,�������Ǹչ��䶳��,Ҳ�����Ǻ�ǰһ��һ��,��ʱ�����������:
			 * dp[3][2]����dp[3][1]
			 */
			dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][2] - prices[i]);
			dp[i][1] = dp[i - 1][0] + prices[i];
			dp[i][2] = Math.max(dp[i - 1][1], dp[i - 1][2]);
		}
		return Math.max(dp[length - 1][1], dp[length - 1][2]);
	}
}
