package com.xjf.algorithm.leetcode.suanfasixiang.erfen;

//寻找旋转排序数组中的最小值
//假设按照升序排序的数组在预先未知的某个点上进行了旋转。
//例如，数组 [0,1,2,4,5,6,7] 可能变为 [4,5,6,7,0,1,2] 。
//请找出其中最小的元素。
//示例 1：
//输入：nums = [3,4,5,1,2]
//输出：1
public class Test05 {

	public static void main(String[] args) {
		
		
	}

	public int findMin(int[] nums) {
		int left=0;
		int right = nums.length-1;
		int mid=0;
		while(right-left>1) {
			mid=(left+right)/2;
			if(nums[mid]>nums[right]) {
				left=mid;
			}
			else {
				right=mid;
			}
		}
		if(nums[left]>nums[right]) {
			return nums[right];
		}else return nums[left];
	}
}
