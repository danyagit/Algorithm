package com.xjf.algorithm.leetcode.shujujiegou.shu.digui;

//��ҽ��� III
//�������˼�Ǳ��뾭�����ڵ�������
public class DiGui13 {

	public static void main(String[] args) {

	}

	public int rob(TreeNode root) {
	    if (root == null) return 0;
	    int val1 = root.val;
	    //��ٵ�root
	    if (root.left != null) val1 += rob(root.left.left) + rob(root.left.right);
	    if (root.right != null) val1 += rob(root.right.left) + rob(root.right.right);
	    //û��ٵ�root
	    int val2 = rob(root.left) + rob(root.right);
	    return Math.max(val1, val2);
	}
}
