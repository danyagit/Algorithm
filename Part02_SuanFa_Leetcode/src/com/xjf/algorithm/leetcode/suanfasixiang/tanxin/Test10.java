package com.xjf.algorithm.leetcode.suanfasixiang.tanxin;
//最大子序和

//给定一个整数数组 nums ，找到一个具有最大和的连续子数组
//（子数组最少包含一个元素），返回其最大和。

//示例:
//输入: [-2,1,-3,4,-1,2,1,-5,4]
//输出: 6
//解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
/**
 * 有点难度，值得细品
 * @author xjf
 *
 */

public class Test10 {

	public static void main(String[] args) {

	}

	public int maxSubArray(int[] nums) {
		int max = nums[0];
		int curMax = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if(curMax<0&&curMax<nums[i]) {
				curMax=nums[i];
			}else {
				curMax=curMax+nums[i];
			}
			if(curMax>max) {
				max=curMax;
			}
		}
		return max;
	}
}
