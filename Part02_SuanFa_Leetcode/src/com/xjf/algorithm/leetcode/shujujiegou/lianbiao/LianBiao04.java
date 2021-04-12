package com.xjf.algorithm.leetcode.shujujiegou.lianbiao;

//ɾ�����������е��ظ�Ԫ��
public class LianBiao04 {

	public static void main(String[] args) {

	}

	public ListNode deleteDuplicates(ListNode head) {
		if(head==null) {
			return null;
		}
		ListNode next = head.next;
		delete(head, next);
		return head;
	}
	
	//�����ڵݹ�������һ���ڵ��ú������
	private void delete(ListNode head, ListNode next) {
		if (next == null) {
			return;
		}
		if (head.val == next.val) {
			head.next = next.next;
			delete(head, head.next);
		} else {
			delete(next, next.next);
		}
	}
}