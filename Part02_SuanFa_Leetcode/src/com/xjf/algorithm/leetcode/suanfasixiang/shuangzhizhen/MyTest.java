package com.xjf.algorithm.leetcode.suanfasixiang.shuangzhizhen;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class MyTest {

	@Test
	public void test01() {
		String s = "aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga";
//					aguokepatgbnvfqmgmlucupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuclmgmqfvnbgtapekouga
		char[] array = new char[s.length()];
		int j = s.length() - 1;
		for (int i = 0; i < s.length(); i++) {
			array[j] = s.charAt(i);
			j--;
		}
		System.out.println(new String(array));
		System.out.println(s.length());
	}

	@Test
	public void testVariable() {
		int a = 0;
		int b = 1;
		fun1(a, b);
		System.out.println(a);
//		int []array = {1,2,3,4,5};
//		swap(array, 1, 2);
//		System.out.println(array[1]);
	}

	public void fun1(int a, int b) {
		a=4;
		b=b+1;
	}

	public void swap(int[] array, int i, int j) {
		int third = array[i];
		array[i] = array[j];
		array[j] = third;
	}

	@Test
	public void test03() {
		String a = "123456";
		System.out.println(a.substring(0, 1));
	}

	@Test
	public void test04() {
		System.out.println(alphabet("best", "good"));
	}

	// 如果str1排在str2之前，返回true
	public boolean alphabet(String str1, String str2) {
		int index1 = 0;
		int index2 = 0;
		// str1:liked str2:like
		if (str1.indexOf(str2) >= 0) {
			return false;
		}
		if (str2.indexOf(str1) >= 0) {
			return true;
		}
		while (index1 < str1.length() && index2 < str2.length()) {
			if (str1.charAt(index1) < str2.charAt(index2)) {
				return true;
			} else if (str1.charAt(index1) < str2.charAt(index2)) {
				return false;
			} else {
				index1++;
				index2++;
			}
		}
		return false;

	}
}
