package com.xjf.algorithm.leetcode.suanfasixiang.paixu;

import java.util.PriorityQueue;

//颜色分类
//给定一个包含红色、白色和蓝色，一共 n 个元素的数组，原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
//此题中，我们使用整数 0、 1 和 2 分别表示红色、白色和蓝色。
//注意:
//不能使用代码库中的排序函数来解决这道题。
//输入: [2,0,2,1,1,0]
//输出: [0,0,1,1,2,2]

/**
 * TODO 这样做时间太久，还得看看别人的方法
 * @author xjf
 *
 */
public class Test04 {

	public static void main(String[] args) {

	}

	public void sortColors(int[] nums) {
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		for (int i = 0; i < nums.length; i++) {
			queue.add(nums[i]);
		}
		int i=0;
		while(!queue.isEmpty()) {
			nums[i]=queue.poll();
			i++;
		}
	}
}