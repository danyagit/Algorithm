package com.xjf.algorithm.leetcode.shujujiegou.lianbiao;

//合并两个有序链表
//递归更好理解
public class LianBiao03 {

	public static void main(String[] args) {
	}
	
	
	
	//自己写的，太长了
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if(l1==null) {
			return l2;
		}
		if(l2==null) {
			return l1;
		}
		ListNode next1 = l1.next;
		ListNode next2 = l2.next;
		if(l1.val>=l2.val) {
			merge(l2,next2,l1,next1);
			return l2;
		}else merge(l1,next1,l2,next2);
		return l1;
	}

	private void merge(ListNode l1, ListNode next1, ListNode l2,ListNode next2) {
		//考虑两个边界情况
		if(next1==null) {
			l1.next=l2;
			return;
		}
		if(next2==null) {
			merge(l1,next1,l2);
			return;
		}
		
		if(l2.val>=l1.val&&l2.val<=next1.val) {
			l1.next=l2;
			l2.next=next1;
			merge(l2,next1,next2,next2.next);
		}else {
			l1=l1.next;
			next1=next1.next;
			merge(l1,next1,l2,next2);
		}
	}

	private void merge(ListNode l1, ListNode next1, ListNode l2) {
		if(next1==null) {
			l1.next=l2;
			return;
		}
		if(l2.val>=l1.val&&l2.val<=next1.val) {
			l1.next=l2;
			l2.next=next1;
			return;
		}else {
			merge(l1.next,next1.next,l2);
		}
	}
}
