package com.leetcode;
//��leetcode�����1�⣬��ʱ�����ֽⷨ��1��С���ѣ�2��������������
//�˴����Կ���ѡ�񣬲�����
public class Exercise215 {

	public static void main(String[] args) {
		int nums[] = {1,2,5,6,3,4,7};
		int k = 2;
		Exercise215 exercise215 = new Exercise215();
		int kthLargest = exercise215.findKthLargest(nums, k);
		System.out.println(kthLargest);
	}
	public int findKthLargest(int[] nums, int k) {
		int index = getIndex(nums,0,nums.length-1);
		while(index!=nums.length-k) {
			if(index>nums.length-k) {
				index=getIndex(nums,0,index-1);
			}else {
				index=getIndex(nums,index+1,nums.length-1);
			}
		}
		return nums[index];
	}
	private int getIndex(int[] nums, int start, int end) {
		int pivot = nums[start];
		while(start<end) {
			while(start<end&&nums[end]>=pivot) {
				end--;
			}
			nums[start]=nums[end];
			while(start<end&&nums[start]<=pivot) {
				start++;
			}
			nums[end]=nums[start];
		}
		nums[start]=pivot;
		return start;
	}
}
