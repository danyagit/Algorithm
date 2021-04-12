package com.leetcode;

//可以把每k个当成一个整体翻转（内部不翻转），再翻转整个链表
public class Exercise25 {

	public static void main(String[] args) {
		Exercise25 exercise25 = new Exercise25();
		ListNode head = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);
		head.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		ListNode result = exercise25.reverseKGroup(head, 2);
		System.out.println(result);
	}

	public ListNode reverseKGroup(ListNode head, int k) {
		if(k==1) {
			return head;
		}
		ListNode result = head;
		for (int i = 0; i < k-1; i++) {
			result =result.next;
		}
		//事先准备好所有可能要用的引用，否则后面修改非常耗时间
		ListNode head1 = head;
		ListNode curHead=head;
		ListNode curHeadNext;
		ListNode curTail;
		ListNode preTail=null;
		ListNode nextHead=null;
		//总结一下此题的一般步骤：从前到后进行遍历，一遍就行了
		//一段一段地翻转，当head1指向了k的倍数的元素的时候，说明能翻转。
		//翻转之前，切断此段与后面的联系，当然，要保存后面的头结点。
		//连接的时机：在下一次做翻转之后把上一次反转之后的尾节点连接到此次反转之后的头结点
		int i = 0;
		while (head1 != null) {
			head1 = head1.next;
			i++;
			if (i == k - 1 && head1 != null) {
				curTail = head1;
				nextHead=curTail.next;
				//切割
				curTail.next=null;
				//开始翻转
				curHeadNext=curHead.next;
				curHead.next=null;
				ListNode reverse = reverse(curHead,curHeadNext);
				if(preTail!=null) {
					preTail.next=reverse;
				}
				//当前的尾巴变成了头
				preTail = curHead;
				head1=nextHead;
				i=0;
				curHead=nextHead;
			} else if (head1 == null) {
				preTail.next=nextHead;	//如果此次不构成翻转，则要把此次遍历的头结点连接到上次的尾巴上
				break;
			}
		}
		return result;

	}
	
	//调用reverse之前，传入的head的next一定要为null
	public ListNode reverse(ListNode head, ListNode next) {
		if (next == null) {
			return head;
		}
		ListNode next2 = next.next;
		next.next = head;
		return reverse(next, next2);
	}
}
