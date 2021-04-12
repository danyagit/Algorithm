package com.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Exercise958 {

	public static void main(String[] args) {

	}
	//��֤��������������
	//˼·��������ȫ�����������ʣ���0��ʼ��ţ���ڵ�=2*���ڵ���+1,�ҽڵ�=2*���ڵ���+2
	//���������ʱ�򣬰������ķ�ʽ���ڵ��ţ��ٴ���list���������ȫ����������ôlist����һ���ǰ�˳�����еģ�0,1,2,3,4..����
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
