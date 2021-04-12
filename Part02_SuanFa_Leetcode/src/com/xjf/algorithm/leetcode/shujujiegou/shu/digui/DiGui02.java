package com.xjf.algorithm.leetcode.shujujiegou.shu.digui;

//平衡二叉树
//判断是否为平衡树,两个子节点的深度之差不超过一

public class DiGui02 {

	public static void main(String[] args) {

	}

	public boolean isBalanced(TreeNode root) {
		if(root==null) {
			return true;
		}
		int leftDepth = getDepth(root.left);
		int rightDepth = getDepth(root.right);
		if(rightDepth-leftDepth>1||rightDepth-leftDepth<-1) {
			return false;
		}
		return isBalanced(root.left)&&isBalanced(root.right);
	}
	
	//节点的最大深度
	public int getDepth(TreeNode root) {
		if(root==null) {
			return 0;
		}
		int leftDepth = getDepth(root.left);
		int rightDepth = getDepth(root.right);
		return Math.max(leftDepth, rightDepth)+1;
	}
	
	
}
