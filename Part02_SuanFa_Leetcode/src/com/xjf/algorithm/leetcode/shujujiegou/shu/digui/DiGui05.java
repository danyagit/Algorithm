package com.xjf.algorithm.leetcode.shujujiegou.shu.digui;

//617. 合并二叉树
/**
 * 对于当前这两个节点,我们要求和构造新的节点,而且要接着构造其左子节点和右子节点
 * 
 * @author
 *
 */
public class DiGui05 {
	public static void main(String[] args) {

	}

	public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
		if (t1 == null && t2 == null) {
			return null;
		}
		if (t1 == null) {
			return t2;
		}
		if (t2 == null) {
			return t1;
		}
//		像这种构造树的,就需要利用返回值递归
		TreeNode node = new TreeNode(t1.val + t2.val);
		node.left = mergeTrees(t1.left, t2.left);
		node.right = mergeTrees(t1.right, t2.right);
		return node;
	}
}
