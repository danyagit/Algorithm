package com.xjf.algorithm.leetcode.suanfasixiang.paixu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

//前 K 个高频元素
//给定一个非空的整数数组，返回其中出现频率前 k 高的元素
//示例 1:
//输入: nums = [1,1,1,2,2,3], k = 2
//输出: [1,2]
//示例 2:
//输入: nums = [1], k = 1
//输出: [1]
public class Test02 {

	public static void main(String[] args) {
		Test02 test02 = new Test02();
		int nums[]= {3,2,1,5,6,4};
		int[] array = test02.topKFrequent(nums, 2);
		System.out.println(array);
	}

	public int[] topKFrequent(int[] nums, int k) {
		
		//将每个数作为key，其频率作为value存到map中
		//若是[1,1,1,1,2,3,3,3,3,3]，则map中为 1=4,2=1,3=5
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if(map.containsKey(nums[i])) {
				Integer freq = map.get(nums[i]);
				freq++;
				map.put(nums[i], freq);
			}else {
				map.put(nums[i], 1);
			}
		}
		
		//利用优先队列排序出
		//若k=2,则queue中排出前两个：5,4 ，然后将5,4存入set。即将符合条件的频率存入set
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		Set<Integer> set = new HashSet<Integer>();
		for (Integer key : map.keySet()) {
			queue.add(map.get(key));
			set.add(map.get(key));
			if (queue.size() == k + 1) {
				Integer freq1=queue.poll();
				set.remove(freq1);
			}
		}
		
		//遍历map，判断每个key对应的value（频率）是否在set里面，如果在，将key存入list
		ArrayList<Integer> list =new ArrayList<>();
		for (Integer key : map.keySet()) {
			if(set.contains(map.get(key))) {
				list.add(key);
			}
		}
		
		//将list转化为数组
		int[]topKFreq = new int[list.size()];
		int i=0;
		for (Integer ele : list) {
			topKFreq[i]=ele;
			i++;
		}
		return topKFreq;
	}
}
