package com.xjf.algorithm.leetcodeUNDO;

public class Exercise36 {

	public static void main(String[] args) {

	}

	public boolean isValidSudoku(char[][] board) {
		// 横向校验
		for (int i = 0; i < 9; i++) {
			boolean[] mark = new boolean[10];
			for (int j = 0; j < board.length; j++) {
				if(board[i][j]=='.') continue;
				if (mark[board[i][j]-'0']) {
					return false;
				}
				mark[board[i][j]-'0'] = true;
			}
		}

		// 纵向校验
		for (int i = 0; i < 9; i++) {
			boolean[] mark = new boolean[10];
			for (int j = 0; j < board.length; j++) {
				if(board[j][i]=='.') continue;
				if (mark[board[j][i]-'0']) {
					return false;
				}
				mark[board[j][i]-'0'] = true;
			}
		}
		
		//校验3*3
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if(!judge(board,i,j)) {
					return false;
				}
			}
		}
		
		return true;
	}

	private boolean judge(char[][] board, int i, int j) {
		boolean[] mark = new boolean[10];
		for (int a = 0; a < 3; a++) {
			for (int b = 0; b < 3; b++) {
				if(board[3*i+a][3*j+b]=='.') continue;
				if(mark[board[3*i+a][3*j+b]-'0']) {
					return false;
				}
				mark[board[3*i+a][3*j+b]-'0']=true;
			}
		}
		return true;
	}

}
