package com.xjf.algorithm.leetcode.shujujiegou.lianbiao;

import java.util.Stack;

//两数相加 II
//输入：(7 -> 2 -> 4 -> 3) + (5 -> 6 -> 4)
//输出：7 -> 8 -> 0 -> 7
/**
 * 用栈去存储节点,用pop完成反向输出
 * @author xjf
 *
 */
public class LianBiao07 {

	public static void main(String[] args) {
		ListNode listNode1 = new ListNode(8);
		ListNode listNode2 = new ListNode(9);
		ListNode listNode3 = new ListNode(9);
		listNode1.next=listNode2;
		listNode2.next=listNode3;
		ListNode listNode4 = new ListNode(2);
//		ListNode listNode5 = new ListNode(6);
//		ListNode listNode6 = new ListNode(4);
//		listNode4.next=listNode5;
//		listNode5.next=listNode6;
		
		LianBiao07 lianBiao07 = new LianBiao07();
		ListNode node = lianBiao07.addTwoNumbers(listNode1, listNode4);
		System.out.println(node);
	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		Stack<ListNode> stack1 = saveToStack(l1);
		Stack<ListNode> stack2 = saveToStack(l2);
		if (stack1.size() >= stack2.size()) {
			return doAdd(stack1, stack2);
		} else {
			return doAdd(stack2, stack1);
		}
	}

	/**
	 * @param stack1 默认stack1.size()>=stack2.size();
	 * @param stack2 把stack2加到stack1上去
	 */
	int curSum = 0;

	private ListNode doAdd(Stack<ListNode> stack1, Stack<ListNode> stack2) {
		ListNode head = null;
		while (!stack1.isEmpty()) {
			if (!stack2.isEmpty()) {
				curSum = stack1.peek().val + stack2.peek().val+curSum/10;
				if (curSum >= 10) {
					stack1.peek().val = curSum % 10;
					head=stack1.pop();
					stack2.pop();
				} else {
					stack1.peek().val=curSum;
					head=stack1.pop();
					stack2.pop();
				}
			}
			else {
				curSum=stack1.peek().val + curSum / 10;
				if(curSum >= 10) {
					stack1.peek().val=curSum%10;
					head=stack1.pop();
				}else {
					stack1.peek().val=curSum;
					head=stack1.pop();
				}
			}
		}
		ListNode node=null;
		if(curSum>=10) {
			node = new ListNode(curSum/10);
			node.next=head;
		}
		if(node==null) {
			return head;
		}else {
			return node;
		}
	}

	private Stack<ListNode> saveToStack(ListNode l1) {
		Stack<ListNode> stack = new Stack<>();
		while (l1 != null) {
			stack.push(l1);
			l1 = l1.next;
		}
		return stack;
	}

}
