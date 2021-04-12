package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise46 {

	public static void main(String[] args) {

	}
	//�ݹ������list���洢��ǰ��������ϣ���nums����ǰҪ���������飩
	//������������ǰ���飨ָ��ʹ�0-ĩβ���ɣ��������ݹ飩����Ԫ����ӵ�list��ͬʱҪ�ı�nums��Ϊ��һ�εĲ������ų����ε����Ԫ�أ�
	//���õݹ��Ҫ��֦����������ϵ�������Ŀ��Ҫ��֦
	int length=0;
	public List<List<Integer>> permute(int[] nums) {
		length=nums.length;
		List<Integer> list = new ArrayList<>();
		List<List<Integer>> result = new ArrayList<>();
		backTracking(nums, list, result);

		return result;
	}

	private void backTracking(int[] nums, List<Integer> list, List<List<Integer>> result) {
		if (list.size() == this.length) {
			List<Integer> list1 = new ArrayList<>();
			for (Integer val:list) {
				list1.add(val);
			}
			result.add(list1);
			return;
		}
		for (int i = 0; i < nums.length; i++) {
			list.add(nums[i]);
			int[] copyOfRange1 = Arrays.copyOfRange(nums, i + 1, nums.length);
			int[] copyOfRange2 = Arrays.copyOfRange(nums, 0, i);
			int[] concat =concatTwoArrays(copyOfRange1, copyOfRange2);
			backTracking(concat, list, result);
			list.remove(list.size() - 1);//��֦
		}

	}
	private int[] concatTwoArrays(int[]a,int[]b) {
		int c[] = new int[a.length+b.length];
		System.arraycopy(a, 0, c, 0, a.length);
		System.arraycopy(b, 0, c, a.length, b.length);
		return c;
	}
	
	
	
	
}
