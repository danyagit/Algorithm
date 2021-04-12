package com.xjf.algorithm.leetcode.suanfasixiang.sousuo;
//岛屿的最大面积

public class DFS01 {

	public static void main(String[] args) {

	}
	int curMax=0;
	int max=0;
	public int maxAreaOfIsland(int[][] grid) {
		boolean[][]marked=new boolean[grid.length][grid[0].length];
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if(marked[i][j]==false&&grid[i][j]==1) {
					maxAreaHere(i,j,grid,marked);
					if(curMax>max) {
						max=curMax;
					}
					curMax=0;
				}
			}
		}
		return max;
	}

	private int maxAreaHere(int i, int j, int[][]grid,boolean[][] marked) {
		if(i<0||i>=grid.length||j<0||j>=grid[0].length) {
			return 0;
		}
		if(grid[i][j]==0||marked[i][j]==true) {
			return 0;
		}else {
			curMax++;
			marked[i][j]=true;
		}
		maxAreaHere(i+1,j,grid,marked);
		maxAreaHere(i,j+1,grid,marked);
		maxAreaHere(i,j-1,grid,marked);
		maxAreaHere(i-1,j,grid,marked);
		return curMax;
	}
	
}
