package com.xjf.algorithm.leetcode.shujujiegou.shu.digui;

//二叉树的最小深度
public class DiGui10 {

	public static void main(String[] args) {

	}

	public int minDepth(TreeNode root) {
	    if (root == null) return 0;
	    int left = minDepth(root.left);//左子树的最小深度
	    int right = minDepth(root.right);//右子树的最小深度
	    if (left == 0 || right == 0) return left + right + 1;//排除为0的情况(和第一题的区别)
	    return Math.min(left, right) + 1;
	}
}
