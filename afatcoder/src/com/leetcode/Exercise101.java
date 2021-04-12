package com.leetcode;

public class Exercise101 {

	public static void main(String[] args) {

	}

	public boolean isSymmetric(TreeNode root) {
		return check(root, root);
	}
	//比较a的左边和b的右边、a的右边和b的左边
	public boolean check(TreeNode p, TreeNode q) {
		if (p == null && q == null) {
			return true;
		}
		if (p == null || q == null) {
			return false;
		}
		return p.val == q.val && check(p.left, q.right) && check(p.right, q.left);
	}

}
