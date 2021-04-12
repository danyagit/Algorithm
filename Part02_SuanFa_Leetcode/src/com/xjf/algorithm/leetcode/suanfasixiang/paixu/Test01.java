package com.xjf.algorithm.leetcode.suanfasixiang.paixu;

import java.util.Arrays;
import java.util.PriorityQueue;

//数组中的第K个最大元素
//在未排序的数组中找到第 k 个最大的元素。请注意，
//你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。
//示例 1:输入: [3,2,1,5,6,4] 和 k = 2 输出: 5
//示例 2:输入: [3,2,3,1,2,4,5,5,6] 和 k = 4输出: 4
//说明:你可以假设 k 总是有效的，且 1 ≤ k ≤ 数组的长度。

/**
 * 快速排序法：
 * 参数：
 * 	int left:左端点，而且以此端点作为分割数组的值。
 * 	int right：右端点。
 * 左指针（从left+1开始）与nums[left]比较，找到第一个比nums[left]大的，停止，
 * 右指针（从right开始）与nums[left]比较，找到第一个比nums[left]小的，停止
 * 这两个都停止了，交换这两的位置。
 * 左右指针相遇，结束本次循环。
 * 到最后就能让nums[left]这一个值位于排序的正确位置，左边的值都小于等于它，右边的值都大于等于它。
 * 	int nums:
 * @author xjf
 *
 */
public class Test01 {
	public static void main(String[] args) {
		Test01 test01 = new Test01();
		int nums[]= {3,2,1,5,6,4};
		int kthLargest = test01.findKthLargest(nums, 6);
		System.out.println(kthLargest);
	}

	// 方法一：暴力排序法
	/*
	 * public int findKthLargest(int[] nums, int k) { Arrays.sort(nums); return
	 * nums[nums.length-k]; }
	 */

	// 方法二：优先队列PriorityQueue
//	public int findKthLargest(int[] nums, int k) {
//		PriorityQueue<Integer> queue = new PriorityQueue<>();
//		int i = 0;
//		while (i < nums.length) {
//			queue.add(nums[i]);
//			if (queue.size() == k + 1) {
//				queue.poll();
//			}
//			i++;
//		}
//		return queue.peek();
//	}
	//方法三：快速排序法：找到第k个最大的元素
	public int findKthLargest(int[] nums, int k) {
		int length = nums.length;
		int left=0;
		int right=nums.length-1;
		while(left<right) {
			int index=partition(nums, left, right);
			if(index==length-k) {
				break;
			}
			if(index>length-k) {
				right=index-1;
				continue;
			}
			if(index<length-k) {
				left=index+1;
				continue;
			}
		}
		return nums[length-k];
	}

	// left作为左区间左端点，同时此处也将它作为分割元素,right作为右区间右端点
	public int partition(int[] array, int left, int right) {
		int myLeft = left + 1;
		while (myLeft <= right) {
			if (array[myLeft] <= array[left]) {
				myLeft++;
			}
			if (array[right] >= array[left]) {
				right--;
			}
			//注意这儿还要判断！！
			if(myLeft > right) {
				break;
			}
			if (array[myLeft] > array[left] && array[right] < array[left]) {
				swap(array, myLeft, right);
				myLeft++;
				right--;
			}
		}
		swap(array, left, right);
		return right;
	}

	private void swap(int[] array, int i, int j) {
		int third = array[i];
		array[i] = array[j];
		array[j] = third;
	}
}
