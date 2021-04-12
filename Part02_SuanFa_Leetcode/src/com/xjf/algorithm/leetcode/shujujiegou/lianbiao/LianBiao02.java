package com.xjf.algorithm.leetcode.shujujiegou.lianbiao;

//206. ·´×ªÁ´±í
//1-2-3-4
//
public class LianBiao02 {

	public static void main(String[] args) {
		ListNode listNode1 = new ListNode(1);
		ListNode listNode2 = new ListNode(2);
		ListNode listNode3 = new ListNode(3);
		listNode1.next=listNode2;
		listNode2.next=listNode3;
		LianBiao02 lianBiao02 = new LianBiao02();
		ListNode node = lianBiao02.reverseList(listNode1);
		System.out.println(node);
	}

	public ListNode reverseList(ListNode head) {
		if(head==null) {
			return null;
		}
		ListNode next1 = head.next;
		if(next1==null) {
			return head;
		}
		head.next=null;
		return reverse(head,next1);
	}

	private ListNode reverse(ListNode head, ListNode next1) {
		if(next1.next==null) {
			next1.next=head;
			return next1;
		}
		ListNode next = next1.next;
		next1.next=head;
		return reverse(next1,next);
	}

	
}
