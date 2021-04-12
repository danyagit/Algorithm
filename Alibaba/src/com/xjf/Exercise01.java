package com.xjf;

public class Exercise01 {

	public static void main(String[] args) {
		String strs[] = {"flower","flow","flight"};
		String longestCommonPrefix = longestCommonPrefix(strs);
		System.out.println(longestCommonPrefix);
	}

	public static String longestCommonPrefix(String[] strs) {
		if(strs==null||strs.length==0) {
			return "";
		}
		String result = strs[0];
		if(strs.length==1) {
			return result;
		}
		for (int i = 1; i < strs.length; i++) {
			result=getCommonPrefix(result, strs[i]);
		}
		
		return result;
	}
	
	public static String getCommonPrefix(String str1,String str2) {
		if(str1==""||str2=="") {
			return "";
		}
		int i=0;
		while(i<str1.length()&&i<str2.length()&&str1.charAt(i)==str2.charAt(i)) {
			i++;
		}
		return str1.substring(0,i);
	}

}
