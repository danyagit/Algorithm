package com.xjf.algorithm.leetcode.suanfasixiang.dp;

//解码方法
public class FenGeZhengShu03 {

	public static void main(String[] args) {
		FenGeZhengShu03 fenGeZhengShu03 = new FenGeZhengShu03();
		int numDecodings = fenGeZhengShu03.numDecodings("2101");
		System.out.println(numDecodings);
	}
	//dp[i]表示s的0-i子串的组合方法数
	public int numDecodings(String s) {
		if (s == null || s.length() == 0 || s.charAt(0) == '0') {
			return 0;
		}
		int length = s.length();
		int dp[] = new int[length];
		dp[0] = 1;
		for (int i = 1; i < length; i++) {
			//"2101"这种
			if(s.charAt(i)!='0'&&s.charAt(i-1)=='0') {
				dp[i]=dp[i-1];
				continue;
			}
			int value = Integer.valueOf(s.substring(i - 1, i + 1));
			if(value>=1&&value<=26&&s.charAt(i)!='0') {
				if(i==1) {//防越界
					dp[i]=2;
					continue;
				}
				dp[i]=dp[i-1]+dp[i-2];
			}
			if(value>26||value<1) {
				dp[i]=dp[i-1];
			}
			if(s.charAt(i)=='0') {
				if(value>26||value<1) {
					return 0;
				}else {
					if(i==1) {//防越界
						dp[i]=1;
					}else {
						dp[i]=dp[i-2];
					}
				}
			}
		}
		return dp[length - 1];
	}
}
