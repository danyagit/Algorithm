package com.xjf.algorithm.leetcodeUNDO;

public class Exercise45 {
	// ��Ծ��Ϸ��������븴���ˣ����������ҵ���ļ�Ϊ��һ��Ӧ���ڵĵ�
	public static void main(String[] args) {

	}

	public int jump(int[] nums) {
		int len = nums.length;
		int i = len - 1;
		int cnt = 0;
		while (i >= 0) {
			for (int j = 0; j < i; j++) {
				// �������ұ�����֤����Զ��
				if (nums[j] + j >= i) {
					i = j;
					cnt++;
					break;
				}
			}
		}
		return cnt;
	}
}
