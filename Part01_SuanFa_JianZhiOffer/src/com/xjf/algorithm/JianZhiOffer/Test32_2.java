package com.xjf.algorithm.JianZhiOffer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//�Ѷ�������ӡ�ɶ���:queue,����һ����Ŀ������
//���ϵ��°����ӡ��������ͬһ����������������ÿһ�����һ�С�
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
			start++;// ÿ����һ���ͼ�һ
			list2.add(poll.val);
			if (poll.left != null) {
				queue.add(poll.left);
			}
			if (poll.right != null) {
				queue.add(poll.right);
			}

			if (start == end) {
				end = queue.size();// ��¼��һ�δ�queue��Ҫ���ж��ٸ�
				start = 0;
				list1.add(list2);
				list2 = new ArrayList<Integer>();
			}

		}

		return list1;
	}
}
