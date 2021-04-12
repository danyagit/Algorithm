package com.xjf.algorithm.leetcode.suanfasixiang.shuangzhizhen;
//合并两个有序数组

//给你两个有序整数数组 nums1 和 nums2，
//请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。
//初始化 nums1 和 nums2 的元素数量分别为 m 和 n 。
//你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。

public class Test05 {

	public static void main(String[] args) {
		int[]nums1= {1,2,3,0,0,0};
		int[]nums2= {2,5,6};
		int m = 3;
		int n = 3;
		Test05 test05 = new Test05();
		test05.merge(nums1, m, nums2, n);
	}

	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int[]nums3 = new int[m+n];
		int index1=0;
		int index2=0;
		int index3=0;
		while(index1<m||index2<n) {
			
			if(index1==m&&index2<n) {
				nums3[index3]=nums2[index2];
				index2++;
				index3++;
				continue;
			}
			if(index2==n&&index1<m) {
				nums3[index3]=nums1[index1];
				index1++;
				index3++;
				continue;
			}
			
			
			if(nums1[index1]<=nums2[index2]) {
				nums3[index3]=nums1[index1];
				index1++;
				index3++;
		
			}else {
				nums3[index3]=nums2[index2];
				index2++;
				index3++;
			}
			
		}
		for (int i = 0; i < nums3.length; i++) {
			nums1[i]=nums3[i];
		}
	}

}
