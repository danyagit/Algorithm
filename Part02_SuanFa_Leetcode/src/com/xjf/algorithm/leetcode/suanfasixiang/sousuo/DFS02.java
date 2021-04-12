package com.xjf.algorithm.leetcode.suanfasixiang.sousuo;

//岛屿数量
//和上题差不多
public class DFS02 {
	public static void main(String[] args) {

	}
	int cnt=0;
	public int numIslands(char[][] grid) {
		boolean[][]marked=new boolean[grid.length][grid[0].length];
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if(grid[i][j]=='1'&&marked[i][j]==false) {
					cnt++;
					markThisIsland(i,j,grid,marked);
				}

			}
		}
		
		return cnt;
	}

	private void markThisIsland(int i, int j, char[][] grid, boolean[][] marked) {
		if(i<0||i>=grid.length||j<0||j>=grid[0].length) {
			return;
		}
		if(grid[i][j]=='0'||marked[i][j]==true) {
			return;
		}else {
			marked[i][j]=true;
		}
		markThisIsland(i+1,j,grid,marked);
		markThisIsland(i,j+1,grid,marked);
		markThisIsland(i,j-1,grid,marked);
		markThisIsland(i-1,j,grid,marked);
	}
}
