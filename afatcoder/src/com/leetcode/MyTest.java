package com.leetcode;

import java.util.Stack;

import org.junit.Test;

public class MyTest {
	
	@Test
	public void test04() {
//		Integer.valueOf("21474836460");
//		2147483647
//		21474836460
		System.out.println(Integer.MAX_VALUE);
		
	}
	
	@Test
	public void test03() {
		String substring = "11111".substring(0, 3);
		System.out.println(substring);
		
	}
	
	@Test
	public void test02() {
		Integer valueOf = Integer.valueOf("-1111");
		System.out.println(valueOf);
		
	}

	@Test
	public void test01() {
		int[] nums = { 1, 2, 5, 6, 3, 4, 7 };
		QuickSort02(nums);
//		quickSort(nums);
		System.out.println(1);
	}

	public void quickSort(int[] nums) {
		QuickSort(nums, 0, nums.length - 1);
	}

	// 非递归实现,用栈来保存左右端点（即递归中的另外两个参数）
	private void QuickSort02(int[] nums) {
		int left = 0;
		int right = nums.length - 1;
		Stack<Integer> stack = new Stack<>();
		stack.push(right);
		stack.push(left);
		while (!stack.isEmpty()) {
			left = stack.pop();
			right=stack.pop();
			int index = getIndex(nums, left, right);
			if(index-1>left) {
				stack.push(index-1);
				stack.push(left);
			}
			if(right>index+1) {
				stack.push(right);
				stack.push(index+1);
			}
		}
	}

	// 递归实现:
	private void QuickSort(int[] nums, int start, int end) {
		if (start >= end) {
			return;
		}
		int index = getIndex(nums, start, end);
		if (index > start)
			QuickSort(nums, start, index - 1);
		if (index < end)
			QuickSort(nums, index + 1, end);
	}

	private int getIndex(int[] nums, int start, int end) {
		int pivot = nums[start];
		while (start < end) {
			while (start < end && nums[end] >= pivot) {
				end--;
			}
			nums[start] = nums[end];
			while (start < end && nums[start] <= pivot) {
				start++;
			}
			nums[end] = nums[start];
		}
		nums[start] = pivot;
		return start;
	}

}
