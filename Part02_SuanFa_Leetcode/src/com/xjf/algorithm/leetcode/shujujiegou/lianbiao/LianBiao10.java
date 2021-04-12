package com.xjf.algorithm.leetcode.shujujiegou.lianbiao;

import java.util.ArrayList;
import java.util.List;

//∆Ê≈º¡¥±Ì
/**
 *   ¥¿∑Ω∑®
 * @author xjf
 *
 */
public class LianBiao10 {

	public static void main(String[] args) {

	}
	public ListNode oddEvenList(ListNode head) {
		if (head == null) {
	        return head;
	    }
		ListNode odd = head;
		ListNode even = head.next;
		ListNode evenHead = head.next;
		while(even!=null&&even.next!=null) {
			odd.next=odd.next.next;
			odd=odd.next;
			even.next=even.next.next;
			even=even.next;
		}
		odd.next=evenHead;
		return head;
	}

//	public ListNode oddEvenList(ListNode head) {
//		List<ListNode> list =new ArrayList<>();
//		if(head==null||head.next==null) {
//			return head;
//		}
//		
//		while(head!=null) {
//			list.add(head);
//			head=head.next;
//		}
//		if(list.size()%2==0) {
//			for (int i = 0; i < list.size(); i=i+2) {
//				if(i+2>=list.size()) {
//					list.get(i).next=list.get(1);
//					break;
//				}
//				list.get(i).next=list.get(i+2);
//			}	
//			for (int i = 1; i < list.size(); i=i+2) {
//				if(i+1>=list.size()) {
//					list.get(i).next=null;
//					break;
//				}
//				list.get(i).next=list.get(i+2);
//			}
//		}else {
//			for (int i = 0; i < list.size(); i=i+2) {
//				if(i+1>=list.size()) {
//					list.get(i).next=list.get(1);
//					break;
//				}
//				list.get(i).next=list.get(i+2);
//			}	
//			for (int i = 1; i < list.size(); i=i+2) {
//				if(i+2>=list.size()) {
//					list.get(i).next=null;
//					break;
//				}
//				list.get(i).next=list.get(i+2);
//			}
//			
//		}
//		
//		return list.get(0);
//	}

}
