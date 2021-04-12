package com.xjf.algorithm.leetcode.suanfasixiang.dp;

//打家劫舍
/**
 * dp[i]表示打劫到i时得到的最大金钱(i一定被打劫的时候)
 * @author xjf
 *
 */
public class FeiBoNaQi02 {
	public static void main(String[] args) {
		int[]nums= {1,2,3,1};
		FeiBoNaQi02 feiBoNaQi02 = new FeiBoNaQi02();
		int rob = feiBoNaQi02.rob(nums);
		System.out.println(rob);
	}

	public int rob(int[] nums) {
		if(nums==null||nums.length==0) {
			return 0;
		}
		if(nums.length==1) {
			return nums[0];
		}
		if(nums.length==2) {
			return Math.max(nums[0], nums[1]);
		}
		int dp[]=new int[nums.length];
		dp[0]=nums[0];
		dp[1]=nums[1];
		dp[2]=nums[0]+nums[2];
		for (int i = 3; i < dp.length; i++) {
			dp[i]=Math.max(dp[i-2]+nums[i], dp[i-3]+nums[i]);
		}
		return Math.max(dp[dp.length-1], dp[dp.length-2]);
	}
}
