package com.xjf.algorithm.JianZhiOffer;

//��һ�����Ӽ��ɶ�Σ�����ʹ��ÿ�εĳ��ȳ˻���󡣶�̬�滮
//n = 2
//return 1 (2 = 1 + 1)
//n = 10
//return 36 (10 = 3 + 3 + 4)
public class Test14 {

	public static void main(String[] args) {

	}

	public int cuttingRope(int n) {
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
