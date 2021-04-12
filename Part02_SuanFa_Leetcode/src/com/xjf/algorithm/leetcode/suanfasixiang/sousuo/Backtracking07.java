package com.xjf.algorithm.leetcode.suanfasixiang.sousuo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//组合
public class Backtracking07 {

	public static void main(String[] args) {
		Backtracking07 backtracking07 = new Backtracking07();
		List<List<Integer>> combine = backtracking07.combine(4, 2);
		System.out.println(combine);
	}
	public List<List<Integer>> combine(int n, int k) {
		List<Integer> list = new ArrayList<>();
		List<List<Integer>> result = new ArrayList<>();
		int[] array = new int[n];
		for (int i = 0; i < array.length; i++) {
			array[i]=i+1;
		}
		backtracking(list,result,array,k);
		return result;
    }
	private void backtracking(List<Integer> list, List<List<Integer>> result, int[] array, int k) {
		if(list.size()==k) {
			List<Integer> list1 = new ArrayList<>();
			for (Integer integer : list) {
				list1.add(integer);
			}
			result.add(list1);
			return;
		}
		
		for (int i = 0; i < array.length; i++) {
			list.add(array[i]);
			int[] copyOfRange = Arrays.copyOfRange(array, i+1, array.length);//只要后面的
			backtracking(list, result, copyOfRange, k);
			list.remove(list.size()-1);//剪枝
		}
	}
}
