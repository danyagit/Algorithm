package com.xjf.algorithm.leetcode.suanfasixiang.sousuo;

//朋友圈
//[[1,0,0,1],[0,1,1,0],[0,1,1,1],[1,0,1,1]]
public class DFS03 {

	public static void main(String[] args) {

		DFS03 dfs03 = new DFS03();
		int[][] M = { { 1, 0, 0, 1 }, { 0, 1, 1, 0 }, { 0, 1, 1, 1 }, { 1, 0, 1, 1 } };
		int cnt = dfs03.findCircleNum(M);
		System.out.println(cnt);
	}

//	public void dfs(int[][] M, int[] visited, int i) {
//		for (int j = 0; j < M.length; j++) {
//			if (M[i][j] == 1 && visited[j] == 0) {
//				visited[j] = 1;
//				dfs(M, visited, j);
//			}
//		}
//	}
//
//	public int findCircleNum(int[][] M) {
//		int[] visited = new int[M.length];
//		int count = 0;
//		for (int i = 0; i < M.length; i++) {
//			if (visited[i] == 0) {
//				dfs(M, visited, i);
//				count++;
//			}
//		}
//		return count;
//	}
	public int findCircleNum(int[][] M) {
		int cnt = 0;
		//mark[]中每个元素代表一个同学
		int marked[] = new int[M.length];

		for (int i = 0; i < marked.length; i++) {
			if (marked[i] == 0) {
				mark(marked, M, i);// 标记i号同学的所有朋友为1
				cnt++;
			}
		}
		return cnt;
	}

	// 标记i号同学的所有朋友为1
	private void mark(int[] marked, int[][] M, int i) {
		marked[i] = 1;
		for (int j = 0; j < M.length; j++) {
			if (M[i][j] == 1 && marked[j] == 0) {
				mark(marked, M, j);
			}
		}
	}
}
