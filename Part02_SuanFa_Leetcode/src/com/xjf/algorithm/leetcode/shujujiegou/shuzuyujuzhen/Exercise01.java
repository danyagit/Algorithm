package com.xjf.algorithm.leetcode.shujujiegou.shuzuyujuzhen;

//1. 把数组中的 0 移到末尾
/**
 * 方法一，一个个判断，一个个移动，移动完了就完成了。
 * 方法二（建议）：先把不为0的全部移动到前面，count。将末尾len-count都设为0.
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
	//输入位置，以该位置为起点，返回第一个不为0的位置。如果后面全是0，返回-1
	public int getLastZeroIndex(int index,int[]nums) {
		for (int i = index; i < nums.length; i++) {
			if(nums[i]!=0) {
				return i;
			}
		}
		return -1;
	}
	
	//方法二：
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
