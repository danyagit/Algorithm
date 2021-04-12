package com.xjf.algorithm.JianZhiOffer;

//礼物的最大价值
//在一个 m*n 的棋盘的每一个格都放有一个礼物，
//每个礼物都有一定价值（大于 0）。从左上角开始拿礼物，
//每次向右或向下移动一格，直到右下角结束。
//给定一个棋盘，求拿到礼物的最大价值。例如，对于如下棋盘
/**
 * 动态规划.
 * 如何定义dp[i][j]的含义是最重要的
 * 此处dp[i][j]的意思是如果走到(i,j)的时刻，最大值是多少
 * 
 * @author xjf
 *
 */
public class Test47 {
	public static void main(String[] args) {

	}
	public int getMost(int[][] board) {
		int [][] dp = new int[board.length][board[0].length];
		dp[0][0]=board[0][0];
		for (int i = 1; i < dp.length; i++) {
			dp[0][i]=board[0][i]+dp[0][i-1];
		}
		for (int i = 1; i < dp[0].length; i++) {
			dp[i][0]=board[i][0]+dp[i-1][0];
		}
		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[0].length; j++) {
				dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1])+board[i][j];
			}
		}
		return dp[dp.length-1][dp[0].length-1];
    }
}
