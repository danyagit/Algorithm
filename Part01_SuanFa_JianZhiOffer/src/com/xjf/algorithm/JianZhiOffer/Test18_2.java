package com.xjf.algorithm.JianZhiOffer;

//删除链表中重复的结点：链表
//在一个排序的链表中，存在重复的结点，
//请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。
//例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
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
 * 删除链表中重复的结点,递归，有难度
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
				curNode=curNode.next;//这句话得习惯放在下面，否则可能空指针
			}
			return null;//后面都是重复的
		}else {
			pHead.next =  deleteDuplication(pHead.next);
		}
		return pHead;
	}
}
