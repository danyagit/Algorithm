package com.xjf.algorithm.JianZhiOffer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//按之字形顺序打印二叉树:这题跟上题差不多
//请实现一个函数按照之字形打印二叉树，
//即第一行按照从左到右的顺序打印，第二层按照从右至左的顺序打印，
//第三行按照从左到右的顺序打印，其他行以此类推。

public class Test32_3 {
	public static void main(String[] args) {

	}

	public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
		ArrayList<ArrayList<Integer>> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		if (pRoot == null) {
			return list1;
		}
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(pRoot);
		int start = 0;
		int end = 1;
		int mark = 1;
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

			if (start == end) {// list2添加完毕
				if (mark == 2) {
					mark = 1;
					list2=reverse(list2);
				} else {
					mark = 2;
				}
				end = queue.size();// 记录下一次从queue中要出列多少个
				start = 0;
				list1.add(list2);
				list2 = new ArrayList<Integer>();
			}
		}
		return list1;
	}

	public ArrayList<Integer> reverse(ArrayList<Integer> list) {
		ArrayList<Integer> list1 = new ArrayList<>();
		for (int i = list.size() - 1; i >= 0; i--) {
			list1.add(list.get(i));
		}
		return list1;
	}
}
