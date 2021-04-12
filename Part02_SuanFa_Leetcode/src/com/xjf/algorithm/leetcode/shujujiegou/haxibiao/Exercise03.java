package com.xjf.algorithm.leetcode.shujujiegou.haxibiao;

import java.util.HashMap;
import java.util.Map;

//594. 最长和谐子序列
/**
 * 
 * 记着用hashmap
 * 先排序也可以吧
 * @author xjf
 *
 */
public class Exercise03 {
	
	public static void main(String[] args) {
	}
	Integer longest = 0;
	public int findLHS(int[] nums) {
		Map<Integer,Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
		}
		for (int key : map.keySet()) {
			Integer integer1 = map.get(key);
			Integer integer2 = map.get(key+1);
			if(integer1==null) {continue;}
			if(integer2==null) {continue;}
			if(integer1+integer2>longest) {
				longest=integer1+integer2;
			}
		}
		return longest;
	}
}
