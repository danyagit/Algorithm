package com.xjf.algorithm.leetcode.suanfasixiang.paixu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

//�����ַ�����Ƶ������
//����һ���ַ������뽫�ַ�������ַ����ճ��ֵ�Ƶ�ʽ������С�
//����:
//"tree"
//���:
//"eert"
//����:
//'e'�������Σ�'r'��'t'��ֻ����һ�Ρ�
//���'e'���������'r'��'t'֮ǰ�����⣬"eetr"Ҳ��һ����Ч�Ĵ𰸡�

/**
 * ����һ�����ƣ������õ����ȶ�������
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

		// ��ÿ���ַ���Ϊkey����Ƶ����Ϊvalue�浽map��
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

		// �������ȶ��������
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		for (Character key : map.keySet()) {
			queue.add(map.get(key));
		}
		List<Character> list = new ArrayList<>();

		//����queue��ע�⣺�ظ���ֱ����������ѭ��
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
