package com.leetcode;

import java.util.Arrays;

public class Exercis105 {

	public static void main(String[] args) {

	}
	//前序：根-左-右  中序：左-根-右
	//	前序遍历 preorder = [3,9,20,15,7]
	//	中序遍历 inorder =  [9,3,15,20,7]
	//此题的思路是这样的： 
	//每次递归的时候，pre和in两个数组的长度肯定是一样的。pre的第一个元素构造根节点
	//以[9]和[9]构建左子树，[20,15,7]和[15,20,7]构建右子树
	//递归出口：数组长度为1
	public TreeNode buildTree(int[] preorder, int[] inorder) {
		if(preorder==null||preorder.length==0) {
			return null;
		}
		if(preorder.length==1) {
			return new TreeNode(preorder[0]);
		}
		TreeNode root = new TreeNode(preorder[0]);
		int index = getIndex(preorder[0],inorder);
		root.left=buildTree(Arrays.copyOfRange(preorder, 1, index+1), Arrays.copyOfRange(inorder, 0, index));
		root.right=buildTree(Arrays.copyOfRange(preorder, index+1, preorder.length), Arrays.copyOfRange(inorder, index+1, inorder.length));
		return root;
	}
	private int getIndex(int i, int[] inorder) {
		for (int j = 0; j < inorder.length; j++) {
			if(inorder[j]==i) {
				return j;
			}
		}
		return -1;
	}

}
