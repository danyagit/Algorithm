package com.leetcode;

//31. 下一个排列
//从末尾开始，找一个后面大于前面的数字，交换即可，如果没找到（说明是降序）就重新排序

//步骤：首先从右向左找到第一个递减的数a
//从右向左找到第一个比a大的数字b，将a与b交换位置
//将之前a后面的数（递减的），改为递增（双指针法）
public class Exercise31 {

	public static void main(String[] args) {
		int[] nums = {5,4,7,5,3,2};
		Exercise31 exercise31 = new Exercise31();
		exercise31.nextPermutation(nums);
		System.out.println(2);
	}

	public void nextPermutation(int[] nums) {
		int i = -1, value = -1;
		boolean flag = false;
		for (i = nums.length - 1; i > 0; i--) {
			if (nums[i] > nums[i - 1]) {
				value= nums[i - 1];
				flag = true;
				break;
			}
		}//value是第一个发生降序的数字
		//如果从左到右全是是升序
		if(!flag) {
			reOrder(nums);
			return;
		}
		//找到第一个比value大的数字
		for (int j=nums.length - 1; j >0; j--) {
			if(nums[j]>value) {
				swap(nums,j,i-1);
				int m=i,n=nums.length-1;
				while(m<n) {
					swap(nums, m, n);//将i后面的升序排列
					m++;
					n--;
				}
				return;
			}
		}
		
	}

	private void reOrder(int[] nums) {
		int i = 0, j = nums.length - 1;
		while (i < j) {
			swap(nums, i, j);
			i++;
			j--;
		}
	}

	private void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
}
