package com.xjf.algorithm.leetcodeUNDO;

//最长回文子串
//此题无法用最长公共子序列的方法做
public class Exercise05 {

	public static void main(String[] args) {
		String longestPalindrome = Exercise05.longestPalindrome("cbbd");
		System.out.println(longestPalindrome);
	}
	//dp[i][j]表示从i到j是否为回文串
	public static String longestPalindrome(String s) {
		int len = s.length();
		boolean dp [][] = new boolean[len][len];
		String result = "";
		//dp左下角为true
		for (int i = 0; i < len; i++) {
			for (int j = 0; j <=i; j++) {
				dp[i][j]=true;
			}
		}
		for (int i = 0; i < len; i++) {
			for (int j = 0; j <= i; j++) {
				if(i==j) {
					dp[j][i]=true;
				}else {
					dp[j][i]=dp[j+1][i-1]&&s.charAt(i)==s.charAt(j);
				}
				if(dp[j][i]&&i-j+1>=result.length()) {
					result=s.substring(j,i+1);
				}
			}
		}
		return result;
	}

}
