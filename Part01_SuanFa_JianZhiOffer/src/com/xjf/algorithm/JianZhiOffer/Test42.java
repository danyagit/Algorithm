package com.xjf.algorithm.JianZhiOffer;

//���������������:��̬�滮
//{6,-3,-2,7,-15,1,2,2},����������������Ϊ8(�ӵ�0����ʼ,����3��Ϊֹ)��
//(�������ĳ���������1)
/**
 * ��ʶ��̬�滮
 * ��ζ���dp[i]�ĺ���������Ҫ��
 * @author xjf
 *
 */
public class Test42 {

	public static void main(String[] args) {

	}

	public int FindGreatestSumOfSubArray(int[] array) {
		if(array==null||array.length==0) {
			return 0;
		}
		int[] dp = new int[array.length];
		dp[0]=array[0];
		
		for (int i = 1; i < array.length; i++) {
			if(dp[i-1]<=0) {
				dp[i]=array[i];
			}
			else {
				dp[i]=dp[i-1]+array[i];
			}
		}
		int max = dp[0];
		for (int i = 1; i < dp.length; i++) {
			if(dp[i]>max) {
				max=dp[i];
			}
		}
		
		return max;
	}

}
