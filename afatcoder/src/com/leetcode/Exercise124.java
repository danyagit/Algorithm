package com.leetcode;

public class Exercise124 {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(9);
		TreeNode node1 = new TreeNode(6);
		TreeNode node2 = new TreeNode(-3);
		TreeNode node3 = new TreeNode(-6);
		TreeNode node4 = new TreeNode(2);
		TreeNode node5 = new TreeNode(2);
		TreeNode node6 = new TreeNode(-6);
		TreeNode node7 = new TreeNode(-6);
		TreeNode node8 = new TreeNode(-6);
		root.left=node1;
		root.right=node2;
		node2.left=node3;
		node2.right=node4;
		node4.left=node5;
		node5.left=node6;
		node5.right=node7;
		node7.left=node8;
		Exercise124 exercise124 = new Exercise124();
		int maxPathSum = exercise124.maxPathSum(root);
		System.out.println(maxPathSum);
	}
	
	//思路：对于一个分叉(root,left,right)。每次递归返回以该root结束的最大值（可能是左子树最大值+root、右子树最大值+root、还可能只有root自己）
	//递归的过程中还要记得更新全局最大值max。该值在左子树最大值+root、右子树最大值+root、root自己、左子树最大值+root+子树最大值中选一个
	//除此之外，还要考虑叶子节点小于0的情况
	//此题是从下往上的方法，避免了重复计算
	int max = Integer.MIN_VALUE;

	public int maxPathSum(TreeNode root) {
		max(root);
		return max;
	}

	public int max(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int leftMax;
		int rightMax;
		if (root.val < 0) {//考虑当叶子节点小于0的时候，导致返回0
			if (root.left == null && root.right == null) {
				max = Math.max(max, root.val);
				return root.val;
			} else if (root.left == null) {
				rightMax = max(root.right);
				max = Math.max(max, Math.max(rightMax+root.val, root.val));
				return root.val + rightMax;
			} else if (root.right == null) {
				leftMax = max(root.left);
				max = Math.max(max, Math.max(leftMax+root.val, root.val));
				return root.val + leftMax;
			}
		}
		leftMax = max(root.left);
		rightMax = max(root.right);
		int curChain = leftMax + rightMax + root.val;
		max = Math.max(max, Math.max(curChain, Math.max(leftMax+root.val, Math.max(rightMax+root.val, root.val))));
		return Math.max(leftMax, Math.max(rightMax, 0)) + root.val;
	}
}
