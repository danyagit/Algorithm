package com.xjf.algorithm.leetcode.shujujiegou.lianbiao;

import java.util.HashSet;

//160. œ‡Ωª¡¥±Ì
public class LianBiao01 {

	public static void main(String[] args) {
	}

	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		HashSet<ListNode> set = new HashSet<>();
		while (headA != null ) {
			set.add(headA);
			headA=headA.next;
		}
		while(headB!=null) {
			if(set.contains(headB)) {
				return headB;
			}
			headB=headB.next;
		}
		return null;
	}
}
