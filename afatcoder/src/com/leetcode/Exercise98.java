package com.leetcode;

public class Exercise98 {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(5);
		TreeNode node2 = new TreeNode(4);
		TreeNode node3 = new TreeNode(6);
		TreeNode node4 = new TreeNode(3);
		TreeNode node5 = new TreeNode(7);
	}

	public boolean isValidBST(TreeNode root) {
		return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
	}
	//如果当前节点满足在上下界范围，就从上往下递归（返回左右子树的判断结果），并且向下传递一个上下界
	//对于左子树，下界和父节点一样，上界为父节点的值
	//对于右子树，上界和父节点一样，下界为父节点的值
	public boolean isValidBST(TreeNode node, long lower, long upper) {
		if (node == null) {
			return true;
		}
		if (node.val <= lower || node.val >= upper) {
			return false;
		}
		return isValidBST(node.left, lower, node.val) && isValidBST(node.right, node.val, upper);
	}
}
