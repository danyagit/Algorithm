package com.xjf.algorithm.leetcodeUNDO;

//此题主要是细节
//方法：先找到旋转点，再确定找哪个区间
public class Exercise33 {

	public static void main(String[] args) {
//		int[] nums = {3,1};
//		Exercise33 exercise33 = new Exercise33();
//		int search = exercise33.search(nums, 0);
//		System.out.println(search);
		int[]nums = {4,5,6,7,0,1,2,3};
		int rotateIndex = getRotateIndex(nums);
		System.out.println(rotateIndex);
		
	}
	
	public int target;
	public int search(int[] nums, int target) {
		if(nums==null||nums.length==0) {
			return -1;
		}
		if(nums.length==1) {
			if(target == nums[0]) {
				return 0;
			}
			else {
				return -1;
			}
		}
		
		this.target = target;
		int index = getRotateIndex(nums);
		if(index==0) {
			return binarySearch(nums,index,nums.length-1);
		}
		if(target>=nums[index]&&target<=nums[nums.length-1]) {
			return binarySearch(nums,index,nums.length-1);
		}else if(target>=nums[0]&&target<=nums[index-1]){
			return binarySearch(nums,0,index-1);
		}else {
			return -1;
		}
		
	}


	private int binarySearch(int[] nums, int l, int r) {
		while(l<=r) {
			int mid = l + (r-l)/2;
			if(nums[mid]>target) {
				r = mid-1;
			}else if (nums[mid]<target){
				l = mid+1;
			}else {
				return mid;
			}
		}
		return -1;
	}


	private static int getRotateIndex(int[] nums) {
		int l = 0 , r = nums.length-1;
		if(nums[r]>nums[l]) {
			return 0;
		}
		int mid;
		while(l<=r) {
			mid = l + (r-l)/2;
			if(nums[mid]>nums[l]) {
				l = mid+1;
			}else {
				r = mid-1;
			}
		}
		return l;
	}
}
