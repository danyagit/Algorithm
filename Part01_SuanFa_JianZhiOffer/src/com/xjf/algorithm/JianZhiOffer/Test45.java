package com.xjf.algorithm.JianZhiOffer;

import java.util.Arrays;
import java.util.Comparator;

//把数组排成最小的数
//输入一个正整数数组，把数组里所有数字拼接起来排成一个数，
//打印能拼接出的所有数字中最小的一个。例如输入数组{3，32，321}，
//则打印出这三个数字能排成的最小数字为321323。

/**
 * 表面上这个题复杂，但借用Comparator就非常简单
 * @author xjf
 *
 */
public class Test45 {
	public static void main(String[] args) {
		int[] numbers = new int[] { 3, 32, 321 };
		Test45 test = new Test45();
		System.out.println(test.PrintMinNumber(numbers));
	}

	public String PrintMinNumber(int[] numbers) {
		if (numbers == null || numbers.length == 0)
			return "";
		int n = numbers.length;
		String[] nums = new String[n];
		for (int i = 0; i < n; i++)
			nums[i] = numbers[i] + "";
		Arrays.sort(nums,new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return (o1+o2).compareTo(o2+o1);
			}
		});
		String ret = "";
		for (String str : nums)
			ret += str;
		return ret;
	}
}
