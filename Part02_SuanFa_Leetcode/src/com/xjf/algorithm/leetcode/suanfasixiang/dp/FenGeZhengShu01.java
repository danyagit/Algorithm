package com.xjf.algorithm.leetcode.suanfasixiang.dp;

//�������
//dp[i]��ʾ��i���֮������˻�
public class FenGeZhengShu01 {

	public static void main(String[] args) {
	}

	public int integerBreak(int n) {
		int dp[] = new int[n + 1];
		// dp[i]��ʾ��i���֮������˻�,dp[1]��0�����Դ�dp[2]��ʼ
		for (int i = 2; i < dp.length; i++) {
			// j���ܴ�2��ʼ����Ϊ2������1+1�����ܲ���
			for (int j = 1; j < i; j++) {
				dp[i] = Math.max(dp[i], Math.max(j * (i - j), j * dp[i - j]));
			}
		}
		return dp[n];
	}
}
