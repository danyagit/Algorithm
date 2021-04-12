package com.xjf.algorithm.JianZhiOffer;

import java.util.ArrayList;
//从尾到头打印链表：链表
//输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
///**
//*    public class ListNode {
//*        int val;
//*        ListNode next = null;
//*
//*        ListNode(int val) {
//*            this.val = val;
//*        }
//*    }
//*
//*/
/*import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        
    }
}*/
public class Test06 {
	public static void main(String[] args) {
		ListNode listNode = new ListNode(1);
		listNode.next=new ListNode(2);
		listNode.next.next=new ListNode(3);
		ArrayList<Integer> list = printListFromTailToHead(listNode);
		for (Integer number : list) {
			System.out.println(number);
		}
	}

	public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		int i = 1;
		//先用一个arraylist保存
		ArrayList<Integer> list = new ArrayList<>();
		//从第一个arraylist中取出，反向保存到此arraylist中
		ArrayList<Integer> reverseList = new ArrayList<>();
		if (listNode == null) {
			return reverseList;
		}
		list.add(0, listNode.val);
		if (listNode.next == null) {
			reverseList.add(0, listNode.val);
			return reverseList;
		}
		while (listNode.next != null) {
			list.add(i, listNode.next.val);
			i++;
			listNode = listNode.next;
		}
		for (int j = 0; j < list.size(); j++) {
			reverseList.add(j, list.get(i-1));
			i--;
		}
		return reverseList;
	}
}
