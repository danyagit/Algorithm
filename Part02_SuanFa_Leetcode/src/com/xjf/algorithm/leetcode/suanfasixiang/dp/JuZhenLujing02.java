package com.xjf.algorithm.leetcode.suanfasixiang.dp;

//²»Í¬Â·¾¶
public class JuZhenLujing02 {

	public static void main(String[] args) {
	}

	public int uniquePaths(int m, int n) {
		int [][]mark=new int[n][m];
		for (int i = 0; i < m; i++) {
			mark[0][i]=1;
		}
		for (int i = 0; i < n; i++) {
			mark[i][0]=1;
		}
		for (int i = 1; i < n; i++) {
			for (int j = 1; j < m; j++) {
				mark[i][j]=mark[i-1][j]+mark[i][j-1];
			}
		}
		return mark[n-1][m-1];
	}
}
