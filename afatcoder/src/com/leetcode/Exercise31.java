package com.leetcode;

//31. ��һ������
//��ĩβ��ʼ����һ���������ǰ������֣��������ɣ����û�ҵ���˵���ǽ��򣩾���������

//���裺���ȴ��������ҵ���һ���ݼ�����a
//���������ҵ���һ����a�������b����a��b����λ��
//��֮ǰa����������ݼ��ģ�����Ϊ������˫ָ�뷨��
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
		}//value�ǵ�һ���������������
		//���������ȫ��������
		if(!flag) {
			reOrder(nums);
			return;
		}
		//�ҵ���һ����value�������
		for (int j=nums.length - 1; j >0; j--) {
			if(nums[j]>value) {
				swap(nums,j,i-1);
				int m=i,n=nums.length-1;
				while(m<n) {
					swap(nums, m, n);//��i�������������
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
