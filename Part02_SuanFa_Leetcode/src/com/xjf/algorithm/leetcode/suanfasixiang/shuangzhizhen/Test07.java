package com.xjf.algorithm.leetcode.suanfasixiang.shuangzhizhen;

import java.util.ArrayList;
import java.util.List;

//通过删除字母匹配到字典里最长单词
//给定一个字符串和一个字符串字典，找到字典里面最长的字符串，
//该字符串可以通过删除给定字符串的某些字符来得到。
//如果答案不止一个，返回长度最长且字典顺序最小的字符串。
//如果答案不存在，则返回空字符串。
//输入:s = "abpcplea", d = ["ale","apple","monkey","plea"]
//输出: "apple"
//输入:s = "abpcplea", d = ["a","b","c"]
//输出: "a"
public class Test07 {

	public static void main(String[] args) {
		Test07 test07 = new Test07();
		String s = "wordgoodgoodgoodbestword";
		String[] array = { "word","good","best","good" };
		List<String> d = new ArrayList<String>();
		for (String str : array) {
			d.add(str);
		}
		System.out.println(test07.findLongestWord(s, d));

	}

	public String findLongestWord(String s, List<String> d) {
		String str = "";
		for (int i = 0; i < d.size(); i++) {
			if (includeString(s, d.get(i))) {
				if (str == "") {
					str = d.get(i);
				} else {
					if (d.get(i).length() > str.length()) {
						str = d.get(i);
					} else if (d.get(i).length() == str.length() && alphabet(d.get(i), str)) {
						str = d.get(i);
					}
				}
			}
		}

		return str;
	}

	// 判断str1是否包含str2，包含则返回true
	public boolean includeString(String str1, String str2) {
		int index1 = 0;
		int index2 = 0;
		while (index2 < str2.length()) {
			if (index1 == str1.length()) {
				return false;
			}
			if (str1.charAt(index1) == str2.charAt(index2)) {
				index1++;
				index2++;
			} else {
				index1++;
			}
		}
		return true;
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
			} else if (str1.charAt(index1) > str2.charAt(index2)) {
				return false;
			} else {
				index1++;
				index2++;
			}
		}
		return false;

	}
}
