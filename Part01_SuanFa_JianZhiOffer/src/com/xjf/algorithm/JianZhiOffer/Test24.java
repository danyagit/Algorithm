package com.xjf.algorithm.JianZhiOffer;

//反转链表：链表
//输入一个链表，反转链表后，输出新链表的表头。
///*
//public class ListNode {
//    int val;
//    ListNode next = null;
//
//    ListNode(int val) {
//        this.val = val;
//    }
//}*/
//public class Solution {
//    public ListNode ReverseList(ListNode head) {
//
//    }
//}
/**
 * 输入一个链表，反转链表后，输出新链表的表头,超时了：重做
 *
 */
public class Test24 {

//	public static void main(String[] args) {
//		ListNode node1 = new ListNode(1);
//		ListNode node2 = new ListNode(2);
//		ListNode node3 = new ListNode(3);
//		ListNode node4 = new ListNode(4);
//		ListNode node5 = new ListNode(5);
//		node1.next = node2;
//		node2.next = node3;
//		node3.next = node4;
//		node4.next = node5;
//		System.out.println(ReverseList(node1).val);
//	}
//	public static ListNode ReverseList(ListNode head) {
//		ArrayList<ListNode> list = new ArrayList<>();
//		int i = 0;
//		ArrayList<ListNode> list1 = addToArrayList(head, list);
//		ListNode node = list1.get(list1.size()-1);
//		reverseToListNode(node, list1);
//		return node;
//	}
//
//	public static ArrayList<ListNode> addToArrayList(ListNode head, ArrayList<ListNode> list) {
//		if (head != null) {
//			list.add(head);
//			return addToArrayList(head.next, list);
//		} else {
//			return list;
//		}
//	}
//
//	public static ListNode reverseToListNode(ListNode head, ArrayList<ListNode> list) {
//		for(int i=list.size()-2;i>=0;i--) {
//			head.next=list.get(i);
//			head=head.next;
//		}
//		return head;
//	}
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
//		System.out.println(ReverseList(node1).val);
	}
	
//	1-> 2 3 4
	//方法二：递归
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


//	public static ListNode ReverseList(ListNode head) {
//		if (head == null) {
//			return head;
//		}
//		ListNode next = head.next;
//		ListNode node = head;
//		node.next = null;
//		ListNode mid = new ListNode(0);
//		while (next != null) {
//			mid = next.next;
//			next.next = node;
//			node = next;
//			next = mid;
//		}
//
//		return node;
//	}

}
