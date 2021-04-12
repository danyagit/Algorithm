package com.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class Exercise103 {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		TreeNode node2 = new TreeNode(9);
		TreeNode node3 = new TreeNode(20);
		TreeNode node4 = new TreeNode(15);
		TreeNode node5 = new TreeNode(7);
		root.left = node2;
		root.right = node3;
		node3.left = node4;
		node3.right = node5;
		Exercise103 exercise103 = new Exercise103();
		List<List<Integer>> zigzagLevelOrder = exercise103.zigzagLevelOrder(root);
		System.out.println(zigzagLevelOrder);
	}

	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		List<List<Integer>> result = new ArrayList<>();
		if (root == null) {
			return result;
		}
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		boolean flag=true;
		while (!queue.isEmpty()) {
			List<Integer> list = new ArrayList<>();
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				TreeNode poll = queue.poll();
				list.add(poll.val);
				if (poll.left != null)
					queue.add(poll.left);
				if (poll.right != null)
					queue.add(poll.right);
			}
			if(!flag) {
				Collections.reverse(list);
				flag=!flag;
			}else {
				flag=!flag;
			}
			result.add(list);
		}
		return result;
	}
}
