package com.xjf.algorithm.leetcode.suanfasixiang.dp;

//一和零。看官方PPT
/**
 * 这是一个二维的背包问题，学会画辅助图
 * @author xjf
 *
 */
public class ZeroOnePackage03 {

	public static void main(String[] args) {
	
	}
	//最多m个0，最多n个1
	public int findMaxForm(String[] strs, int m, int n) {
		int dp[][] = new int[m+1][n+1];
		for (String str : strs) {//遍历物品，逆序为dp赋值
			int numOfZero=countZero(str);
			int numOfOne = str.length()-numOfZero;
			for (int i = m; i >=numOfZero; i--) {
				for (int j = n; j >=numOfOne; j--) {
					dp[i][j] = Math.max(dp[i][j], dp[i - numOfZero][j - numOfOne] + 1);
				}
			}
		}
		return dp[m][n];
	}
	
	public int countZero(String str) {
		int numOfZero=0;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)=='0') {
				numOfZero++;
			}
		}
		return numOfZero;
	}
}
