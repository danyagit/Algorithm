package com.xjf.algorithm.JianZhiOffer;

//���������ֵ
//��һ�� m*n �����̵�ÿһ���񶼷���һ�����
//ÿ�����ﶼ��һ����ֵ������ 0���������Ͻǿ�ʼ�����
//ÿ�����һ������ƶ�һ��ֱ�����½ǽ�����
//����һ�����̣����õ����������ֵ�����磬������������
/**
 * ��̬�滮.
 * ��ζ���dp[i][j]�ĺ���������Ҫ��
 * �˴�dp[i][j]����˼������ߵ�(i,j)��ʱ�̣����ֵ�Ƕ���
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
