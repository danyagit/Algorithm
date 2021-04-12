package com.xjf.algorithm.leetcode.shujujiegou.shu.BST;

import java.util.LinkedList;
import java.util.Queue;

//4. ����������������������
public class BST04 {

	public static void main(String[] args) {
	}

	// ���ϵ��£���һ����p��q֮��ġ��������
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		TreeNode cur=null;
		while(!queue.isEmpty()) {
			cur = queue.poll();
			if(cur.val>=Math.min(p.val, q.val)&&cur.val<=Math.max(p.val, q.val)) {
				return cur;
			}
			if(cur.left!=null) {
				queue.add(cur.left);
			}
			if(cur.right!=null) {
				queue.add(cur.right);
			}
		}
		return null;
	}
}