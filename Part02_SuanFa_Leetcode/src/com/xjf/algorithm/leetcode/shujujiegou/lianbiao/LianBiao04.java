package com.xjf.algorithm.leetcode.shujujiegou.lianbiao;

//删除排序链表中的重复元素
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
	
	//发现在递归中增加一个节点变得好理解了
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