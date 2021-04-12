package com.xjf.algorithm.leetcode.suanfasixiang.dp;

//最小路径和
public class JuZhenLujing01 {

	public static void main(String[] args) {
		int[][]grid= {{1,2,3},{4,5,6}};
		JuZhenLujing01 juZhenLujing01 = new JuZhenLujing01();
		int minPathSum = juZhenLujing01.minPathSum(grid);
		System.out.println(minPathSum);
	}

	public int minPathSum(int[][] grid) {
		int[][]mark = new int[grid.length][grid[0].length];
		mark[0][0]=grid[0][0];
		for (int i = 1; i < mark[0].length; i++) {
			mark[0][i]=mark[0][i-1]+grid[0][i];
		}
		for (int i = 1; i < mark.length; i++) {
			mark[i][0]=mark[i-1][0]+grid[i][0];
		}
		for (int i = 1; i < mark.length; i++) {
			for (int j = 1; j < mark[0].length; j++) {
				mark[i][j]=Math.min(mark[i-1][j], mark[i][j-1])+grid[i][j];
			}
		}
		return mark[mark.length-1][mark[0].length-1];
	}
}
