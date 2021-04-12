package com.leetcode;

public class Exercise543 {

	public static void main(String[] args) {

	}
	
	//此题二叉树的直径，原理和二叉树的最大路径和是一样的，都是通过一个分叉去解题
	//递归函数要返回经过该root的最大长度（左右子树中挑一个大的然后加一），而且在递归的过程中，要更新最大值（将max和curChain比较就行了）
	int max=0;
	public int diameterOfBinaryTree(TreeNode root) {
		if(root==null) {
			return max;
		}
		diameter(root);
		return max-1;
	}
	public int diameter(TreeNode root) {
		if(root==null) {
			return 0;
		}
		int leftLength=diameter(root.left);
		int rightLength=diameter(root.right);
		int curChain = leftLength+rightLength+1;
		max=Math.max(curChain, max);
		return Math.max(leftLength, rightLength)+1;
	}
	
	
	
}
