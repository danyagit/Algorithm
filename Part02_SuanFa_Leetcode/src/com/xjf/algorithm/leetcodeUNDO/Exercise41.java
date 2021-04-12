package com.xjf.algorithm.leetcodeUNDO;

import java.util.Arrays;

public class Exercise41 {

	public static void main(String[] args) {
		int[] nums= {0};
		int firstMissingPositive = Exercise41.firstMissingPositive(nums);
		System.out.println(firstMissingPositive);
	}

	public static int firstMissingPositive(int[] nums) {
		Arrays.sort(nums);
		int first = getFirstPositive(nums);
		if(nums.length ==0||first==-1||nums[first]!=1) return 1;
		int pre = 1;
		for (int i = first+1; i < nums.length; i++) {
			if(nums[i]-pre>1) {return pre+1;}//这一步是关键
			pre=nums[i];
		}
		return nums[nums.length-1]+1;
	}

	private static int getFirstPositive(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]>0) return i;
		}
		return -1;
	}
}
