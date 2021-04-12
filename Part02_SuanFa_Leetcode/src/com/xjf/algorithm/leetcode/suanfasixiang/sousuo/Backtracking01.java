package com.xjf.algorithm.leetcode.suanfasixiang.sousuo;

import java.util.ArrayList;
import java.util.List;

//�绰�������ĸ���

/**
 * �������
 * �ⷨһ���Լ��Ľⷨ ����˼������������һ��list�洢��ǰ�ַ�����index��ʾdigits��������
 * ���磺list��{"a","b","c"},��index��������ִ�����ַ�����"def"
 * combineһ��֮���������ģ�{"b","c","ad","ae","af"}������ɾһ�����������Դ�����
 * 
 * �ⷨ�������ݷ�backtracking����Ҫ��
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
	 * @param stringBuilder:����ƴ�յ��ַ���
	 * @param list���洢ƴ���˵��ַ���
	 * @param digits����������ִ�
	 */
	private void backtracking(StringBuilder stringBuilder, List<String> list, String digits) {
		if (stringBuilder.length() == digits.length()) {
			list.add(stringBuilder.toString());
			return;
		}
		char a = digits.charAt(stringBuilder.length());
		int index = a - '0';
		char[] curLetters = KEYS[index].toCharArray();
		//����Ҫ������ϵ��ַ���
		for (int i = 0; i < curLetters.length; i++) {
			stringBuilder.append(curLetters[i]);
			backtracking(stringBuilder, list, digits);
			stringBuilder.deleteCharAt(stringBuilder.length() - 1);//��֦
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

//  �����㷨Ҳ����̽��������һ��ϵͳ����������Ľ�ķ�����
//	�����㷨�Ļ���˼���ǣ���һ��·��ǰ�ߣ��ܽ���������ܽ����˻�������һ��·���ԡ�
//	�ⲻ����dfs��
}
