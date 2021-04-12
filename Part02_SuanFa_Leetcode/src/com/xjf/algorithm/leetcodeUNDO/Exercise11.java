package com.xjf.algorithm.leetcodeUNDO;
//盛最多水的容器

/**
 * 双指针，难想
 *此题和双指针还不一样
 */
public class Exercise11 {

	public static void main(String[] args) {

	}

	public int maxArea(int[] height) {
		int left = 0,right = height.length-1;
		int max = 0;
		while(left<right) {
			max=Math.max(Math.min(height[right],height[left])*(right-left), max);	
			if(height[right]<=height[left]) {
				right--;
			}else{
				left++;
			}
		}
		return max;
	}
}
