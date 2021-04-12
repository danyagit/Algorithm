package com.leetcode;

//���԰�ÿk������һ�����巭ת���ڲ�����ת�����ٷ�ת��������
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
		//����׼�������п���Ҫ�õ����ã���������޸ķǳ���ʱ��
		ListNode head1 = head;
		ListNode curHead=head;
		ListNode curHeadNext;
		ListNode curTail;
		ListNode preTail=null;
		ListNode nextHead=null;
		//�ܽ�һ�´����һ�㲽�裺��ǰ������б�����һ�������
		//һ��һ�εط�ת����head1ָ����k�ı�����Ԫ�ص�ʱ��˵���ܷ�ת��
		//��ת֮ǰ���жϴ˶���������ϵ����Ȼ��Ҫ��������ͷ��㡣
		//���ӵ�ʱ��������һ������ת֮�����һ�η�ת֮���β�ڵ����ӵ��˴η�ת֮���ͷ���
		int i = 0;
		while (head1 != null) {
			head1 = head1.next;
			i++;
			if (i == k - 1 && head1 != null) {
				curTail = head1;
				nextHead=curTail.next;
				//�и�
				curTail.next=null;
				//��ʼ��ת
				curHeadNext=curHead.next;
				curHead.next=null;
				ListNode reverse = reverse(curHead,curHeadNext);
				if(preTail!=null) {
					preTail.next=reverse;
				}
				//��ǰ��β�ͱ����ͷ
				preTail = curHead;
				head1=nextHead;
				i=0;
				curHead=nextHead;
			} else if (head1 == null) {
				preTail.next=nextHead;	//����˴β����ɷ�ת����Ҫ�Ѵ˴α�����ͷ������ӵ��ϴε�β����
				break;
			}
		}
		return result;

	}
	
	//����reverse֮ǰ�������head��nextһ��ҪΪnull
	public ListNode reverse(ListNode head, ListNode next) {
		if (next == null) {
			return head;
		}
		ListNode next2 = next.next;
		next.next = head;
		return reverse(next, next2);
	}
}
