package com.leetcode;

public class Exercise104 {

	public static void main(String[] args) {

	}
	//考虑一个分支就行
	public int maxDepth(TreeNode root) {
		if(root==null) {
			return 0;
		}
		int leftMax = maxDepth(root.left);
		int rightMax = maxDepth(root.right);
		return Math.max(leftMax, rightMax)+1;
	}
}
