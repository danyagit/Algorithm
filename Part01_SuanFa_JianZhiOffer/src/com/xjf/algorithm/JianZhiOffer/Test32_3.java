package com.xjf.algorithm.JianZhiOffer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//��֮����˳���ӡ������:�����������
//��ʵ��һ����������֮���δ�ӡ��������
//����һ�а��մ����ҵ�˳���ӡ���ڶ��㰴�մ��������˳���ӡ��
//�����а��մ����ҵ�˳���ӡ���������Դ����ơ�

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
			start++;// ÿ����һ���ͼ�һ
			list2.add(poll.val);
			if (poll.left != null) {
				queue.add(poll.left);
			}
			if (poll.right != null) {
				queue.add(poll.right);
			}

			if (start == end) {// list2������
				if (mark == 2) {
					mark = 1;
					list2=reverse(list2);
				} else {
					mark = 2;
				}
				end = queue.size();// ��¼��һ�δ�queue��Ҫ���ж��ٸ�
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
