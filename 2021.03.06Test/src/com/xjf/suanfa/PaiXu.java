package com.xjf.suanfa;

import java.util.HashMap;

public class PaiXu {
	public static void main(String[] args) {
		
	}
	
	public String frequencySort(String s) {
		HashMap<Character, Integer> map = new HashMap<>();
		char[] charArray = s.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if(map.containsKey(charArray[i])) {
				map.put(charArray[i], map.get(charArray[i])+1);
			}else {
				map.put(charArray[i], 1);
			}
		}
		
		
		return null;
	}
	
	
}
