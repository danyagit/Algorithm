package com.xjf.algorithm.leetcodeUNDO;

public class Exercise42 {

	public static void main(String[] args) {

	}

	public int trap(int[] height) {
		if (height == null || height.length == 0) {
			return 0;
		}

		int len = height.length;

		// 左边最高的
		int[] dp1 = new int[len];

		// 右边最高的
		int[] dp2 = new int[len];
		dp1[0] = 0;
		for (int i = 1; i < len; i++) {
			dp1[i] = Math.max(dp1[i - 1], height[i - 1]);
		}

		dp2[len - 1] = 0;
		for (int i = len - 2; i >= 0; i--) {
			dp2[i] = Math.max(dp2[i + 1], height[i + 1]);
		}
		int sum = 0;
		for (int i = 0; i < len; i++) {
			int val = Math.min(dp1[i], dp2[i]) - height[i];
			if (val > 0)
				sum = sum + val;
		}

		return sum;
	}
}
