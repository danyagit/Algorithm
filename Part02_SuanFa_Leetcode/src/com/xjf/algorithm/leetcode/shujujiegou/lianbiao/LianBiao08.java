package com.xjf.algorithm.leetcode.shujujiegou.lianbiao;

import java.util.Stack;

//��������
/**
 * TODO �ÿռ临�Ӷ�Ϊ1,ʱ�临�Ӷ�ΪN�ķ�����ô��?
 * @author xjf
 *
 */
public class LianBiao08 {

	public static void main(String[] args) {

	}

	public boolean isPalindrome(ListNode head) {
		Stack<ListNode> stack = new Stack<>();
		ListNode headMark = head;
		while (head != null) {
			stack.add(head);
			head=head.next;
		}
		while(headMark!=null) {
			if(headMark.val!=stack.pop().val) {
				return false;
			}
			headMark=headMark.next;
		}
		return true;
	}

}
