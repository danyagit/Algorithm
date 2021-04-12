package com.xjf.algorithm.leetcode.suanfasixiang.tanxin;

//非递减数列
//给你一个长度为 n 的整数数组，请你判断在 最多 改变 1 个元素的情况下，
//该数组能否变成一个非递减数列。
//我们是这样定义一个非递减数列的： 对于数组中所有的 i (0 <= i <= n-2)，
//总满足 nums[i] <= nums[i + 1]。
//
//示例 1:
//输入: nums = [4,2,3]
//输出: true
//解释: 你可以通过把第一个4变成1来使得它成为一个非递减数列。

public class Test09 {

	public static void main(String[] args) {

	}

	public boolean checkPossibility(int[] nums) {
		int cnt=0;
		for (int i = 0; i < nums.length-1; i++) {
			if(nums[i]<=nums[i+1]) {
				continue;
			}
			else {
				if(i==0) {
					nums[i]=nums[i+1];
					cnt++;
					continue;
				}
				if(nums[i+1]>=nums[i-1]) {
					nums[i]=nums[i+1];
					cnt++;
				}else {
					nums[i+1]=nums[i];
					cnt++;
				}
				if(cnt>=2) {
					return false;
				}
			}
		}
		
		return true;
	}
}
