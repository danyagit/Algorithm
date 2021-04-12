package com.xjf.algorithm.leetcode.suanfasixiang.erfen;

import java.util.HashSet;

//有序数组中的单一元素
//给定一个只包含整数的有序数组，每个元素都会出现两次，
//唯有一个数只会出现一次，找出这个数。
//示例 1:
//输入: [1,1,2,3,3,4,4,8,8]
//输出: 2

/**
 *  
 * @author xjf
 *
 */
public class Test03 {

	public static void main(String[] args) {
		int nums[] = { 1, 1, 2 };
		Test03 test03 = new Test03();
		int singleNonDuplicate = test03.singleNonDuplicate(nums);
		System.out.println(singleNonDuplicate);
	}

	/*public int singleNonDuplicate(int[] nums) {
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			if(set.contains(nums[i])) {
				set.remove(nums[i]);
			}
			else set.add(nums[i]);
		}
		for (Integer integer : set) {
			return integer;
		}
		return 0;
	}*/
	/**
	 * 二分法，保证区间是奇数宽度
	 * @param nums
	 * @return
	 */
	public int singleNonDuplicate(int[] nums) {
		int left=0;
		int right=nums.length-1;
		while(right>left) {
			int mid = (left+right)/2;
			if((mid-left)%2==0) {//左边奇数个元素
				if(nums[mid]==nums[mid-1]) {
					right=mid;
				}else if(nums[mid]==nums[mid+1]) {
					left=mid;
				}else {
					return nums[mid];
				}
			}
			else {
				if(nums[mid]==nums[mid-1]) {
					left=mid+1;
				}else if(nums[mid]==nums[mid+1]) {
					right=mid-1;
				}else {
					return nums[mid];
				}
			}
		}
		return nums[left];
	}
}
