package com.xjf.algorithm.leetcode.shujujiegou.shu.digui;

//反转二叉树

/**
 * 分析:对于每一个节点,都要交换它的左右子节点
 * @author xjf
 *
 */
public class DiGui04 {

	public static void main(String[] args) {

	}

	public TreeNode invertTree(TreeNode root) {
		invert(root);
		return root;
	}

	private void invert(TreeNode root) {
		if(root==null) {
			return;
		}
		TreeNode left = root.left;
		root.left=root.right;
		root.right=left;
		invert(root.left);
		invert(root.right);
	}
}
