package com.xjf.algorithm.leetcode.shujujiegou.haxibiao;

import java.util.HashMap;
import java.util.Map;

//����֮��
/**
 * ����һ:����,˫ָ��
 * ������:��ϣmap
 * @author xjf
 *
 */
public class Exercise01 {

	public static void main(String[] args) {
	}
	//������:��ϣmap
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
