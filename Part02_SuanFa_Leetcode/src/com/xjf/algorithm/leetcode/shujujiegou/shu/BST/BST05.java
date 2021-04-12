package com.xjf.algorithm.leetcode.shujujiegou.shu.BST;

//5. �������������������(medium���࿴��û̫������·)
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
		//Ѱ�������������leftResult��Ϊ�գ�
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

	// ����������Ǳ��������Ȳ�α��������ֶ�ÿ���ڵ���еݹ��ж�
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
