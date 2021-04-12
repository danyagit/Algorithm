package com.xjf.algorithm.leetcodeUNDO;
//ʢ���ˮ������

/**
 * ˫ָ�룬����
 *�����˫ָ�뻹��һ��
 */
public class Exercise11 {

	public static void main(String[] args) {

	}

	public int maxArea(int[] height) {
		int left = 0,right = height.length-1;
		int max = 0;
		while(left<right) {
			max=Math.max(Math.min(height[right],height[left])*(right-left), max);	
			if(height[right]<=height[left]) {
				right--;
			}else{
				left++;
			}
		}
		return max;
	}
}
