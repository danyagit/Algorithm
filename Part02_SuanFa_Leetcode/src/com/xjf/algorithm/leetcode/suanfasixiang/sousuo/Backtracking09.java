package com.xjf.algorithm.leetcode.suanfasixiang.sousuo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//组合总和 II
public class Backtracking09 {

	public static void main(String[] args) {
		Backtracking09 backtracking09 = new Backtracking09();
		int target=8;
		int[]candidates= {10,1,2,7,6,1,5};
		List<List<Integer>> list = backtracking09.combinationSum2(candidates, target);
		System.out.println(list);
	}
	public List<List<Integer>> combinationSum2(int[] candidates, int target) {
		List<List<Integer>> result = new ArrayList<>();
		List<Integer> list = new ArrayList<>();
		Arrays.sort(candidates);
		backtracking(candidates,target,list,result,0);
		return result;

	}
	//专门拿个sum储存当前和，和求数组的和相比，会大大减少时间
	private void backtracking(int[] candidates, int target, List<Integer> list, List<List<Integer>> result,int sum) {
		if(sum==target) {
			ArrayList<Integer> list2 = new ArrayList<>(list);//数组拷贝
			result.add(list2);
			return;
		}
		
		for (int i = 0; i < candidates.length; i++) {
			if(i!=0&&candidates[i]==candidates[i-1]) {
				continue;
			}
			list.add(candidates[i]);
			int[] copyOfRange = Arrays.copyOfRange(candidates, i+1, candidates.length);
			sum=sum+candidates[i];
			if(sum>target) {//提前剪枝
				list.remove(list.size()-1);
				sum=sum-candidates[i];
				continue;
			}
			backtracking(copyOfRange, target, list, result,sum);
			//剪枝
			sum=sum-candidates[i];
			list.remove(list.size()-1);
		}
	}
	
	
}
