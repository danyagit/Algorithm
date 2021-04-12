package com.xjf.algorithm.leetcode.suanfasixiang.dp;

//һ���㡣���ٷ�PPT
/**
 * ����һ����ά�ı������⣬ѧ�ử����ͼ
 * @author xjf
 *
 */
public class ZeroOnePackage03 {

	public static void main(String[] args) {
	
	}
	//���m��0�����n��1
	public int findMaxForm(String[] strs, int m, int n) {
		int dp[][] = new int[m+1][n+1];
		for (String str : strs) {//������Ʒ������Ϊdp��ֵ
			int numOfZero=countZero(str);
			int numOfOne = str.length()-numOfZero;
			for (int i = m; i >=numOfZero; i--) {
				for (int j = n; j >=numOfOne; j--) {
					dp[i][j] = Math.max(dp[i][j], dp[i - numOfZero][j - numOfOne] + 1);
				}
			}
		}
		return dp[m][n];
	}
	
	public int countZero(String str) {
		int numOfZero=0;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)=='0') {
				numOfZero++;
			}
		}
		return numOfZero;
	}
}
