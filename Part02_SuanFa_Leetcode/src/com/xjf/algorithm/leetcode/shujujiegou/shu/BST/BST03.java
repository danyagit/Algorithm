package com.xjf.algorithm.leetcode.shujujiegou.shu.BST;

//3. �Ѷ��������ÿ���ڵ��ֵ�����ϱ�����Ľڵ��ֵ
public class BST03 {

	public static void main(String[] args) {

	}

	// ��-��-�����
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
