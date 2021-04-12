package com.xjf.algorithm.leetcode.shujujiegou.shu.digui;

//二叉树的最大深度
public class DiGui01 {
	public static void main(String[] args) {

	}

/**
 * 对于每一个节点,它的深度等于左右子节点深度较大的那个
 * @param root
 * @return
 */
	public int maxDepth(TreeNode root) {
		if (root == null) {
			return 0;
		} else {
			int leftHeight = maxDepth(root.left);
			int rightHeight = maxDepth(root.right);
			return Math.max(leftHeight, rightHeight) + 1;
		}
	}

}
