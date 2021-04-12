package com.xjf.algorithm.leetcode.shujujiegou.zifuchuan;

import java.util.HashMap;
import java.util.Map;

//6. 字符串同构.
//这道题有点难想
//记录一个字符上次出现的位置，如果两个字符串中的字符上次出现的位置一样，那么就属于同构。
//paper
//title
public class Exercise06 {

	public static void main(String[] args) {
	}
	public boolean isIsomorphic(String s, String t) {
		Map<Character,Integer> map1 = new HashMap<>();
		Map<Character,Integer> map2 = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			int integer1=-1;
			int integer2=-1;
			if(map1.get(s.charAt(i))!=null) {
				integer1 = map1.get(s.charAt(i));	
			}
			if(map2.get(t.charAt(i))!=null) {
				integer2 = map2.get(t.charAt(i));
			}
			if(integer1!=integer2) {
				return false;
			}
			map1.put(s.charAt(i), i);
			map2.put(t.charAt(i), i);
		}
		return true;
	}
}
