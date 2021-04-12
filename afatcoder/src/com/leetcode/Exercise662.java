package com.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class Exercise662 {

	public static void main(String[] args) {
		Exercise662 exercise662 = new Exercise662();
		TreeNode node0= new TreeNode(1);
		TreeNode node1= new TreeNode(3);
		TreeNode node2= new TreeNode(2);
		TreeNode node3= new TreeNode(5);
		TreeNode node4= new TreeNode(3);
		TreeNode node5= new TreeNode(9);
		node0.left=node1;
		node0.right=node2;
		node1.left=node3;
		node1.right=node4;
		node2.left=null;
		node2.right=node5;
		int widthOfBinaryTree = exercise662.widthOfBinaryTree(node0);
		System.out.println(widthOfBinaryTree);
	}
	
	//������ò�α����ķ���������һ���ܼ�¼��Ⱥ�λ�õ��ڲ��࣡�������һ����ʱ�򣬾Ϳ������������ˣ���
	
	public int widthOfBinaryTree(TreeNode root) {
		Queue<NodeWithPosition> queue = new LinkedList<>();
		queue.add(new NodeWithPosition(0, 0, root));
		int depth=0;//��¼��ǰ�����
		int pos=0;//��¼ÿ�п�ͷ���Ǹ�Ԫ�ص����
		int width = 0;//��¼�����
		while(!queue.isEmpty()) {
			NodeWithPosition poll = queue.poll();
			if(poll.node!=null) {
				queue.add(new NodeWithPosition(poll.depth+1, poll.position*2+1, poll.node.left));
				queue.add(new NodeWithPosition(poll.depth+1, poll.position*2+2, poll.node.right));
				if(poll.depth==depth) {
					width = Math.max(width, poll.position-pos+1);
				}else {//˵�����¿���һ��
					depth=poll.depth;
					pos=poll.position;
				}
			}
		}
		return width;
	}
	class NodeWithPosition{
		int depth;
		int position;
		TreeNode node;
		public NodeWithPosition(int depth, int position, TreeNode node) {
			this.depth = depth;
			this.position = position;
			this.node = node;
		}
	}
	
	
}
