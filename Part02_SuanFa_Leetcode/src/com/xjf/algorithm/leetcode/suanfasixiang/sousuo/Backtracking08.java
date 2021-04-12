package com.xjf.algorithm.leetcode.suanfasixiang.sousuo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//组合总和
public class Backtracking08 {

	public static void main(String[] args) {
		Backtracking08 backtracking08 = new Backtracking08();
		int []candidates = {2,3,6,7};
		int target = 7;
		List<List<Integer>> list = backtracking08.combinationSum(candidates, target);
		System.out.println(list);
	}

	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> result = new ArrayList<>();
		List<Integer> list = new ArrayList<>();
		backtracking(candidates,target,result,list);
		return result;
	}

	private void backtracking(int[] candidates, int target, List<List<Integer>> result, List<Integer> list) {
		if(sumOfList(list)==target) {
			List<Integer> list1 = new ArrayList<>();
			for (Integer integer : list) {
				list1.add(integer);
			}
			result.add(list1);
			return;
		}
		if(sumOfList(list)>target) {
			return;
		}
		//每一次循环会储存包含candidates[i]的所有组合
		for (int i = 0; i < candidates.length; i++) {
			list.add(candidates[i]);
			int[] copyOfRange = Arrays.copyOfRange(candidates, i, candidates.length);
			backtracking(copyOfRange, target, result, list);
			list.remove(list.size()-1);
		}
	}
	public int sumOfList(List<Integer> list) {
		int sum =0;
		for (int i = 0; i < list.size(); i++) {
			sum=sum+list.get(i);
		}
		return sum;
	}
	

}
