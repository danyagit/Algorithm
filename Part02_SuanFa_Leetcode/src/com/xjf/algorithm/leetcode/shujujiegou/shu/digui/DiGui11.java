package com.xjf.algorithm.leetcode.shujujiegou.shu.digui;

//×óÒ¶×ÓÖ®ºÍ
public class DiGui11 {

	public static void main(String[] args) {

	}

	boolean flag = true;
	int sum;

	public int sumOfLeftLeaves(TreeNode root) {
		if (root == null) {
			return 0;
		}
		if (root.left == null && root.right == null) {
			return 0;
		}
		return sum(root);

	}

	public int sum(TreeNode root) {
		if (root == null) {
			return sum;
		}
		if (root.left == null && root.right == null && flag) {
			sum = sum + root.val;
		}
		flag = true;
		sum(root.left);
		flag = false;
		sum(root.right);
		return sum;
	}
}
