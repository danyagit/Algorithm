package com.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Exercise199 {

	public static void main(String[] args) {

	}
	//就是二叉树的层次遍历啊，取每层最右边的就行
	public List<Integer> rightSideView(TreeNode root) {
		ArrayList<Integer> list = new ArrayList<>();
		if (root == null) {
			return list;// 返回空而不是null
		}

		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		int size;
		while (queue.size() != 0) {
			size = queue.size();
			for (int i = 0; i < size; i++) {

				TreeNode poll = queue.poll();
				if (i == 0) {
					list.add(poll.val);
				}
				if (poll.right != null) {
					queue.add(poll.right);
				}
				if (poll.left != null) {
					queue.add(poll.left);
				}
			}

		}
		return list;
	}
}
