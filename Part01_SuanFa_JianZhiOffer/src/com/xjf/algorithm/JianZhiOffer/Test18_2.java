package com.xjf.algorithm.JianZhiOffer;

//ɾ���������ظ��Ľ�㣺����
//��һ������������У������ظ��Ľ�㣬
//��ɾ�����������ظ��Ľ�㣬�ظ��Ľ�㲻��������������ͷָ�롣
//���磬����1->2->3->3->4->4->5 �����Ϊ 1->2->5
///*
//public class ListNode {
//   int val;
//   ListNode next = null;
//
//   ListNode(int val) {
//       this.val = val;
//   }
//}
//*/
//public class Solution {
//   public ListNode deleteDuplication(ListNode pHead)
//   {
//
//   }
//}
/**
 * ɾ���������ظ��Ľ��,�ݹ飬���Ѷ�
 * 
 * @param args
 */
public class Test18_2 {
	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(1);
		ListNode node3 = new ListNode(1);
		ListNode node4 = new ListNode(1);
		ListNode node5 = new ListNode(1);
		ListNode node6 = new ListNode(1);
		ListNode node7 = new ListNode(1);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		node6.next = node7;
		Test18_2 test18_2 = new Test18_2();
		ListNode deleteDuplication = test18_2.deleteDuplication(node1);
		System.out.println(deleteDuplication);
	}
	int cur = 0;
	public ListNode deleteDuplication(ListNode pHead) {
		ListNode curNode = pHead;
		if(pHead==null) {
			return null;
		}
		if(pHead.next==null) {
			return pHead;
		}
		if(pHead.val==pHead.next.val) {
			cur = pHead.val;
			while(curNode!=null) {
				if(curNode.val!=cur) {
					return deleteDuplication(curNode);
				}
				curNode=curNode.next;//��仰��ϰ�߷������棬������ܿ�ָ��
			}
			return null;//���涼���ظ���
		}else {
			pHead.next =  deleteDuplication(pHead.next);
		}
		return pHead;
	}
}
