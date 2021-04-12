package com.xjf.algorithm.JianZhiOffer;

import java.util.Arrays;

//翻转单词顺序列:双指针
//牛客最近来了一个新员工Fish，
//每天早晨总是会拿着一本英文杂志，写些句子在本子上。
//同事Cat对Fish写的内容颇感兴趣，有一天他向Fish借来翻看，
//但却读不懂它的意思。例如，“student. a am I”。
//后来才意识到，这家伙原来把句子单词的顺序翻转了，
//正确的句子应该是“I am a student.”。
//Cat对一一的翻转这些单词顺序可不在行，你能帮助他么？
public class Test58_1 {

	public static void main(String[] args) {
		Test58_1 test = new Test58_1();
		String str = test.ReverseSentence("I am student.");
		System.out.println(str);
	}
	StringBuffer sb=new StringBuffer();
	public String ReverseSentence(String str) {
		char[] array = str.toCharArray();
		int right = array.length - 1;
		int left = right;
		while (right >= 0) {
			if(left==0) {
				char[] array2 = Arrays.copyOfRange(array, left, right+1);
				String str2 = new String(array2);
				sb.append(str2);
				return sb.toString();
			}
			if (array[left] == ' ') {
				char[] array1 = Arrays.copyOfRange(array, left+1, right+1);
				String str1 = new String(array1);
				sb.append(str1);
				sb.append(" ");
				right=left-1;
				left=left-1;
			}else {
				left=left-1;
			}
		}
		return sb.toString();
	}

}
