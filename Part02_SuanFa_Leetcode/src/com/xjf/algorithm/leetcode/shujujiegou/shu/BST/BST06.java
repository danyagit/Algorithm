package com.xjf.algorithm.leetcode.shujujiegou.shu.BST;

import java.util.Arrays;

//108. ����������ת��Ϊƽ�����������
//��[-10,-3,0,5,9]Ϊ����
//�ݹ��壺0Ϊ���ڵ㣬��[-10,-3]��������������[5,9]������������������ÿһ�����䶼Ҫ��ô��
public class BST06 {

	public static void main(String[] args) {

	}

	public TreeNode sortedArrayToBST(int[] nums) {
		if(nums==null||nums.length==0) {
			return null;
		}
		TreeNode root = new TreeNode(nums[nums.length/2]);
		root.left=sortedArrayToBST(Arrays.copyOfRange(nums, 0, nums.length/2));
		root.right=sortedArrayToBST(Arrays.copyOfRange(nums, nums.length/2+1, nums.length));
		return root;
	}

}
