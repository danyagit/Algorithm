package com.xjf.algorithm.leetcode.shujujiegou.shu.digui;

//对称二叉树
//交换每个节点的左右子节点,如果与原树相同,就说明是对称的?
public class DiGui09 {

	public static void main(String[] args) {

	}

	public boolean isSymmetric(TreeNode root) {
		if (root == null) return true;
		return isSymmetric(root.left, root.right);
	}
	//判断两棵树1,2是否对称
	//即判断树1的左子树和树2的右子树是否对称,树1的右子树和树2的左子树是否对称
	public boolean isSymmetric(TreeNode left,TreeNode right) {
		if(left==null&&right==null) {
			return true;
		}
		if(left==null||right==null) {
			return false;
		}
		if(left.val!=right.val) {
			return false;
		}
		return isSymmetric(left.left, right.right)&&isSymmetric(left.right, right.left);
		
	}
	
}
