package com.xjf.algorithm.leetcode.shujujiegou.shu.digui;

//��ת������

/**
 * ����:����ÿһ���ڵ�,��Ҫ�������������ӽڵ�
 * @author xjf
 *
 */
public class DiGui04 {

	public static void main(String[] args) {

	}

	public TreeNode invertTree(TreeNode root) {
		invert(root);
		return root;
	}

	private void invert(TreeNode root) {
		if(root==null) {
			return;
		}
		TreeNode left = root.left;
		root.left=root.right;
		root.right=left;
		invert(root.left);
		invert(root.right);
	}
}
