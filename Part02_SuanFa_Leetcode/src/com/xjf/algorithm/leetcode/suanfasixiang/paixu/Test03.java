package com.xjf.algorithm.leetcode.suanfasixiang.paixu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

//根据字符出现频率排序
//给定一个字符串，请将字符串里的字符按照出现的频率降序排列。
//输入:
//"tree"
//输出:
//"eert"
//解释:
//'e'出现两次，'r'和't'都只出现一次。
//因此'e'必须出现在'r'和't'之前。此外，"eetr"也是一个有效的答案。

/**
 * 和上一题相似，都是用的优先队列排序
 * @author xjf
 *
 */

public class Test03 {
	public static void main(String[] args) {
		Test03 test03 = new Test03();
		String str = test03.frequencySort("tree");
		System.out.println(str);
	}

	public String frequencySort(String s) {

		char[] array = s.toCharArray();

		// 将每个字符作为key，其频率作为value存到map中
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < array.length; i++) {
			if (map.containsKey(array[i])) {
				Integer freq = map.get(array[i]);
				freq++;
				map.put(array[i], freq);
			} else {
				map.put(array[i], 1);
			}
		}

		// 利用优先队列排序出
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		for (Character key : map.keySet()) {
			queue.add(map.get(key));
		}
		List<Character> list = new ArrayList<>();

		//遍历queue，注意：重复的直接跳过本次循环
		int freq1 = Integer.MAX_VALUE;
		while (!queue.isEmpty()) {
			int freq = queue.poll();
			if (freq == freq1) {
				continue;
			}
			for (Character key : map.keySet()) {
				int i = freq;
				if (map.get(key) == freq) {
					while (i > 0) {
						list.add(key);
						i--;
					}
				}
			}
			freq1 = freq;
		}
		
		for (int i = 0, j = array.length - 1; i < array.length && j >= 0; i++, j--) {
			array[i] = list.get(j);
		}
		return new String(array);
	}

}
