package com.xjf.algorithm.JianZhiOffer;

import java.util.ArrayList;
import java.util.Arrays;

//合并两个排序的链表：分治
//输入两个单调递增的链表，输出两个链表合成后的链表，
//当然我们需要合成后的链表满足单调不减规则。
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
//    public ListNode Merge(ListNode list1,ListNode list2) {
//        
//    }
//}
public class Test25 {

	public static void main(String[] args) {

	}
	public ListNode Merge(ListNode list1, ListNode list2) {
		//边界情况，如果其中一个没有了，就返回另一个的全部就行了
		if(list1==null) {
			return list2;
		}
		if(list2==null) {
			return list1;
		}
		if(list1.val<=list2.val) {
			//此时list1已经确定是可以保留的，但后面还没确定，还要拿list2与截断后的list1再处理一下
			list1.next= Merge(list1.next, list2);
			return list1;
		}else {
			list2.next =  Merge(list1, list2.next);
			return list2;
		}
	}
	
	
	//暴力法，太占空间
//	public ListNode Merge(ListNode list1, ListNode list2) {
//		ArrayList<Integer> list = new ArrayList<>();
//		if(list1==null&&list2==null) {
//			return null;
//		}
//		while(list1!=null) {
//			int val = list1.val;
//			list.add(val);
//			list1=list1.next;
//		}
//		while(list2!=null) {
//			int val = list2.val;
//			list.add(val);
//			list2=list2.next;
//		}
//		Object[] array = list.toArray();
//		Arrays.sort(array);
//		ListNode head = new ListNode((int)array[0]);
//		ListNode node = head;
//		for(int i =1;i<array.length;i++) {
//			node.next= new ListNode((int)array[i]);
//			node=node.next;
//		}
//		return head;
//		
//	}
}
