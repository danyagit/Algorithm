package com.xjf.algorithm.leetcode.shujujiegou.shu.BST;

//9. 在二叉查找树中查找两个节点之差的最小绝对值
//中序遍历 在left和right之间进行一系列判断即可，easy
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
