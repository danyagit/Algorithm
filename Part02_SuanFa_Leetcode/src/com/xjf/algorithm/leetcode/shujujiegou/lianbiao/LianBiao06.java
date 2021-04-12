package com.xjf.algorithm.leetcode.shujujiegou.lianbiao;

//两两交换链表中的节点
public class LianBiao06 {

	public static void main(String[] args) {
		ListNode listNode1 = new ListNode(1);
		ListNode listNode2 = new ListNode(2);
		ListNode listNode3 = new ListNode(3);
		ListNode listNode4 = new ListNode(4);
		listNode1.next = listNode2;
		listNode2.next = listNode3;
		listNode3.next = listNode4;
		LianBiao06 lianBiao06 = new LianBiao06();
		ListNode node = lianBiao06.swapPairs(listNode1);
		System.out.println(node);
	}

	public ListNode swapPairs(ListNode head) {
		if(head==null||head.next==null) {
			return head;
		}
		return swap(head, head.next);
	}

	private ListNode swap(ListNode head, ListNode next) {
		if (next == null) {
			return head;
		}
		ListNode nextPair = next.next;
		next.next = head;
		if (nextPair != null) {
			head.next = swap(nextPair, nextPair.next);
		}else {
			head.next=null;//否则会形成循环的
		}
		return next;
	}

}
