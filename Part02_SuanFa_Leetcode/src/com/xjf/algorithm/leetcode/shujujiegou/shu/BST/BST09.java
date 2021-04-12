package com.xjf.algorithm.leetcode.shujujiegou.shu.BST;

//9. �ڶ���������в��������ڵ�֮�����С����ֵ
//������� ��left��right֮�����һϵ���жϼ��ɣ�easy
public class BST09 {

	public static void main(String[] args) {

	}

	int min = Integer.MAX_VALUE;
	int pre = -1;
	int cnt = 0;

	public int getMinimumDifference(TreeNode root) {
		dfs(root);
		return min;
	}

	private void dfs(TreeNode root) {
		if (root == null) {
			return;
		}
		dfs(root.left);
		if (cnt == 0) {
			pre = root.val;
			cnt++;
		} else {
			if (root.val - pre < min) {
				min = root.val - pre;
			}
			pre = root.val;
		}
		dfs(root.right);
	}
}
