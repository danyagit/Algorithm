package com.xjf.algorithm.JianZhiOffer;

//�����е�����k����㣺���� ˫ָ��
//����һ����������������е�����k����㡣
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
//    public ListNode FindKthToTail(ListNode head,int k) {
//
//    }
//}
/**
 * �����е����� K �����:�Ѷȣ��е�
 * �ݹ�
 *
 */

public class Test22 {

	public static void main(String[] args) {
		ListNode node1= new ListNode(1);
		ListNode node2= new ListNode(2);
		ListNode node3= new ListNode(3);
		ListNode node4= new ListNode(4);
		ListNode node5= new ListNode(5);
		node1.next=node2;
		node2.next=node3;
		node3.next=node4;
		node4.next=node5;
		
		System.out.println(FindKthToTail(node1, 5).val);
	}

	public static ListNode FindKthToTail(ListNode head, int k) {
		if(head==null) {
			return null;
		}
		int size =1;
		size = sizeOfListNode(head,size);
		if(k>size) {
			return null;
		}
		return returnKthListNode(head, size-k+1);
	}
	
	public static ListNode returnKthListNode(ListNode head,int k) {
		if(k==1) {
			return head;
		}
		else{
			return returnKthListNode(head.next, --k);
		}
		
	}

	
	public static int sizeOfListNode(ListNode head,int size) {
		if(head.next==null) {
			return size;
		}
		else {
			return sizeOfListNode(head.next, ++size);
		}
	}

}
