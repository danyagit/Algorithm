package com.xjf.algorithm.leetcode.suanfasixiang.shuangzhizhen;

import java.util.HashSet;
import java.util.Set;

//��������
//����һ�������ж��������Ƿ��л���
//�����������ĳ���ڵ㣬����ͨ���������� next ָ���ٴε��
//�������д��ڻ��� Ϊ�˱�ʾ���������еĻ�������ʹ������ pos 
//����ʾ����β���ӵ������е�λ�ã������� 0 ��ʼ���� 
//��� pos �� -1�����ڸ�������û�л���ע�⣺pos ����Ϊ�������д��ݣ�
//������Ϊ�˱�ʶ�����ʵ�������
//��������д��ڻ����򷵻� true �� ���򣬷��� false ��

public class Test06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public boolean hasCycle(ListNode head) {
		Set<ListNode> set = new HashSet<>();
		while(head!=null) {
			if(set.contains(head)) {
				return true;
			}
			set.add(head);
			head=head.next;
		}
		return false;
	}
}
