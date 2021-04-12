package com.leetcode;

public class Exercise23 {

	public static void main(String[] args) {

	}

	public ListNode mergeKLists(ListNode[] lists) {
		if(lists==null||lists.length==0) {
			return null;
		}
		ListNode head = lists[0];
		for (int i = 1; i < lists.length; i++) {
			head=mergeTwoLists(head,lists[i]);
		}
		return head;
	}
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if(l1==null) {
			return l2;
		}
		if(l2==null) {
			return l1;
		}
		//Ë­Ð¡·µ»ØË­
		if(l1.val<=l2.val) {
			l1.next=mergeTwoLists(l1.next,l2);
			return l1;
		}else {
			l2.next=mergeTwoLists(l1,l2.next);
			return l2;
		}
	}
	
}
