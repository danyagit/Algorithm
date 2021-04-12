package com.xjf;

public class Exercise03 {

	public static void main(String[] args) {
		int i = Exercise03.lengthOfLongestSubstring("abcabcbb");
		System.out.println(i);
	}

	public static int lengthOfLongestSubstring(String s) {
		int [] a = new int[128];
		int max = 0;
		int curLength = 0;
		for (int i = 0; i < s.length(); i++) {
			if(a[s.charAt(i)]<i-curLength-1) {
				curLength = curLength + 1;
			}else {
				curLength = i-a[s.charAt(i)];
			}
			a[s.charAt(i)]=i;
			if(curLength>max) {
				max = curLength;
			}
			
		}
		return max;
	}
}
