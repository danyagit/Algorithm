package com.xjf.algorithm.leetcodeUNDO;

public class Exercise55 {

	public static void main(String[] args) {
		int nums[] = {2,3,1,1,4};
		System.out.println(Exercise55.canJump(nums));
	}
	
	//贪心思想，在纸上画好图再写
	public static boolean canJump(int[] nums) {
		int preLongest = nums[0];
		for (int i = 1; i < nums.length-1; i++) {
			if(preLongest<i) {
				return false;
			}
			preLongest = Math.max(preLongest, i+nums[i]);
		}
		return preLongest>=nums.length-1;
	}

}
