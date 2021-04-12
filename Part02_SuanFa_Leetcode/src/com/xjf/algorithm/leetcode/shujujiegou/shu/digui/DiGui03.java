package com.xjf.algorithm.leetcode.shujujiegou.shu.digui;

//二叉树的直径
public class DiGui03 {

	public static void main(String[] args) {

	}
	
	int maxLength; 
	public int diameterOfBinaryTree(TreeNode root) {
		if(root==null) {
			return 0;
		}
		getMaxLength(root);
		return maxLength;
		
	}
	
	private void getMaxLength(TreeNode root) {
		if(root==null) {
			return;
		}
		int curLength = getDepth(root.left)+getDepth(root.right);
		if(curLength>maxLength) {
			maxLength=curLength;
		}
		getMaxLength(root.left);
		getMaxLength(root.right);
		
	}
	
	//最大深度
	public int getDepth(TreeNode root) {
		if(root==null) {
			return 0;
		}
		int leftDepth = getDepth(root.left);
		int rightDepth = getDepth(root.right);
		return Math.max(leftDepth, rightDepth)+1;
	}
}
