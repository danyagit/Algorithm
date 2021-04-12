package com.xjf.algorithm.JianZhiOffer;

import java.util.ArrayList;

//和为S的两个数字:双指针
//输入一个递增排序的数组和一个数字S，
//在数组中查找两个数，使得他们的和正好是S，
//如果有多对数字的和等于S，输出两个数的乘积最小的。
public class Test57_1 {

	public static void main(String[] args) {
		int[] array = new int[] { 1, 2, 4, 7, 11, 15 };
		int sum = 15;
		Test57_1 test = new Test57_1();
		ArrayList<Integer> list = test.FindNumbersWithSum(array, sum);
		System.out.println(list);

	}

	public ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> list1 = new ArrayList<>();
		if (array == null) {
			return list1;
		}
		int left = 0;
		int right = array.length - 1;
		while (left < right) {
			if (array[left] + array[right] > sum) {
				right = right - 1;
				continue;
			} else if (array[left] + array[right] < sum) {
				left = left + 1;
				continue;
			} else if (array[left] + array[right] == sum) {
				list.add(array[left]);
				list.add(array[right]);
				left = left + 1;
				continue;
			}
		}
		if(list==null||list.size()==0) {
			return list1;
		}
		list1.add(list.get(0));
		list1.add(list.get(1));
		return list1;
	}

}
