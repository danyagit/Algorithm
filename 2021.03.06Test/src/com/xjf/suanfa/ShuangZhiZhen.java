package com.xjf.suanfa;

public class ShuangZhiZhen {

	public static void main(String[] args) {
		int nums1[]= {1,2,3,0,0,0};
		int nums2[]= {2,5,6};
		ShuangZhiZhen shuangZhiZhen = new ShuangZhiZhen();
		shuangZhiZhen.merge(nums1, 3, nums2, 3);
		System.out.println(1);
	}
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int i = m-1;
		int j = n-1;
		int k = nums1.length-1;
		while(j>=0) {
			if(i<0||nums2[j]>=nums1[i]) {
				nums1[k]=nums2[j];
				j--;
				k--;
			}else {
				nums1[k]=nums1[i];
				i--;
				k--;
			}
		}
	}
}
