package com.leetcode;

public class Exercise268 {

	public static void main(String[] args) {

	}

	public int missingNumber(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] < nums.length) {
				swap(nums,i,nums[i]);
			}
		}
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]!=i) {
				return i;
			}
		}
		return 0;
	}

	private void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i]=nums[j];
		nums[j]=temp;
	}
	
	
}
