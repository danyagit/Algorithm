package com.xjf.algorithm.leetcode.shujujiegou.shu.digui;

//����������С���
public class DiGui10 {

	public static void main(String[] args) {

	}

	public int minDepth(TreeNode root) {
	    if (root == null) return 0;
	    int left = minDepth(root.left);//����������С���
	    int right = minDepth(root.right);//����������С���
	    if (left == 0 || right == 0) return left + right + 1;//�ų�Ϊ0�����(�͵�һ�������)
	    return Math.min(left, right) + 1;
	}
}
