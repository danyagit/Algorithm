package com.xjf.algorithm.leetcode.suanfasixiang.tanxin;
//判断子序列

//给定字符串 s 和 t ，判断 s 是否为 t 的子序列。
//你可以认为 s 和 t 中仅包含英文小写字母。字符串 t 可能会很长（长度 ~= 500,000），而 s 是个短字符串（长度 <=100）。
//字符串的一个子序列是原始字符串删除一些（也可以不删除）字符而不改变剩余字符
//相对位置形成的新字符串。（例如，"ace"是"abcde"的一个子序列，而"aec"不是）。
//
//示例 1:
//s = "abc", t = "ahbgdc"
//返回 true.

public class Test08 {

	public static void main(String[] args) {

	}

	public boolean isSubsequence(String s, String t) {
		char[] sub = s.toCharArray();
		char[] parent = t.toCharArray();
		int indexSub = 0;
		int indexParent=0;
		while(indexSub<sub.length) {
			if(indexParent>=parent.length) {
				return false;
			}
			if(sub[indexSub]==parent[indexParent]) {
				indexSub++;
				indexParent++;
			}else {
				indexParent++;
			}
			
		}
		return true;
	}
}
