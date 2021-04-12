package com.xjf.algorithm.leetcode.shujujiegou.zifuchuan;

import java.util.Arrays;

//4. �����ַ����������ַ��Ƿ���ȫ��ͬ
public class Exercise04 {

	public static void main(String[] args) {
		Exercise04 exercise04 = new Exercise04();
		boolean anagram = exercise04.isAnagram("anagram", "nagaram");
		System.out.println(anagram);
	}

	// ����һ:���ַ���������
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

	// ������:HashMap
//	������ HashMap ��ӳ���ַ�����ִ�����Ȼ��Ƚ������ַ������ֵ��ַ������Ƿ���ͬ��
//	���ڱ�����ַ���ֻ���� 26 ��Сд�ַ�����˿���ʹ�ó���Ϊ 26 ������������ַ������ֵ��ַ�����ͳ�ƣ�����ʹ�� HashMap��
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
