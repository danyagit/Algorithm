package com.xjf.algorithm.leetcode.shujujiegou.shu.BST;

//2. Ѱ�Ҷ���������ĵ� k ��Ԫ��
public class BST02 {

	public static void main(String[] args) {

	}
	int order=0;
	int kth=0;
	//��������ĵ�k��Ԫ��
	public int kthSmallest(TreeNode root, int k) {
		dfs(root,k);
		return kth;
	}
	//�������û������ͣ����
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