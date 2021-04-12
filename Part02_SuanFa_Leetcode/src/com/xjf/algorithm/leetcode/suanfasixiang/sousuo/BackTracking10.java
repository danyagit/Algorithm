package com.xjf.algorithm.leetcode.suanfasixiang.sousuo;
//����ܺ� III

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BackTracking10 {

	public static void main(String[] args) {
		BackTracking10 backTracking10 = new BackTracking10();
		List<List<Integer>> list = backTracking10.combinationSum3(3, 7);
		System.out.println(list);
	}


	public List<List<Integer>> combinationSum3(int k, int n) {
		List<List<Integer>> result = new ArrayList<>();
		List<Integer> list = new ArrayList<>();
		int sum = 0;
		int[] candidates = new int[9];
		for (int i = 0; i < candidates.length; i++) {
			candidates[i]=i+1;
		}
		backtracking(k, n, result, list, sum, candidates);
		return result;
	}
	/**
	 * @param k
	 * @param n
	 * @param result
	 * @param list
	 * @param sum
	 * @param candidates ����1-9
	 */
	private void backtracking(int k, int n, List<List<Integer>> result, List<Integer> list, int sum, int[] candidates) {
		
		if(list.size()==k&&sum==n) {
			result.add(new ArrayList<Integer>(list));
			return;
		}
		
		if(list.size()==k) {
			return;
		}
		
		for (int i = 0; i < candidates.length; i++) {
			list.add(candidates[i]);
			sum=sum+candidates[i];
			int[] copyOfRange = Arrays.copyOfRange(candidates, i+1, candidates.length);
			backtracking(k, n, result, list, sum, copyOfRange);
			//���ˣ���û��Ҫ�����ˣ���ǰ��������Ч����ʱ�䡣ע��ҲҪ��֦��
			if(list.size()==k&&sum>=n) {
				sum=sum-candidates[i];
				list.remove(list.size()-1);
				return;
			}
			//��֦
			sum=sum-candidates[i];
			list.remove(list.size()-1);
		}
		
	}
}
