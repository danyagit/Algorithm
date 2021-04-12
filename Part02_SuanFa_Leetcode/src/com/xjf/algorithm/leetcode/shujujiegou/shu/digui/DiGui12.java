package com.xjf.algorithm.leetcode.shujujiegou.shu.digui;

//最长同值路径
/**
 * 
 * @author xjf
 *
 */
public class DiGui12 {

	public static void main(String[] args) {
		DiGui12 diGui12 = new DiGui12();
		TreeNode root = new TreeNode(2);
		root.left = new TreeNode(1);
//		root.right = new TreeNode(5);
		root.left.left = new TreeNode(1);
//		root.left.right = new TreeNode(4);
//		root.right.right = new TreeNode(5);
		int path = diGui12.longestUnivaluePath(root);
		System.out.println(path);
	}

	public int longest = Integer.MIN_VALUE;

	public int longestUnivaluePath(TreeNode root) {
		if (root == null) {
			return 0;
		}
		pathOfNode(root);
		return longest;
	}

	// 寻找以某一个节点为根节点的最长等值路径,跟求二叉树的最大深度是一个方法
	//在寻找的过程中,顺便就能把最大的等值路径找出来
	public int pathOfNode(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int leftLen = 0;
		int rightLen = 0;
		if (root.left != null) {
			if (root.val == root.left.val) {
				leftLen = pathOfNode(root.left);
			} else {
				pathOfNode(root.left);
			}
		} 
		if (root.right != null) {
			if (root.val == root.right.val) {
				rightLen = pathOfNode(root.right);
			} else {
				pathOfNode(root.right);
			}
		} 
//		在寻找的过程中,顺便就能把最大的等值路径找出来
		if (leftLen + rightLen > longest) {
			longest = leftLen + rightLen;
		}
		return Math.max(leftLen, rightLen) + 1;
	}

/**
 * 下面的方法遍历了多次二叉树,时间复杂度太大	
 */
//	public int curRoot;
//	public int longest=Integer.MIN_VALUE;
//	遍历整个二叉树
//	public int longestUnivaluePath(TreeNode root) {
//		if(root==null) {
//			return 0;
//		}
//		curRoot=root.val;
//		if(pathOfNode(root.left)+pathOfNode(root.right)>longest) {
//			longest=pathOfNode(root.left)+pathOfNode(root.right);
//		}
//		longestUnivaluePath(root.left);
//		longestUnivaluePath(root.right);
//		return longest;
//	}
//	
//	
//	//寻找以某一个节点为根节点的最长等值路径,跟求二叉树的最大深度是一个方法
//	public int pathOfNode(TreeNode root) {
//		if(root==null||root.val!=curRoot) {
//			return 0;
//		}
//		//左节点的最大深度
//		int leftPath = pathOfNode(root.left);
//		//右节点的最大深度
//		int rightPath = pathOfNode(root.right);
//		return Math.max(leftPath, rightPath)+1;
//	}

}
