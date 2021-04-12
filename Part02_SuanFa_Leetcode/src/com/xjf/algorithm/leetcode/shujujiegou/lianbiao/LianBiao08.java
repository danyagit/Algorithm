package com.xjf.algorithm.leetcode.shujujiegou.lianbiao;

import java.util.Stack;

//回文链表
/**
 * TODO 用空间复杂度为1,时间复杂度为N的方法怎么做?
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
