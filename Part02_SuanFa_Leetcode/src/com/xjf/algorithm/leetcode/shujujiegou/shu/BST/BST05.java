package com.xjf.algorithm.leetcode.shujujiegou.shu.BST;

//5. 二叉树的最近公共祖先(medium，多看，没太摸清套路)
public class BST05 {

	public static void main(String[] args) {

	}

	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if(root==null) {
			return null;
		}
		if(root==p||root==q) {
			return root;
		}
		//寻找左子树，如果leftResult不为空，
		TreeNode leftResult = lowestCommonAncestor(root.left, p, q);
		TreeNode rightResult = lowestCommonAncestor(root.right, p, q);
		if(leftResult!=null&&rightResult!=null) {
			return root;
		}else if(leftResult!=null){
			return leftResult;
		}else if(rightResult!=null) {
			return rightResult;
		}else {
			return null;
		}
	}

	// 我这个方法是暴力法，先层次遍历，后又对每个节点进行递归判断
//	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//		Queue<TreeNode> queue = new LinkedList<>();
//		queue.add(root);
//		TreeNode cur=null;
//		while(!queue.isEmpty()) {
//			cur = queue.poll();
//			if(judge(cur,p,q)) {
//				return cur;
//			}
//			if(cur.left!=null) {
//				queue.add(cur.left);
//			}
//			if(cur.right!=null) {
//				queue.add(cur.right);
//			}
//		}
//		return null;
//	}
//
//	private boolean judge(TreeNode root,TreeNode p, TreeNode q) {
//		if(root.val==p.val||root.val==q.val) {
//			return judge1(root.left,p,q)||judge1(root.right,p,q);
//		}
//		return judge1(root.left,p,q)&&judge1(root.right,p,q);
//	}
//	private boolean judge1(TreeNode root,TreeNode p, TreeNode q) {
//		if(root==null){
//			return false;
//		}
//		if(root.val==p.val||root.val==q.val) {
//			return true;
//		}
//		return judge1(root.left,p,q)||judge1(root.right,p,q);
//	}
}
