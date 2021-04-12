package com.xjf.algorithm.leetcode.suanfasixiang.sousuo;

//��Χ�Ƶ�����
/**
 * �ӱ�Ե��������marked�б�����б�ԵΪO��Ϊ1
 * ���ѡ��ΪO������1��
 * @author xjf
 */
public class DFS04 {

	public static void main(String[] args) {
		DFS04 dfs04 = new DFS04();
		char[][] board= {{'O','O'},{'O','O'}};
		dfs04.solve(board);
	}
	public void solve(char[][] board) {
		if(board==null||board.length==0) {
			return;
		}
		int marked[][]=new int[board.length][board[0].length];
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				//�ӱ�Ե����
				if(marked[i][j]==0&&board[i][j]=='O'&&(i==board.length-1||j==board[0].length-1||i==0||j==0)) {
					mark(marked,board,i,j);
				}
			}
		}
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if(board[i][j]=='O'&&marked[i][j]==0) {
					board[i][j]='X';
				}
			}
		}
    }
	private void mark(int[][] marked, char[][] board, int i, int j) {
		if(i<0||j<0||i>=board.length||j>=board[0].length||board[i][j]=='X'||marked[i][j]==1) {
			return;
		}
		marked[i][j]=1;
		mark(marked,board,i+1,j);
		mark(marked,board,i,j+1);
		mark(marked,board,i-1,j);
		mark(marked,board,i,j-1);
	}
}
