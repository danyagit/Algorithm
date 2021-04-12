package com.leetcode;

public class ExerciseAdd2 {

	public static void main(String[] args) {

	}
	//����k���ص�0�ķ�������lengthΪԪ�ظ���
	public int backToOrigin(int k,int length) {
		//dp[i][j]��ʾi���ߵ�j�ķ�����,��Ȼ��dp[i][j]=dp[i-1][j-1]+dp[i-1][j+1]
		int dp[][] = new int[k+1][length];
		dp[0][0]=1;
		for (int i = 1; i < length; i++) {
			dp[0][i]=0;
		}
		for (int i = 1; i < k+1; i++) {
			for (int j = 0; j < length; j++) {
				dp[i][j]=dp[i-1][(j-1+length)%length]+dp[i-1][(j+1)%length];
			}
		}
		return dp[k][0];
		
	}
}
