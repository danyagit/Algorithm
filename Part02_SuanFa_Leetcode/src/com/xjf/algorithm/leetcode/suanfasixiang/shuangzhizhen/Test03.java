package com.xjf.algorithm.leetcode.suanfasixiang.shuangzhizhen;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//��ת�ַ����е�Ԫ����ĸ
//��дһ�����������ַ�����Ϊ���룬��ת���ַ����е�Ԫ����ĸ��
//���룺"hello"
//�����"holle"
public class Test03 {
	public static void main(String[] args) {
		Test03 test03 = new Test03();
		String s = test03.reverseVowels("hello");
		System.out.println(s);
	}

	public String reverseVowels(String s) {
		char[] array = new char[] {
			'a','e','i','o','u'	,'A','E','I','O','U'
		};
		char[] array2 = s.toCharArray();
		HashSet<Character> set = new HashSet<>();
		for (int i = 0; i < array.length; i++) {
			set.add(array[i]);
		}
		int left=0;
		int right=s.length()-1;
		char third;
		while(left<right) {
			if(set.contains(array2[left])&&set.contains(array2[right])) {
				third=array2[left];
				array2[left]=array2[right];
				array2[right]=third;
				left++;
				right--;
				continue;
			}
			if(set.contains(array2[left])&&!set.contains(array2[right])) {
				right--;
				continue;
			} 
			if(!set.contains(array2[left])&&set.contains(array2[right])) {
				left++;
				continue;
			} else {
				left++;
				right--;
				continue;
			}
			
		}
		return new String(array2);
	}
}
