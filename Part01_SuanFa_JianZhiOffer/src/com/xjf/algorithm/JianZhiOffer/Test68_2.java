package com.xjf.algorithm.JianZhiOffer;

//给定一个普通二叉树, 找到该树中两个指定节点的最近公共祖先。
//思路：在左右子树中查找是否存在 p 或者 q，如果 p 和 q 分别在两个子树中，
//那么就说明根节点就是最低公共祖先。
public class Test68_2 {

	public static void main(String[] args) {
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		node1.left = node2;
		node1.right = node3;
		node2.right = node4;
		TreeNode node = new Test68_2().lowestCommonAncestor(node1, node3, node4);
		System.out.println(node);
	}

	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if (root == null) {
			return null;
		}
		if (contains(root.left, p) && contains(root.right, q)) {
			return root;
		}
		if (contains(root.right, p) && contains(root.left, q)) {
			return root;
		}
		if (root == p && contains(root, q)) {
			return root;
		}
		if (root == q && contains(root, p)) {
			return root;
		}
		TreeNode node1 = lowestCommonAncestor(root.left, p, q);
		TreeNode node2 = lowestCommonAncestor(root.right, p, q);
		if (node1 == null) {
			return node2;
		} else
			return node1;
	}

	private boolean contains(TreeNode root, TreeNode p) {
		if (root == null) {
			return false;
		}
		if (root == p) {
			return true;
		}
		return contains(root.left, p) || contains(root.right, p);

	}

}
