package com.xjf.algorithm.JianZhiOffer;


//����������һ����㣺��
//����һ�������������е�һ����㣬
//���ҳ��������˳�����һ����㲢�ҷ��ء�
//ע�⣬���еĽ�㲻�����������ӽ�㣬
//ͬʱ����ָ�򸸽���ָ�롣
///*
//public class TreeLinkNode {
//    int val;
//    TreeLinkNode left = null;
//    TreeLinkNode right = null;
//    TreeLinkNode next = null;
//
//    TreeLinkNode(int val) {
//        this.val = val;
//    }
//}
//*/
//public class Solution {
//    public TreeLinkNode GetNext(TreeLinkNode pNode)
//    {
//        
//    }
//}

/**
 * �����������������һ���ڵ��������һ�� ����������� �ýڵ����ҽڵ㣺Ѱ�Ҹ��ҽڵ�������ӽڵ�
 * �ýڵ����ҽڵ㣺�����ң��ҵ�һ����ڵ㣨��Ը���ڵ�ĸ��ڵ���ԣ�
 */
public class Test08 {

	public static void main(String[] args) {

	}

	public TreeLinkNode GetNext(TreeLinkNode pNode) {
		if (pNode.right != null) {
			TreeLinkNode node = pNode.right;
			while (node.left != null)
				node = node.left;
			return node;
		} else {
			while (pNode.next != null) {
				TreeLinkNode parent = pNode.next;
				if (parent.left == pNode)
					return parent;
				pNode = pNode.next;
			}
		}
		return null;
	}
}
