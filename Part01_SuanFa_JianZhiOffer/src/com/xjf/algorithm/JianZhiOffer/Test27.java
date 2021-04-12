package com.xjf.algorithm.JianZhiOffer;
//二叉树的镜像：树。两个递归，简单

//看题

public class Test27 {
	public static void main(String[] args) {

	}

	public void Mirror(TreeNode root) {
		if(root==null) {
			return;
		}
		TreeNode leftNode = root.left;
		root.left = root.right;
		root.right=leftNode;
		Mirror(root.left);
		Mirror(root.right);
	}
	
	

}
