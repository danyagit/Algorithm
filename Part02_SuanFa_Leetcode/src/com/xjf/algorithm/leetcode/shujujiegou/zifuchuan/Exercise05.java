package com.xjf.algorithm.leetcode.shujujiegou.zifuchuan;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//5. 计算一组字符集合可以组成的回文字符串的最大长度
public class Exercise05 {

	public static void main(String[] args) {
		Exercise05 exercise05 = new Exercise05();
		int palindrome = exercise05.longestPalindrome("bananas");
		System.out.println(palindrome);
	}

	public int longestPalindrome(String s) {
		Map<Character,Integer> map = new HashMap<>();
		int res=0;
		for (int i = 0; i < s.length(); i++) {
			if(map.containsKey(s.charAt(i))) {
				Integer newValue = map.get(s.charAt(i))+1;
				map.put(s.charAt(i), newValue);
			}else {
				map.put(s.charAt(i), 1);
			}
		}
		if(map.size()==1) {
			Set<Character> set = map.keySet();
			for (Character c : set) {
				return map.get(c);
			}
		}
		for ( Character c : map.keySet()) {
			if(map.get(c)%2==0) {
				res=res+map.get(c);
			}else {
				res=res+map.get(c)-1;//3个a,z只能用2个
			}
		}
		if(s.length()>res) {
			res=res+1;//中间可以插入一个
		}
		return res;
	}
}
