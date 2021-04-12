package com.xjf.algorithm.leetcode.shujujiegou.lianbiao;

//删除链表的倒数第N个节点
public class LianBiao05 {
	public static void main(String[] args) {

	}
/**
 * 用间隔为n的两个指针,一直往下走
 * @param head
 * @param n
 * @return
 */
	public ListNode removeNthFromEnd(ListNode head, int n) {
		int i=1;
		ListNode nthEle=head;
		ListNode delEle=head;
		while(i<n) {
			nthEle=nthEle.next;	
			i++;
		}
		if(nthEle.next==null) {
			return head.next;
		}
		
		while(nthEle.next.next!=null) {
			delEle=delEle.next;
			nthEle=nthEle.next;
		}
		delEle.next=delEle.next.next;
		return head;
	}

}
