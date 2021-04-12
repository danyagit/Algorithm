package com.xjf.algorithm.leetcode.shujujiegou.shu.digui;

//打家劫舍 III
//此题的意思是必须经过根节点这条线
public class DiGui13 {

	public static void main(String[] args) {

	}

	public int rob(TreeNode root) {
	    if (root == null) return 0;
	    int val1 = root.val;
	    //打劫到root
	    if (root.left != null) val1 += rob(root.left.left) + rob(root.left.right);
	    if (root.right != null) val1 += rob(root.right.left) + rob(root.right.right);
	    //没打劫到root
	    int val2 = rob(root.left) + rob(root.right);
	    return Math.max(val1, val2);
	}
}
