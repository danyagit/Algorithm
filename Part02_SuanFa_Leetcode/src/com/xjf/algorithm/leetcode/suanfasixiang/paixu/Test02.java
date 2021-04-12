package com.xjf.algorithm.leetcode.suanfasixiang.paixu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

//ǰ K ����ƵԪ��
//����һ���ǿյ��������飬�������г���Ƶ��ǰ k �ߵ�Ԫ��
//ʾ�� 1:
//����: nums = [1,1,1,2,2,3], k = 2
//���: [1,2]
//ʾ�� 2:
//����: nums = [1], k = 1
//���: [1]
public class Test02 {

	public static void main(String[] args) {
		Test02 test02 = new Test02();
		int nums[]= {3,2,1,5,6,4};
		int[] array = test02.topKFrequent(nums, 2);
		System.out.println(array);
	}

	public int[] topKFrequent(int[] nums, int k) {
		
		//��ÿ������Ϊkey����Ƶ����Ϊvalue�浽map��
		//����[1,1,1,1,2,3,3,3,3,3]����map��Ϊ 1=4,2=1,3=5
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
		
		//�������ȶ��������
		//��k=2,��queue���ų�ǰ������5,4 ��Ȼ��5,4����set����������������Ƶ�ʴ���set
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
		
		//����map���ж�ÿ��key��Ӧ��value��Ƶ�ʣ��Ƿ���set���棬����ڣ���key����list
		ArrayList<Integer> list =new ArrayList<>();
		for (Integer key : map.keySet()) {
			if(set.contains(map.get(key))) {
				list.add(key);
			}
		}
		
		//��listת��Ϊ����
		int[]topKFreq = new int[list.size()];
		int i=0;
		for (Integer ele : list) {
			topKFreq[i]=ele;
			i++;
		}
		return topKFreq;
	}
}
