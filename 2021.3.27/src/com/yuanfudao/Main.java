package com.yuanfudao;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int length = s.nextInt();
		s.nextLine();
		int [] nums = new int[length];
		for (int i = 0; i < length; i++) {
			nums[i] = s.nextInt();
		}
		s.nextLine();
		int target = s.nextInt();
		
		System.out.println(getNumOfPairs(nums,target));
		
	}

	private static long getNumOfPairs(int[] nums, int target) {
		int [] arr = new int[nums.length];
		long cnt = 0;
		for (int i = 0; i < nums.length; i++) {
			arr[i] = getLength(nums,i,target);
			if(arr[i]==0&&nums[i]<target) {
				cnt++;
				continue;
			}
			cnt= cnt+arr[i]*(arr[i]-1)/2;
		}
		return cnt%1000000007;
	}

	private static int getLength(int[] nums, int i, int target) {
		int res = 0;
		int start = i;
		while(i<nums.length) {
			res = res|nums[i];
			if(res>target) {
				return i-start;
			}
			i++;
		}
		return nums.length;
	}
	
	
	
	
	

//	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		int groups = s.nextInt();
//		s.nextLine();
//		while(groups>0) {
//			int length = s.nextInt();
//			int [] nums = new int[length];
//			for (int i = 0; i < nums.length; i++) {
//				nums[i] = s.nextInt();
//			}
//			if(judge(nums)) {
//				System.out.println("Y");
//			}else {
//				System.out.println("N");
//			}
//			groups--;
//			s.nextLine();
//		}
//	}
//
//	private static boolean judge(int[] nums) {
//		
//		int i = 0;
//		boolean flag = false;
//		while(i<nums.length-1) {
//			if(nums[i]<nums[i+1]) {
//				flag = true;
//				i++;
//				break;
//			}
//			i++;
//		}
//		if(!flag) {
//			return true;
//		}
//		if(nums[nums.length-1]<nums[0]) {
//			return false;
//		}
//		
//		while(i<nums.length-1) {
//			if(nums[i]<nums[i+1]) {
//				return false;
//			}
//			i++;
//		}
//		
//		return true;
//	}

}
