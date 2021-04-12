package com.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Exercise958 {

	public static void main(String[] args) {

	}
	//验证二叉树的完整性
	//思路：按照完全二叉树的性质，从0开始标号，左节点=2*根节点标号+1,右节点=2*根节点标号+2
	//层序遍历的时候，按这样的方式给节点编号，再存入list。如果是完全二叉树，那么list里面一定是按顺序排列的（0,1,2,3,4..）。
	public boolean isCompleteTree(TreeNode root) {
		Queue<markedTreeNode> queue = new LinkedList<>();
		List<markedTreeNode> list = new ArrayList<>();
		queue.add(new markedTreeNode(root, 0));
		while(!queue.isEmpty()) {
			markedTreeNode poll = queue.poll();
			list.add(poll);
			if(poll.node.left!=null) {
				queue.add(new markedTreeNode(poll.node.left, 2*poll.mark+1));
			}
			if(poll.node.right!=null) {
				queue.add(new markedTreeNode(poll.node.right, 2*poll.mark+2));
			}
		}
		if(list.get(list.size()-1).mark==list.size()-1) {
			return true;
		}
		return false;
	}
	
	
	class markedTreeNode{
		TreeNode node;
		int mark;
		public markedTreeNode(TreeNode node,int mark) {
			this.node=node;
			this.mark=mark;
		}
	}
}
