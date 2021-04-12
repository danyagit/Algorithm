package com.xjf.algorithm.leetcode.suanfasixiang.sousuo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//全排列
//输入: [1,2,3]
//输出:
//[
//  [1,2,3],
//  [1,3,2],
//  [2,1,3],
//  [2,3,1],
//  [3,1,2],
//  [3,2,1]
//]
public class Backtracking05 {

	public static void main(String[] args) {
		Backtracking05 backtrackin05 = new Backtracking05();
		int[] nums = { 1, 2, 3 };
		List<List<Integer>> list = backtrackin05.permute(nums);
		System.out.println(list);
	}
	int length=0;
	public List<List<Integer>> permute(int[] nums) {
		length=nums.length;
		List<Integer> list = new ArrayList<>();
		List<List<Integer>> result = new ArrayList<>();
		backTracking(nums, list, result);

		return result;
	}

	private void backTracking(int[] nums, List<Integer> list, List<List<Integer>> result) {
		if (list.size() == this.length) {
			List<Integer> list1 = new ArrayList<>();
			for (Integer val:list) {
				list1.add(val);
			}
			result.add(list1);//这里必须new一个list进行对拷，否则传入result的list会变
			return;
		}
		for (int i = 0; i < nums.length; i++) {
			list.add(nums[i]);
			int[] copyOfRange1 = Arrays.copyOfRange(nums, i + 1, nums.length);
			int[] copyOfRange2 = Arrays.copyOfRange(nums, 0, i);
			int[] concat =concatTwoArrays(copyOfRange1, copyOfRange2);
			backTracking(concat, list, result);
			list.remove(list.size() - 1);//剪枝，回溯
		}

	}
	private int[] concatTwoArrays(int[]a,int[]b) {
		int c[] = new int[a.length+b.length];
		System.arraycopy(a, 0, c, 0, a.length);
		System.arraycopy(b, 0, c, a.length, b.length);
		return c;
	}
}
