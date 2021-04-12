package com.leetcode;

public class Exercise110 {

	public static void main(String[] args) {

	}
	//是否为平衡二叉树：左右子树高度差相差不超过1
	//搞一个求高度的函数就行了。只是在递归的过程中加一个判断的步骤，给全局变量赋值。
	boolean flag=true;
	public boolean isBalanced(TreeNode root) {
		height(root);
		return flag;
	}
	public int height(TreeNode root) {
		if(root==null) {
			return 0;
		}
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);
		if(leftHeight-rightHeight>1||leftHeight-rightHeight<-1) {
			flag=false;
		}
		return Math.max(leftHeight, rightHeight)+1;
	}
	
	
}
