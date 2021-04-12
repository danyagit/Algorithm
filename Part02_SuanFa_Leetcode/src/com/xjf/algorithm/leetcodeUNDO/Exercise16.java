package com.xjf.algorithm.leetcodeUNDO;

import java.util.Arrays;
//Ë«Ö¸Õë
public class Exercise16 {

	public static void main(String[] args) {
		int nums[] = {-1,2,1,-4};
		int a = Exercise16.threeSumClosest(nums, 1);
		System.out.println(a);
	}

	public static int threeSumClosest(int[] nums, int target) {
		Arrays.sort(nums);
		int curSum=getCurClosest(0,nums,target);;
		for (int first = 1; first < nums.length-2; first++) {
			int temp = getCurClosest(first,nums,target);
			if(Math.abs(target-temp)<Math.abs(target-curSum)) {
				curSum = temp;
			}
		}
		return curSum;
	}

	public static int getCurClosest(int first, int[] nums,int target) {
		int second = first+1,third = nums.length-1;
		int curDiff = Math.abs(target-nums[first]-nums[second]-nums[third]); 
		int curSum = nums[first]+nums[second]+nums[third];
		while(second<third-1) {
			if(nums[first]+nums[second]+nums[third]>target) {
				third--;
			}else if(nums[first]+nums[second]+nums[third]<target) {
				second++;
			}else {
				return nums[first]+nums[second]+nums[third];
			}
			if(curDiff>Math.abs(target-nums[first]-nums[second]-nums[third])) {
				curDiff=Math.abs(target-nums[first]-nums[second]-nums[third]);
				curSum = nums[first]+nums[second]+nums[third];
			}
		}
		return curSum;
	}
}
