package com.xjf.algorithm.leetcode.suanfasixiang.sousuo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//子集 II（可能包含重复元素）
public class Backtracking12 {

	public static void main(String[] args) {
		Backtracking12 backtracking12 = new Backtracking12();
		int[] nums= {1,2,2};
		List<List<Integer>> list = backtracking12.subsetsWithDup(nums);
		System.out.println(list);
	}

	public List<List<Integer>> subsetsWithDup(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
		List<Integer> list = new ArrayList<>();
		result.add(new ArrayList<Integer>());
		Arrays.sort(nums);
		// i表示子集的长度，可以从0取到nums.length
		for (int i = 1; i <= nums.length; i++) {
			backtracking(result, list, nums, i);
		}
		return result;
	}

	private void backtracking(List<List<Integer>> result, List<Integer> list, int[] nums, int i) {
		if (list.size() == i) {
			result.add(new ArrayList<Integer>(list));
			return;
		}
		for (int j = 0; j < nums.length; j++) {
			if(j!=0&&nums[j]==nums[j-1]) {//比上一题多了个判断，但前提是要排个序
				continue;
			}
			list.add(nums[j]);
			int[] copyOfRange = Arrays.copyOfRange(nums, j + 1, nums.length);
			backtracking(result, list, copyOfRange, i);
			list.remove(list.size() - 1);// 剪枝
		}
	}
}
