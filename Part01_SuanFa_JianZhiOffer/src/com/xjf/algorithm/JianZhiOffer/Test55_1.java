package com.xjf.algorithm.JianZhiOffer;

//输入一棵二叉树，求该树的深度。从根结点到叶结点依次经过的结点
//（含根、叶结点）形成树的一条路径，最长路径的长度为树的深度。

//做树的递归题目一定要画自创的大括号图
public class Test55_1 {
	public static void main(String[] args) {

	}

	public int TreeDepth(TreeNode root) {
		return depth(root, 0);
	}

	public int depth(TreeNode node, int depth) {
		if (node == null) {
			return depth;
		}
		depth = depth + 1;
		return Math.max(depth(node.left, depth),
				depth(node.right, depth));
	}
}
