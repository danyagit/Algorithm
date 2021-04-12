package com.leetcode;

public class Exercise560 {

	public static void main(String[] args) {

	}

	// ˫��for����ÿ��Ԫ��Ϊ�ұ߽磬�����ҡ�
	public int subarraySum(int[] nums, int k) {
		int count = 0;
		for (int start = 0; start < nums.length; ++start) {
			int sum = 0;
			for (int end = start; end >= 0; --end) {
				sum += nums[end];
				if (sum == k) {
					count++;
				}
			}
		}
		return count;
	}
}