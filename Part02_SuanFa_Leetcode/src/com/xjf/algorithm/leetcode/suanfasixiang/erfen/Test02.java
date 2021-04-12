package com.xjf.algorithm.leetcode.suanfasixiang.erfen;

//寻找比目标字母大的最小字母
//给你一个排序后的字符列表 letters ，列表中只包含小写英文字母。
//另给出一个目标字母 target，请你寻找在这一有序列表里比目标字母大的最小字母。
//在比较时，字母是依序循环出现的。举个例子：
//如果目标字母 target = 'z' 并且字符列表为 letters = ['a', 'b']，则答案返回 'a'
//示例：
//输入:
//letters = ["c", "f", "j"]
//target = "a"
//输出: "c"
public class Test02 {
	public static void main(String[] args) {
		Test02 test02 = new Test02();
		char[] letters = {'c','f','j'};
		char nextGreatestLetter = test02.nextGreatestLetter(letters, 'g');
		System.out.println(nextGreatestLetter);
	}

	public char nextGreatestLetter(char[] letters, char target) {
		int left=0;
		int right=letters.length-1;
		if(letters[right]<=target) {
			return letters[0];
		}
		if(letters[left]>target) {
			return letters[0];
		}
		while(right-left>1) {
			if(letters[(left+right)/2]>target) {
				right=(left+right)/2;
			}else if(letters[(left+right)/2]<=target) {
				left=(left+right)/2;
			}
		}
		return letters[right];
	}
}
