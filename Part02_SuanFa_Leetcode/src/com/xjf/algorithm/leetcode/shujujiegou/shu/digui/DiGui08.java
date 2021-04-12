package com.xjf.algorithm.leetcode.shujujiegou.shu.digui;

//另一个树的子树
public class DiGui08 {

	public static void main(String[] args) {

	}

	// 判断t是否为s的子树
	public boolean isSubtree(TreeNode s, TreeNode t) {
		if (s == null || t == null) {
			return false;
		}
		if (judgeSame(s, t)) {
			return true;
		} else {
			return isSubtree(s.left, t) || isSubtree(s.right, t);
		}
	}
	
	//判断两棵树是否完全相等
	public boolean judgeSame(TreeNode node1, TreeNode node2) {
		if (node1 == null && node2 == null) {
			return true;
		}
		if (node1 == null || node2 == null) {
			return false;
		}
		if (node1.val == node2.val) {
			return judgeSame(node1.left, node2.left) && judgeSame(node1.right, node2.right);
		} else {
			return false;
		}
	}
}
