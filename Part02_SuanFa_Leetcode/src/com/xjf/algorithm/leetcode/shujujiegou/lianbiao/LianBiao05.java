package com.xjf.algorithm.leetcode.shujujiegou.lianbiao;

//ɾ������ĵ�����N���ڵ�
public class LianBiao05 {
	public static void main(String[] args) {

	}
/**
 * �ü��Ϊn������ָ��,һֱ������
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
