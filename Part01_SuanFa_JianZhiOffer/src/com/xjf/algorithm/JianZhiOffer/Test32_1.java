package com.xjf.algorithm.JianZhiOffer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//从上往下打印二叉树：树+队列:利用队列的先进先出特性，
//从上往下打印二叉树,同层节点从左至右打印
//而且队列的长度是没有限制的，只要之前添加进去的，它始终在

public class Test32_1 {
	public static void main(String[] args) {

	}

	public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
		ArrayList<Integer> list = new ArrayList<>();
		if (root == null) {
			return list;//返回空而不是null
		}

		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		while (queue.size() != 0) {
			TreeNode poll = queue.poll();
			
			list.add(poll.val);

			if (poll.left != null) {
				queue.add(poll.left);
			}
			if (poll.right != null) {
				queue.add(poll.right);
			}
		}
		return list;

	}

}
