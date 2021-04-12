package com.xjf.algorithm.JianZhiOffer;

import java.util.HashSet;

//两个链表的第一个公共结点
//输入两个链表，找出它们的第一个公共结点。（注意因为传入数据是链表，
//所以错误测试数据的提示是用其他方式显示的，保证传入数据是正确的）
/**
 * 思想：用HashSet的元素不可重复性
 * @author xjf
 *
 */
public class Test52 {

	public static void main(String[] args) {

	}

	public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
		HashSet<ListNode> set = new HashSet<>();
		while (pHead1 != null) {
			set.add(pHead1);
			pHead1 = pHead1.next;
		}
		int size = 0;
		while (pHead2 != null) {
			size = set.size();
			set.add(pHead2);
			if (size == set.size()) {
				return pHead2;
			}
			pHead2 = pHead2.next;
		}
		return null;
	}
}
