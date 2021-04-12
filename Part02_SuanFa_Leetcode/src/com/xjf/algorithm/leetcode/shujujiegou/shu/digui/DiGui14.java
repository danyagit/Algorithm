package com.xjf.algorithm.leetcode.shujujiegou.shu.digui;

//二叉树中第二小的节点
public class DiGui14 {

	public static void main(String[] args) {

	}

	public int findSecondMinimumValue(TreeNode root) {
		if(root==null) {
			return -1;
		}
		if(root.left==null) {
			return -1;
		}
		
		int left=0;
		if(root.val==root.left.val) {
			left=findSecondMinimumValue(root.left);
		}else {
			left=root.left.val;
		}
		int right=0;
		if(root.val==root.right.val) {
			right=findSecondMinimumValue(root.right);
		}else {
			right=root.right.val;
		}
		if(-1==left&&-1==right) {
			return -1;
		}else {
			if(left==-1||right==-1) {
				return Math.max(left, right);
			}
			else {
				return Math.min(left, right);
			}
		}
	}
}
