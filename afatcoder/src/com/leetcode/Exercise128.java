package com.leetcode;

public class Exercise128 {

	public static void main(String[] args) {

	}
	
	//考虑时间复杂度为O(N)：用hashset存储全部，遍历set：如果set包含当前元素-1那个元素，那么它肯定不是最长序列的首位元素。
	//因此，只考虑set不包含当前元素-1那个元素的情况。一直找 减一是否存在。
	
	//如果不考虑时间的话，排序就行
	public int longestConsecutive(int[] nums) {
		
		return 0;
	}
}
