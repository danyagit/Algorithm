package com.xjf.algorithm.leetcodeUNDO;

public class Exercise45 {
	// 跳跃游戏：此题别想复杂了，从右往左，找到最长的即为上一次应该在的点
	public static void main(String[] args) {

	}

	public int jump(int[] nums) {
		int len = nums.length;
		int i = len - 1;
		int cnt = 0;
		while (i >= 0) {
			for (int j = 0; j < i; j++) {
				// 从左往右遍历保证是最远的
				if (nums[j] + j >= i) {
					i = j;
					cnt++;
					break;
				}
			}
		}
		return cnt;
	}
}
