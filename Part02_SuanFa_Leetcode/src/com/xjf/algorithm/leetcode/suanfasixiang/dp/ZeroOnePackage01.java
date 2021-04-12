package com.xjf.algorithm.leetcode.suanfasixiang.dp;

//分割等和子集
/**
 * 本题是0-1背包问题 
 * 关于什么是0-1背包问题：
 * https://www.jianshu.com/p/a66d5ce49df5
 * 此题的区别就是，需要背包恰好能装满。
 * 那就先按最大的装，看dp的最后一个元素是不是等于背包大小
 *
 */
public class ZeroOnePackage01 {

	public static void main(String[] args) {
		ZeroOnePackage01 zeroOnePackage01 = new ZeroOnePackage01();
		int[] nums = { 1, 2, 3, 4 };
		boolean canPartition = zeroOnePackage01.canPartition(nums);
		System.out.println(canPartition);
	}

	public boolean canPartition(int[] nums) {
		int sum = sumOfArray(nums);
		if (sum % 2 != 0) {
			return false;
		}
		// 如果能在nums中提取若干个元素，其和为sum/2，说明可以
		//可以看成一个背包大小为 sum/2 的 0-1 背包问题。
		int packageSize = sum / 2;
		//改进做法,遍历物品，逆序为dp赋值，以后0-1背包问题都这样做。
		int dp[]=new int[packageSize+1];
		for (int i = 1; i < nums.length; i++) {
			int curNum=nums[i-1];
			for (int j = packageSize; j >=1; j--) {
				if(j>=curNum) {
					dp[j]=Math.max(dp[j], curNum+dp[j-curNum]);
				}
			}
		}
		if(dp[packageSize]==packageSize) {
			return true;
		}
		
		return false;
		
		//原做法
//		int dp[][] = new int[nums.length][packageSize];
//		for (int i = 0; i < packageSize; i++) {
//			if (i + 1 >= nums[0]) {
//				dp[0][i] = nums[0];
//			}
//		}//0-1背包问题只需要看dp[i-1][j]，即它头上那个元素。
//		
//		
//		for (int i = 1; i < nums.length; i++) {
//			for (int j = 0; j < packageSize; j++) {
//				if (j + 1 < nums[i]) {
//					dp[i][j] = dp[i - 1][j];
//				} else if (j + 1 == nums[i]) {
//					dp[i][j] = nums[i];
//				} else {
//					dp[i][j] = Math.max(dp[i - 1][j], nums[i] + dp[i - 1][j - nums[i]]);
//				}
//			}
//		}
//		if (dp[nums.length - 1][packageSize - 1] == packageSize) {
//			return true;
//		}
//
//		return false;
	}

	public int sumOfArray(int[] nums) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum = sum + nums[i];
		}
		return sum;
	}
}
