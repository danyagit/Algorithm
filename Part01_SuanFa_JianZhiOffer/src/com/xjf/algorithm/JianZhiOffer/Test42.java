package com.xjf.algorithm.JianZhiOffer;

//连续子数组的最大和:动态规划
//{6,-3,-2,7,-15,1,2,2},连续子向量的最大和为8(从第0个开始,到第3个为止)。
//(子向量的长度至少是1)
/**
 * 初识动态规划
 * 如何定义dp[i]的含义是最重要的
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
