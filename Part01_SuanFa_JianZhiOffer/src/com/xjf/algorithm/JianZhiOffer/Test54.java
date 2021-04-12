package com.xjf.algorithm.JianZhiOffer;

//二叉搜索树的第k个结点
//给定一棵二叉搜索树，请找出其中的第k小的结点。

//就是二叉树的中序遍历问题
public class Test54 {

	public static void main(String[] args) {
		TreeNode node = new TreeNode(2);
		node.left = new TreeNode(1);
		node.right = new TreeNode(3);
		TreeNode node1 = new Test54().KthNode(node, 1);
		System.out.println(node1);
	}

	TreeNode target;
	int cnt =0;

	TreeNode KthNode(TreeNode pRoot, int k) {
		inorderTraversal(pRoot, k);
		return target;
	}

	private void inorderTraversal(TreeNode treeNode, int k) {
		if (treeNode == null) {
			return;
		}
		inorderTraversal(treeNode.left, k);
		cnt++;
		if (cnt == k) {
			target = treeNode;
		}
		inorderTraversal(treeNode.right, k);
	}

}
