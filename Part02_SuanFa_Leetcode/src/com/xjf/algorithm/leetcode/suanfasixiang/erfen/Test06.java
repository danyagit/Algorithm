package com.xjf.algorithm.leetcode.suanfasixiang.erfen;

//在排序数组中查找元素的第一个和最后一个位置
//给定一个按照升序排列的整数数组 nums，和一个目标值 target。
//找出给定目标值在数组中的开始位置和结束位置。
//你的算法时间复杂度必须是 O(log n) 级别。
//如果数组中不存在目标值，返回 [-1, -1]。
//示例 1:
//输入: nums = [5,7,7,8,8,10], target = 8
//输出: [3,4]
public class Test06 {
	public static void main(String[] args) {
		Test06 test06 = new Test06();
		int[] nums = { 5, 7, 7, 8, 8, 10 };
		int[] range = test06.searchRange(nums, 8);
		System.out.println(range);
	}

	public int[] searchRange(int[] nums, int target) {
		int leftIndex = -1;
		int rightIndex = -1;
		int result[] = { -1, -1 };
		if(nums==null||nums.length==0) {
			return result;
		}
		int left = 0;
		int right = nums.length - 1;
		int mid = 0;
		int mid1 = 0;
		while (right - left > 1) {
			mid = (right + left) / 2;
			if (nums[mid] > target) {
				right = mid;
			} else {
				left = mid;
			}
		}
		if (nums[left] == target) {
			mid1 = left;
		} else if (nums[right] == target){
			mid1 = right;
		}else {
			return result;
		}

		while (mid1 >= 0) {
			if (nums[mid1] != target) {
				break;
			}
			mid1--;
		}
		leftIndex = ++mid1;
		while (mid1 < nums.length) {
			if (nums[mid1] != target) {
				break;
			}
			mid1++;
		}
		rightIndex = mid1-1;
		result[0] = leftIndex;
		result[1] = rightIndex;
		return result;
	}
}
