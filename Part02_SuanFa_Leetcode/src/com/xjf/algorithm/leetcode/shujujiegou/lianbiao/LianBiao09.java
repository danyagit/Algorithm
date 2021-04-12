package com.xjf.algorithm.leetcode.shujujiegou.lianbiao;

//725. 分隔链表

/**
 * 算法牛逼,超过了百分之99的人
 * @author xjf
 */
public class LianBiao09 {

	public static void main(String[] args) {
		ListNode listNode1 = new ListNode(1);
		ListNode listNode2 = new ListNode(2);
		ListNode listNode3 = new ListNode(3);
		listNode1.next=listNode2;
		listNode2.next=listNode3;
		LianBiao09 lianBiao09 = new LianBiao09();
		ListNode[] nodes = lianBiao09.splitListToParts(listNode1, 4);
		System.out.println(nodes);
	}

	public ListNode[] splitListToParts(ListNode root, int k) {
		ListNode[] result = new ListNode[k];
		ListNode rootMark = root;
		ListNode curRoot=root;
		int len=0;
		while(root!=null) {
			len++;
			root=root.next;
		}
		//前b个a+1长度的,后(k-b)个a长度的
		int a = len/k;
		int b = len%k;
		int[] array = new int[k];
		for (int i = 0; i < b; i++) {
			array[i]=a+1;
		}
		for (int i = b; i < k; i++) {
			array[i]=a;
		}
		
		for (int i = 0; i < array.length; i++) {
			if(array[i]==0) {
				break;
			}
			rootMark=curRoot;//此处创建了curRoot和rootMark两个标记,是难点
			result[i]=curRoot;
			int j = 1;
			while(j<array[i]) {
				j++;
				rootMark = rootMark.next;
			}
			curRoot=rootMark.next;
			rootMark.next=null;
		}
		return result;
	}
}
