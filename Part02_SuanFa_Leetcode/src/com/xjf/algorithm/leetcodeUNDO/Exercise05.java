package com.xjf.algorithm.leetcodeUNDO;

//������Ӵ�
//�����޷�������������еķ�����
public class Exercise05 {

	public static void main(String[] args) {
		String longestPalindrome = Exercise05.longestPalindrome("cbbd");
		System.out.println(longestPalindrome);
	}
	//dp[i][j]��ʾ��i��j�Ƿ�Ϊ���Ĵ�
	public static String longestPalindrome(String s) {
		int len = s.length();
		boolean dp [][] = new boolean[len][len];
		String result = "";
		//dp���½�Ϊtrue
		for (int i = 0; i < len; i++) {
			for (int j = 0; j <=i; j++) {
				dp[i][j]=true;
			}
		}
		for (int i = 0; i < len; i++) {
			for (int j = 0; j <= i; j++) {
				if(i==j) {
					dp[j][i]=true;
				}else {
					dp[j][i]=dp[j+1][i-1]&&s.charAt(i)==s.charAt(j);
				}
				if(dp[j][i]&&i-j+1>=result.length()) {
					result=s.substring(j,i+1);
				}
			}
		}
		return result;
	}

}
