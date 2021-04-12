package com.leetcode;

public class Exercise03 {

	public static void main(String[] args) {
		Exercise03 exercise03 = new Exercise03();
		int len = exercise03.lengthOfLongestSubstring("abba");
		System.out.println(len);
	}
	public int lengthOfLongestSubstring(String s) {
		int [] array = new int[128];//ASCIIֻ��128��
		int curLen=0;
		int max=0;
		for (int i = 0; i < s.length(); i++) {
			if(array[s.charAt(i)]==0) {
				curLen++;
				array[s.charAt(i)]=i+1;//��¼������ַ����ֵ�λ��
			}else {
				curLen=Math.min(i-array[s.charAt(i)]+1, curLen+1);
				array[s.charAt(i)]=i+1;
			}
			if(curLen>max) {
				max=curLen;
			}
		}
		return max;
    }
}
