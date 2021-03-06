package com.xjf.algorithm.leetcode.shujujiegou.shu.BST;

//3. 把二叉查找树每个节点的值都加上比它大的节点的值
public class BST03 {

	public static void main(String[] args) {

	}

	// 右-根-左遍历
	int curSum=0;
	int curVal=0;
	public TreeNode convertBST(TreeNode root) {
		dfs(root);
		return root;
	}
	private void dfs(TreeNode root) {
		if(root==null) {
			return;
		}
		dfs(root.right);
		curVal=root.val;
		root.val=root.val+curSum;
		curSum=curSum+curVal;
		dfs(root.left);
	}
}
