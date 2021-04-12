package com.xjf.algorithm.leetcode.suanfasixiang.shuangzhizhen;

import java.util.ArrayList;
import java.util.List;

//ͨ��ɾ����ĸƥ�䵽�ֵ��������
//����һ���ַ�����һ���ַ����ֵ䣬�ҵ��ֵ���������ַ�����
//���ַ�������ͨ��ɾ�������ַ�����ĳЩ�ַ����õ���
//����𰸲�ֹһ�������س�������ֵ�˳����С���ַ�����
//����𰸲����ڣ��򷵻ؿ��ַ�����
//����:s = "abpcplea", d = ["ale","apple","monkey","plea"]
//���: "apple"
//����:s = "abpcplea", d = ["a","b","c"]
//���: "a"
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

	// �ж�str1�Ƿ����str2�������򷵻�true
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

	// ���str1����str2֮ǰ������true
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
