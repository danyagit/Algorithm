package com.xjf.algorithm.JianZhiOffer;

//����
//��ֻ����������2��3��5��������������Ugly Number����
//����6��8���ǳ�������14���ǣ���Ϊ������������7�� 
//ϰ�������ǰ�1�����ǵ�һ��������
//�󰴴�С�����˳��ĵ�N��������
/**
 * ��̬�滮 dp[i]��ʾ��i+1������
 * 
 * @author xjf
 *
 */
public class Test49 {

	public static void main(String[] args) {

	}

	public int GetUglyNumber_Solution(int index) {
		if (index == 0) {
			return 0;
		}
		int[] dp = new int[index];
		dp[0] = 1;
		int index2 = 0;
		int index3 = 0;
		int index5 = 0;
		for (int i = 1; i < dp.length; i++) {
			dp[i] = Math.min(Math.min(2 * dp[index2], 3 * dp[index3]), 5 * dp[index5]);
			if (dp[i] == 2 * dp[index2]) {
				index2++;
			}
			if (dp[i] == 3 * dp[index3]) {
				index3++;
			}
			if (dp[i] == 5 * dp[index5]) {
				index5++;
			}
		}
		return dp[index - 1];
	}
}
