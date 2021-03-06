package com.xjf.algorithm.leetcode.shujujiegou.haxibiao;

import java.util.HashMap;
import java.util.Map;

//两数之和
/**
 * 方法一:排序,双指针
 * 方法二:哈希map
 * @author xjf
 *
 */
public class Exercise01 {

	public static void main(String[] args) {
	}
	//方法二:哈希map
	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		int[] res = new int[2];
		for (int i = 0; i < nums.length; i++) {
			if(map.containsKey(target-nums[i])) {
				res[0]=map.get(target-nums[i]);
				res[1]=i;
				break;
			}
			else {
				map.put(nums[i], i);
			}
		}
		return res;
	}
	
}
