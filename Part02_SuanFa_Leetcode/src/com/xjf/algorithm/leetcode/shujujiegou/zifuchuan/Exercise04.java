package com.xjf.algorithm.leetcode.shujujiegou.zifuchuan;

import java.util.Arrays;

//4. 两个字符串包含的字符是否完全相同
public class Exercise04 {

	public static void main(String[] args) {
		Exercise04 exercise04 = new Exercise04();
		boolean anagram = exercise04.isAnagram("anagram", "nagaram");
		System.out.println(anagram);
	}

	// 方法一:对字符数组排序
	public boolean isAnagram(String s, String t) {
		char[] array1 = s.toCharArray();
		char[] array2 = t.toCharArray();
		Arrays.sort(array1);
		Arrays.sort(array2);
		if (!new String(array1).equals(new String(array2))) {
			return false;
		}
		return true;
	}

	// 方法二:HashMap
//	可以用 HashMap 来映射字符与出现次数，然后比较两个字符串出现的字符数量是否相同。
//	由于本题的字符串只包含 26 个小写字符，因此可以使用长度为 26 的整型数组对字符串出现的字符进行统计，不再使用 HashMap。
	public boolean isAnagram2(String s, String t) {
		int[] cnts = new int[26];
		for (char c : s.toCharArray()) {
			cnts[c - 'a']++;
		}
		for (char c : t.toCharArray()) {
			cnts[c - 'a']--;
		}
		for (int cnt : cnts) {
			if (cnt != 0) {
				return false;
			}
		}
		return true;
	}
}
