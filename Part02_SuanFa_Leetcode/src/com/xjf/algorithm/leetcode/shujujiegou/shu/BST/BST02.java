package com.xjf.algorithm.leetcode.shujujiegou.shu.BST;

//2. 寻找二叉查找树的第 k 个元素
public class BST02 {

	public static void main(String[] args) {

	}
	int order=0;
	int kth=0;
	//中序遍历的第k个元素
	public int kthSmallest(TreeNode root, int k) {
		dfs(root,k);
		return kth;
	}
	//这个函数没法让它停下来
	private void dfs(TreeNode root, int k) {
		if(root==null) {
			return;
		}
		dfs(root.left,k);
		order++;
		if(k==order) {
			kth=root.val;
			return;
		}
		dfs(root.right,k);
	}
}
