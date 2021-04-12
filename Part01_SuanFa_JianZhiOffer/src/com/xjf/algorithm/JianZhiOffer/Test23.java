package com.xjf.algorithm.JianZhiOffer;

import java.util.HashSet;
import java.util.Set;
//链表中环的入口结点：链表
//给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，输出null。
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
//
//   public ListNode EntryNodeOfLoop(ListNode pHead)
//   {
//       
//   }
//}
/**
 * 链表中环的入口结点:引入set，使用其contains方法，递归
 * @author xjf
 *
 */
public class Test23 {

	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node2;
		System.out.println(EntryNodeOfLoop(node1).val);
	}

	public static ListNode EntryNodeOfLoop(ListNode pHead) {
		Set<ListNode> set = new HashSet<ListNode>();
		return saveToSet(pHead, set);
	}

	public static ListNode saveToSet(ListNode pHead, Set<ListNode> set) {
		if (pHead != null) {
			if (set.contains(pHead)) {
				return pHead;
			} else {
				set.add(pHead);
			}
			return saveToSet(pHead.next, set);//别忘记加这个return
		} else {
			return null;
		}
	}
}
