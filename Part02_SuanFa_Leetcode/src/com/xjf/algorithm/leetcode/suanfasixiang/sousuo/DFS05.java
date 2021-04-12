package com.xjf.algorithm.leetcode.suanfasixiang.sousuo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//太平洋大西洋水流问题
public class DFS05 {

	public static void main(String[] args) {
		DFS05 dfs05 = new DFS05();
		int[][] matrix = { { 1, 2, 2, 3, 5 }, { 3, 2, 3, 4, 4 }, { 2, 4, 5, 3, 1 }, { 6, 7, 1, 4, 5 },
				{ 5, 1, 1, 2, 4 } };
		List<List<Integer>> list = dfs05.pacificAtlantic(matrix);
		System.out.println(list);
	}

	private int m, n;
	private int[][] matrix;
	private int[][] direction = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };

	public List<List<Integer>> pacificAtlantic(int[][] matrix) {
		List<List<Integer>> ret = new ArrayList<>();
		if (matrix == null || matrix.length == 0) {
			return ret;
		}

		m = matrix.length;
		n = matrix[0].length;
		this.matrix = matrix;
		boolean[][] canReachP = new boolean[m][n];//能到达太平洋
		boolean[][] canReachA = new boolean[m][n];//能到达大西洋

		for (int i = 0; i < m; i++) {
			//从左边这条边第一个元素出去的都标记一下，从左边这条边第二个元素出去的都标记一下。。。。
			dfs(i, 0, canReachP);
			//从右边这条边第一个元素出去的都标记一下，从右边这条边第二个元素出去的都标记一下。。。。
			dfs(i, n - 1, canReachA);
		}
		for (int i = 0; i < n; i++) {
			//从上边这条边第一个元素出去的都标记一下，从上边这条边第二个元素出去的都标记一下。。。。
			dfs(0, i, canReachP);
			//从下边这条边第一个元素出去的都标记一下，从下边这条边第二个元素出去的都标记一下。。。。
			dfs(m - 1, i, canReachA);
		}

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (canReachP[i][j] && canReachA[i][j]) {
					ret.add(Arrays.asList(i, j));
				}
			}
		}

		return ret;
	}

	private void dfs(int r, int c, boolean[][] canReach) {
		if (canReach[r][c]) {
			return;
		}
		canReach[r][c] = true;
		for (int[] d : direction) {
			int nextR = d[0] + r;
			int nextC = d[1] + c;
			if (nextR < 0 || nextR >= m || nextC < 0 || nextC >= n || matrix[r][c] > matrix[nextR][nextC]) {

				continue;
			}
			dfs(nextR, nextC, canReach);
		}
	}
}
