package com.xjf.algorithm.leetcode.suanfasixiang.sousuo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//全排列 II
public class Backtracking06 {

	public static void main(String[] args) {
		Backtracking06 backtracking06 = new Backtracking06();
		int[] nums = { 1, 1, 2 };
		List<List<Integer>> list = backtracking06.permuteUnique(nums);
		System.out.println(list);
	}


	/**
	 * 暴力法，在上一题的基础上，最后再排除相同的
	 */
	int length=0;
	public List<List<Integer>> permuteUnique(int[] nums) {
		length=nums.length;
		List<Integer> list = new ArrayList<>();
		List<List<Integer>> result = new ArrayList<>();
		List<List<Integer>> result1 = new ArrayList<>();
		backTracking(nums, list, result);
		for (int i = 0; i < result.size(); i++) {
			result1.add(result.get(i));
			for (int j = i+1; j < result.size(); j++) {
				if(result.get(i).equals(result.get(j))) {
					result1.remove(result1.size()-1);
					break;
				}
			}
		}

		return result1;
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
