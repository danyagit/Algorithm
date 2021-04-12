package com.xjf.algorithm.leetcode.suanfasixiang.dp;

//最长公共子序列
//"bsbininm"
//"jmjkbkjkv"
/**
 * 二维数组的动态规划，
 * 用到dp[i-1][j - 1]，dp[i][j - 1]， dp[i-1][j]
 * 对角线的也可能用到
 * @author xjf
 *不一定是连续的！！！！！！！
 */
public class ZuiChangGongGong01 {

	public static void main(String[] args) {
		ZuiChangGongGong01 zuiChangGongGong01 = new ZuiChangGongGong01();
		String text1 = "abc";
		String text2 = "cef";
		int longestCommonSubsequence = zuiChangGongGong01.longestCommonSubsequence(text1, text2);
		System.out.println(longestCommonSubsequence);
	}

	public int longestCommonSubsequence(String text1, String text2) {
		int length1 = text1.length();
		int length2 = text2.length();
		char[] array1 = text1.toCharArray();
		char[] array2 = text2.toCharArray();
		int dp[][] = new int[length1][length2];
		for (int i = 0; i < length2; i++) {
			if (i >= 1 && dp[0][i - 1] == 1) {
				dp[0][i] = 1;
				continue;
			}
			if (array1[0] != array2[i]) {
				continue;
			}
			if (array1[0] == array2[i]) {
				dp[0][i] = 1;
			}
		}
		for (int i = 0; i < length1; i++) {
			if (i >= 1 && dp[i - 1][0] == 1) {
				dp[i][0] = 1;
				continue;
			}
			if (array1[i] != array2[0]) {
				continue;
			}
			if (array1[i] == array2[0]) {
				dp[i][0] = 1;
			}
		}
		for (int i = 1; i < length1; i++) {
			for (int j = 1; j < length2; j++) {
				if (array1[i] == array2[j]) {
					dp[i][j] = dp[i-1][j - 1] + 1;//理解
				} else {
					dp[i][j] = Math.max(dp[i][j - 1], dp[i-1][j]);//理解
				}
			}
		}
		return dp[length1 - 1][length2 - 1];
	}
}
