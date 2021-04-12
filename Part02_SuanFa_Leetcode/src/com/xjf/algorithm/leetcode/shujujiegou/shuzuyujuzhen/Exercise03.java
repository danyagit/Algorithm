package com.xjf.algorithm.leetcode.shujujiegou.shuzuyujuzhen;

//485. 最大连续1的个数
public class Exercise03 {

	public static void main(String[] args) {

	}

	public int findMaxConsecutiveOnes(int[] nums) {
		int longest = 0;
		int cur = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				cur++;
			} else {
				if (cur > longest) {
					longest = cur;
				}
				cur = 0;
			}
		}
		if(cur>longest) {
			longest= cur;
		}
		return longest;
	}
}
