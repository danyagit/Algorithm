package com.xjf.algorithm.leetcode.shujujiegou.shu.BST;

//修剪二叉搜索树
public class BST01 {

	public static void main(String[] args) {

	}


	public TreeNode trimBST(TreeNode root, int low, int high) {
		if (root == null) return null;
		//该节点太大，尝试返回其右边节点
	    if (root.val > high) return trimBST(root.left, low, high);
	    //该节点太小，尝试返回其左边节点
	    if (root.val < low) return trimBST(root.right, low, high);
	    //该节点在范围之内，返回该节点
	    root.left = trimBST(root.left, low, high);
	    root.right = trimBST(root.right, low, high);
	    return root;
	}

}
