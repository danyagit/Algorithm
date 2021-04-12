package com.xjf.algorithm.leetcode.shujujiegou.shuzuyujuzhen;

//1. �������е� 0 �Ƶ�ĩβ
/**
 * ����һ��һ�����жϣ�һ�����ƶ����ƶ����˾�����ˡ�
 * �����������飩���ȰѲ�Ϊ0��ȫ���ƶ���ǰ�棬count����ĩβlen-count����Ϊ0.
 * @author xjf
 *
 */
public class Exercise01 {

	public static void main(String[] args) {
		Exercise01 exercise01 = new Exercise01();
		int[] nums = {0,1,0,3,12};
		exercise01.moveZeroes(nums);
		System.out.println(nums);
	}

	public void moveZeroes(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]==0) {
				int lastZeroIndex = getLastZeroIndex(i, nums);
				if(lastZeroIndex==-1) {
					return;
				}
				nums[i]=nums[lastZeroIndex];
				nums[lastZeroIndex]=0;
			}	
		}
	}
	//����λ�ã��Ը�λ��Ϊ��㣬���ص�һ����Ϊ0��λ�á��������ȫ��0������-1
	public int getLastZeroIndex(int index,int[]nums) {
		for (int i = index; i < nums.length; i++) {
			if(nums[i]!=0) {
				return i;
			}
		}
		return -1;
	}
	
	//��������
	public void moveZeroes02(int[] nums) {
	    int idx = 0;
	    for (int num : nums) {
	        if (num != 0) {
	            nums[idx] = num;
	            idx++;
	        }
	    }
	    while (idx < nums.length) {
	        nums[idx] = 0;
	        idx++;
	    }
	}
	
}
