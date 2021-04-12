package com.xjf.algorithm.JianZhiOffer;

//给定一个二叉搜索树, 找到该树中两个指定节点的最近公共祖先。
//思路：如果p、q都小于root或者p、q都大于root，那么root肯定是p、q的公共节点
//但不是它们最近的公共节点。就要root->root.left或者root->root.right继续搜索。
public class Test68_1 {

	public static void main(String[] args) {

	}

	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if(root==null) {
			return null;//没找到
		}
		if(root.val>p.val&&root.val>q.val) {
			return lowestCommonAncestor(root.left,p,q);
		}
		if(root.val<p.val&&root.val<q.val) {
			return lowestCommonAncestor(root.right,p,q);
		}
		return root;//走到这一步说明
	}

}
