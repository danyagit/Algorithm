package com.xjf.algorithm.leetcode.suanfasixiang.sousuo;

//单词搜索
public class BackTracking03 {

	public static void main(String[] args) {
		BackTracking03 backTracking03 = new BackTracking03();

		char[][] board = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
		String word = "ABCCED";
		boolean exist = backTracking03.exist(board, word);
		System.out.println(exist);
	}

	public int[][] dir = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };

	public boolean exist(char[][] board, String word) {
		int[][] marked = new int[board.length][board[0].length];
		char[] array = word.toCharArray();
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (judgeExist(i, j, marked, board, array, 0)) {
					return true;
				}
			}
		}
		return false;
	}
	/**
	 * @param i 坐标
	 * @param j 坐标
	 * @param marked 标记数组 
	 * @param board 
	 * @param array
	 * @param curLen 当前拼接的字符串长度。若等于单词长度，则可以。
	 * @return
	 */
	private boolean judgeExist(int i, int j, int[][] marked, char[][] board, char[] array, int curLen) {
		if (curLen == array.length) {
			return true;
		}
		if (i >= board.length || j >= board[0].length || i < 0 || j < 0 || marked[i][j] == 1
				|| board[i][j] != array[curLen]) {
			return false;
		}

		marked[i][j] = 1;
		//这个跟return||还不一样，那个一定会返回结果，这个如果错误就不会返回结果
		for (int[] d : dir) {
			if (judgeExist(i + d[0], j + d[1], marked, board, array, curLen+1)) {
				return true;
			}
		}
		marked[i][j] = 0;//剪枝(即回溯，反悔)：对于每个节点都要剪枝。而且是判断四个方向都不行之后，这样也不用重新传入心得标记数组了。

		return false;

	}
}
