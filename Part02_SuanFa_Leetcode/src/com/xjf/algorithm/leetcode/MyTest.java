package com.xjf.algorithm.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;

import org.junit.Test;


public class MyTest {
	
	
	@Test
	public void testLetter() {
		int a = 'z';
		System.out.println(a);
	}
	
	//测试匿名内部类
	@Test
	public void testAnonymousClass() {
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(5);
		TreeNode node3 = new TreeNode(3);
		TreeNode [] array = new TreeNode[3];
		array[0]=node1;
		array[1]=node2;
		array[2]=node3;
		Arrays.sort(array, new Comparator<TreeNode>() {
			@Override
			public int compare(TreeNode o1, TreeNode o2) {
				return o1.val-o2.val;
			}
		});
		System.out.println(array);
	}
	
	@Test
	public void testStackWithListNode() {
		Stack <ListNode> stack = new Stack<>();
		ListNode listNode1 = new ListNode(1);
		ListNode listNode2 = new ListNode(2);
		ListNode listNode3 = new ListNode(3);
		listNode1.next=listNode2;
		listNode2.next=listNode3;
		stack.push(listNode1);
		stack.push(listNode2);
		stack.push(listNode3);
		System.out.println(stack.pop().val);
		System.out.println(stack.pop().val);
		System.out.println(stack.pop().val);
	}
	
	@Test
	public void testTreeNode() {
		TreeNode node = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
//		TreeNode a=node.left;
//		a=node2;
		node.left=node2;
		System.out.println(node.left.val);
	}
	
	@Test
	public void testFinal() {
		final List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		System.out.println(list.toString());
	}
	
	
}
