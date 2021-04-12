package com.xjf.algorithm.JianZhiOffer;

//平衡二叉树
//输入一棵二叉树，判断该二叉树是否是平衡二叉树。
//在这里，我们只需要考虑其平衡性，不需要考虑其是不是排序二叉树
/**
 * 平衡二叉树：每个根节点左右子树的高度不超过1
 * 用到了55.1的求树的深度的函数
 * @author xjf
 *
 */

public class Test55_2 {
	public static void main(String[] args) {

	}

	public boolean IsBalanced_Solution(TreeNode root) {
		if(root==null) {
			return true;
		}
		if (root.left == null && root.right == null) {
			return true;
		}
		
		if ((depth(root.left, 0) - depth(root.right, 0) > 1) || (depth(root.left, 0) - depth(root.right, 0) < -1)) {
			return false;
		}
//		if ((depth(root.left, 0) - depth(root.right, 0) >= -1) && (depth(root.left, 0) - depth(root.right, 0) < 1)) 
		else {
			return IsBalanced_Solution(root.left) && IsBalanced_Solution(root.right);
		}
	}

	// 根据root求树的深度,depth传入0
	public int depth(TreeNode node, int depth) {
		if (node == null) {
			return depth;
		}
		depth = depth + 1;
		return Math.max(depth(node.left, depth), depth(node.right, depth));
	}

}
