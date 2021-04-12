package com.xjf.algorithm.leetcode.suanfasixiang.dp;
//最长上升子序列
/**
 * 和下一题很像，只是少了个排序
 * @author xjf
 *
 */
public class ZuiChangDiZeng01 {

	public static void main(String[] args) {
		
		ZuiChangDiZeng01 zuiChangDiZeng01 = new ZuiChangDiZeng01();
		int []nums= {10,9,2,5,3,7,101,18};
//		int []nums= {0,1,0,3,2,3};
		int lengthOfLIS = zuiChangDiZeng01.lengthOfLIS(nums);
		System.out.println(lengthOfLIS);
	}

	public int lengthOfLIS(int[] nums) {
		if(nums==null||nums.length==0) {
			return 0;
		}
		int length = nums.length;
		if(length==1) {
			return 1;
		}
		int dp[]=new int[length];
		dp[0]=1;
		int max=0;
		for (int i = 1; i < dp.length; i++) {
			int curMax=0;
			dp[i]=1;
			for (int j = 0; j < i; j++) {
				if(nums[j]<nums[i]) {
					if(dp[j]>curMax) {
						curMax=dp[j];
					}
				}
			}
			dp[i]=curMax+1;
			if(dp[i]>max) {
				max=dp[i];
			}
		}
		return max;
	}
}
