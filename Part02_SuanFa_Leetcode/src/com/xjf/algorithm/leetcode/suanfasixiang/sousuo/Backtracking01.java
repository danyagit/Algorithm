package com.xjf.algorithm.leetcode.suanfasixiang.sousuo;

import java.util.ArrayList;
import java.util.List;

//电话号码的字母组合

/**
 * 排列组合
 * 解法一：自己的解法 整体思想是这样：用一个list存储当前字符串，index表示digits的索引。
 * 例如：list是{"a","b","c"},而index代表的数字代表的字符串是"def"
 * combine一步之后是这样的：{"b","c","ad","ae","af"}。即：删一个加三个，以此类推
 * 
 * 解法二：回溯法backtracking（重要）
 * 
 * @author xjf
 *
 */
public class Backtracking01 {

	public static void main(String[] args) {
		Backtracking01 backtracking01 = new Backtracking01();
		String digits = "23";
		List<String> list = backtracking01.letterCombinations(digits);
		System.out.println(list);
	}

	private static final String[] KEYS = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

	public List<String> letterCombinations(String digits) {
		List<String> list = new ArrayList<>();
		if (digits == null || digits.length() == 0) {
			return list;
		}
		backtracking(new StringBuilder(), list, digits);

		return list;
	}
	/**
	 * @param stringBuilder:正在拼凑的字符串
	 * @param list：存储拼好了的字符串
	 * @param digits：输入的数字串
	 */
	private void backtracking(StringBuilder stringBuilder, List<String> list, String digits) {
		if (stringBuilder.length() == digits.length()) {
			list.add(stringBuilder.toString());
			return;
		}
		char a = digits.charAt(stringBuilder.length());
		int index = a - '0';
		char[] curLetters = KEYS[index].toCharArray();
		//遍历要排列组合的字符串
		for (int i = 0; i < curLetters.length; i++) {
			stringBuilder.append(curLetters[i]);
			backtracking(stringBuilder, list, digits);
			stringBuilder.deleteCharAt(stringBuilder.length() - 1);//剪枝
		}

	}

//	int digitLength=0;
//	String digits=new String();
//	private static final String[] KEYS = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
//	public List<String> letterCombinations(String digits) {
//		if(digits==null||digits.length()==0) {
//			return new ArrayList<String>();
//		}
//		
//		digitLength=digits.length();
//		this.digits=digits;
//		List<String> list = new ArrayList<>();
//		int a = digits.charAt(0)-'0';
//		String str = KEYS[a];
//		for (int i = 0; i < str.length(); i++) {
//			list.add(new StringBuffer().append(str.charAt(i)).toString());
//		}
//		combine(list, 1);
//		return list;
//    }
//	
//	
//	public List<String> combine(List<String>list,int index){
//		if(index>=digitLength) {
//			return list;
//		}
//		int len=list.size();
//		for (int i = 0; i <len; i++) {
//			for (int j = 0; j < KEYS[digits.charAt(index)-'0'].length(); j++) {
//				StringBuffer buffer = new StringBuffer(list.get(0));
//				buffer.append(KEYS[digits.charAt(index)-'0'].charAt(j));
//				list.add(buffer.toString());
//			}
//			list.remove(0);
//		}
//		return combine(list, index+1);
//	}

//  回溯算法也叫试探法，它是一种系统地搜索问题的解的方法。
//	回溯算法的基本思想是：从一条路往前走，能进则进，不能进则退回来，换一条路再试。
//	这不就是dfs嘛
}
