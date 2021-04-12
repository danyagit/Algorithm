package com.xjf.algorithm.JianZhiOffer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//把二叉树打印成多行:queue,是上一个题目的提升
//从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。
public class Test32_2 {
	public static void main(String[] args) {

	}

	ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {

		ArrayList<ArrayList<Integer>> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		if (pRoot == null) {
			return list1;
		}
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(pRoot);
		int start = 0;
		int end = 1;
		while (!queue.isEmpty()) {
			TreeNode poll = queue.poll();
			start++;// 每出列一个就加一
			list2.add(poll.val);
			if (poll.left != null) {
				queue.add(poll.left);
			}
			if (poll.right != null) {
				queue.add(poll.right);
			}

			if (start == end) {
				end = queue.size();// 记录下一次从queue中要出列多少个
				start = 0;
				list1.add(list2);
				list2 = new ArrayList<Integer>();
			}

		}

		return list1;
	}
}
