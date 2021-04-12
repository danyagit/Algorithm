package com.xjf.algorithm.leetcode.shujujiegou.lianbiao;

//725. �ָ�����

/**
 * �㷨ţ��,�����˰ٷ�֮99����
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
		//ǰb��a+1���ȵ�,��(k-b)��a���ȵ�
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
			rootMark=curRoot;//�˴�������curRoot��rootMark�������,���ѵ�
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
