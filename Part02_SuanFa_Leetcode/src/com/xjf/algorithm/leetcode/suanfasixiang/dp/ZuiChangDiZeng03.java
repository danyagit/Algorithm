package com.xjf.algorithm.leetcode.suanfasixiang.dp;
//摆动序列
//跟前面的两题也很像
public class ZuiChangDiZeng03{
	public static void main(String[] args) {
		ZuiChangDiZeng03 zuiChangDiZeng03 = new ZuiChangDiZeng03();
//		int[] nums={1,2,3,4,5,6,7,8,9};
//		int[] nums={3,3,3,2,5};
		int[] nums={0,0,0};
		int wiggleMaxLength = zuiChangDiZeng03.wiggleMaxLength(nums);
		System.out.println(wiggleMaxLength);
	}
	public int wiggleMaxLength(int[] nums) {
		if(nums==null||nums.length==0) {
			return 0;
		}
		if(nums.length<=2) {
			return 1;
		}
		int dp[]=new int[nums.length];
		int mark[]=new int[nums.length];
		dp[0]=1;
		if(nums[1]==nums[0]) {
			dp[1]=1;
			mark[1]=1;
		}else if(nums[1]>nums[0]) {
			dp[1]=2;
			mark[1]=1;
		}else {
			dp[1]=2;
			mark[1]=0;
		}
		int max=0;
		for (int i = 2; i < nums.length; i++) {
			dp[i]=1;
			int max1=0;
			int max2=0;
			for (int j = 0; j < i; j++) {
				if(mark[j]==0) {//比上一个小
					if(nums[i]>nums[j]) {
						max1=dp[j]>max1?dp[j]:max1;
					}
				}
				if(mark[j]==1) {//比上一个大
					if(nums[i]<nums[j]) {
						max2=dp[j]>max2?dp[j]:max2;
					}
				}
			}
			//遍历i前面的元素，在最大的基础上加一得到dp[i]，跟前两题很像，只是此处要分两种情况
			if(max1>max2) {
				dp[i]=max1+1;
				mark[i]=1;
			}else if(max1<max2) {
				dp[i]=max2+1;
				mark[i]=0;
			}
			if(dp[i]>max) {
				max=dp[i];
			}
		}
		return max;
    }
	
		
	
}
