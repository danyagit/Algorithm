package com.xjf.algorithm.leetcode.shujujiegou.shu.digui;

//��������������
public class DiGui01 {
	public static void main(String[] args) {

	}

/**
 * ����ÿһ���ڵ�,������ȵ��������ӽڵ���Ƚϴ���Ǹ�
 * @param root
 * @return
 */
	public int maxDepth(TreeNode root) {
		if (root == null) {
			return 0;
		} else {
			int leftHeight = maxDepth(root.left);
			int rightHeight = maxDepth(root.right);
			return Math.max(leftHeight, rightHeight) + 1;
		}
	}

}
