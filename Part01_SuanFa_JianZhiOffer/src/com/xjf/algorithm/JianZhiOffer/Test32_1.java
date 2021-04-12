package com.xjf.algorithm.JianZhiOffer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//�������´�ӡ����������+����:���ö��е��Ƚ��ȳ����ԣ�
//�������´�ӡ������,ͬ��ڵ�������Ҵ�ӡ
//���Ҷ��еĳ�����û�����Ƶģ�ֻҪ֮ǰ��ӽ�ȥ�ģ���ʼ����

public class Test32_1 {
	public static void main(String[] args) {

	}

	public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
		ArrayList<Integer> list = new ArrayList<>();
		if (root == null) {
			return list;//���ؿն�����null
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
