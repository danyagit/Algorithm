package com.xjf.algorithm.JianZhiOffer;

//�� O(1) ʱ����ɾ������ڵ㣬����ͷ���
//˼·����û���õݹ顣ɾ������Ϊ���������޷��ҵ���һ��Ԫ�أ�
//����ֻ�ܼ�ɾ������Ҫɾ��a�ڵ㣬����a����һ���ڵ�b��value����a��
//Ȼ��aָ��b����һ���ڵ�c�������ͺ��������a�ڵ��ɾ����
//Ҫ�����������Ҫɾ�Ľڵ��Ƿ�Ϊ���һ���ڵ�
/**
 * ʲô��ʱ�临�Ӷ�
 * 
 * @param args
 */
public class Test18_1 {
	public static void main(String[] args) {

	}

	public ListNode deleteNode(ListNode head, ListNode tobeDelete) {
		if(head==null||tobeDelete==null) {
			return head;
		}
		//��Ҫɾ����Ԫ�������һ��Ԫ�ص�ʱ��ʱ�临�Ӷ�ΪN����������1/N
		if(tobeDelete.next==null) {
			if(tobeDelete==head) {
				return null;
			}
			ListNode myHead = head;
			while(myHead.next!=tobeDelete) {
				myHead=myHead.next;
			}
			myHead.next=null;
		}
		//Ҫɾ����Ԫ�ز������һ��Ԫ��,ʱ�临�Ӷ�Ϊ1
		else {
			tobeDelete.val = tobeDelete.next.val;
			tobeDelete.next=tobeDelete.next.next;
		}
		
		return null;
	}

}
