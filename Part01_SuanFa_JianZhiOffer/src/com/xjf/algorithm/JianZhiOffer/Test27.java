package com.xjf.algorithm.JianZhiOffer;
//�������ľ������������ݹ飬��

//����

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
