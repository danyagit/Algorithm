package com.xjf.algorithm.leetcode.shujujiegou.zhanheduilie;
/**
 * �õ���ͨ����,û��ջ
 * @author xjf
 *
 */
//��һ������Ԫ�� II,ѭ�������бȵ�ǰԪ�ش����һ��Ԫ��
public class Exercise06 {

	public static void main(String[] args) {

	}

	public int[] nextGreaterElements(int[] nums) {
		int length = nums.length;
		int[] res = new int[length];
		for(int i=0; i<length;i++) {
			int j=i+1;
			for (; j < length; j++) {
				if(nums[j]>nums[i]) {
					res[i]=nums[j];
					break;
				}
			}
			if(j==length) {
				int k = 0;
				for (; k < i; k++) {
					if(nums[k]>nums[i]) {
						res[i]=nums[k];
						break;
					}
				}
				if(k==i) {
					res[i]=-1;
				}
			}
		}
		return res;
	}
}
