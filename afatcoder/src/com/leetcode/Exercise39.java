package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Exercise39 {

	public static void main(String[] args) {
		Exercise39 exercise39 = new Exercise39();
		int[] candidates = {2,3,6,7};
		List<List<Integer>> combinationSum = exercise39.combinationSum(candidates, 7);
		System.out.println(combinationSum);
	}

	List<List<Integer>> result = new ArrayList<>();
	int target;
	int[] candidates;

	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		this.target = target;
		this.candidates = candidates;
		List<Integer> list = new ArrayList<>();
		backtracking(list, 0, 0);
		return result;
	}

	private void backtracking(List<Integer> list, int i, int sum) {
		if(sum==target) {
			result.add(new ArrayList<>(list));
			return;
		}
		for (int j = i; j < candidates.length; j++) {
			// 一定包含candidates[j]，不包含j前面
			sum = sum + candidates[j];
			if (sum > target) {
				sum = sum - candidates[j];
				continue;
			}
			list.add(candidates[j]);
			backtracking(list, j, sum);
			//剪枝，sum也要剪枝！！
			list.remove(list.size()-1);
			sum = sum - candidates[j];
		}
	}

}
