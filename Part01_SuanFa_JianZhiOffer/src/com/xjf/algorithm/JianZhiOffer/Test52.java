package com.xjf.algorithm.JianZhiOffer;

import java.util.HashSet;

//��������ĵ�һ���������
//�������������ҳ����ǵĵ�һ��������㡣��ע����Ϊ��������������
//���Դ���������ݵ���ʾ����������ʽ��ʾ�ģ���֤������������ȷ�ģ�
/**
 * ˼�룺��HashSet��Ԫ�ز����ظ���
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
