package com.xjf.algorithm.leetcode.suanfasixiang.shuangzhizhen;

//有序数组的 Two Sum
//给定一个已按照升序排列 的有序数组，
//找到两个数使得它们相加之和等于目标数。
//函数应该返回这两个下标值 index1 和 index2，
//其中 index1 必须小于 index2。

public class Test01 {
	public static void main(String[] args) {

	}

	public int[] twoSum(int[] numbers, int target) {
		int i = 0;
		int j = numbers.length - 1;
		int[] a = new int[2];
		while (i < j) {
			if (numbers[i] + numbers[j] > target) {
				j--;
				continue;
			}
			if (numbers[i] + numbers[j] < target) {
				i++;
				continue;
			} else {
				a[0]=i+1;
				a[1]=j+1;
				return a;
			}

		}
		return null;
	}

}
