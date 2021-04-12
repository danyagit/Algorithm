package com.xjf.algorithm.leetcode.shujujiegou.shu.digui;

//ƽ�������
//�ж��Ƿ�Ϊƽ����,�����ӽڵ�����֮�����һ

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
	
	//�ڵ��������
	public int getDepth(TreeNode root) {
		if(root==null) {
			return 0;
		}
		int leftDepth = getDepth(root.left);
		int rightDepth = getDepth(root.right);
		return Math.max(leftDepth, rightDepth)+1;
	}
	
	
}
