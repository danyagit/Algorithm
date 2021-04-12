package com.xjf.algorithm.leetcodeUNDO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercise49 {

	public static void main(String[] args) {
		String[] strs  = {"eat", "tea", "tan", "ate", "nat", "bat"};
		List<List<String>> list = Exercise49.groupAnagrams(strs);
		System.out.println(list);
	}

	public static List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>> res = new ArrayList<>();
		Map<String, List<String>> map = new HashMap<>();
		for (int i = 0; i < strs.length; i++) {
			char[] array = strs[i].toCharArray();
			Arrays.sort(array);
			String strKey = new String(array);
			if(map.containsKey(strKey)) {
				map.get(strKey).add(strs[i]);
			}else {
				List<String> list = new ArrayList<>();
				list.add(strs[i]);
				map.put(strKey, list);
			}
		}
		for(String key:map.keySet()) {
			res.add(map.get(key));
		}
		return res;
	}

}
