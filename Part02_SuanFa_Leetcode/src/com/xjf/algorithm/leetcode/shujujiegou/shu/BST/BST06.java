package com.xjf.algorithm.leetcode.shujujiegou.shu.BST;

import java.util.Arrays;

//108. 将有序数组转换为平衡二叉搜索树
//以[-10,-3,0,5,9]为例，
//递归体：0为根节点，以[-10,-3]构建左子树，以[5,9]构建右子树。即对于每一个区间都要这么做
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
