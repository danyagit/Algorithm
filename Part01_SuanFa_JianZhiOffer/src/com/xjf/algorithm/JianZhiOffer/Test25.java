package com.xjf.algorithm.JianZhiOffer;

import java.util.ArrayList;
import java.util.Arrays;

//�ϲ������������������
//���������������������������������ϳɺ������
//��Ȼ������Ҫ�ϳɺ���������㵥����������
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
		//�߽�������������һ��û���ˣ��ͷ�����һ����ȫ��������
		if(list1==null) {
			return list2;
		}
		if(list2==null) {
			return list1;
		}
		if(list1.val<=list2.val) {
			//��ʱlist1�Ѿ�ȷ���ǿ��Ա����ģ������滹ûȷ������Ҫ��list2��ضϺ��list1�ٴ���һ��
			list1.next= Merge(list1.next, list2);
			return list1;
		}else {
			list2.next =  Merge(list1, list2.next);
			return list2;
		}
	}
	
	
	//��������̫ռ�ռ�
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
