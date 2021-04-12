package com.xjf.algorithm.JianZhiOffer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//��������ĸ���:����
//����һ����������ÿ���ڵ����нڵ�ֵ���Լ�����ָ�룬
//һ��ָ����һ���ڵ㣬��һ������ָ��randomָ��һ������ڵ㣩
//����Դ������������������ؿ������ͷ��㡣
//��ע�⣬���������벻Ҫ���ز����еĽڵ����ã�
//������������ֱ�ӷ��ؿգ�

/**
 * ����֮��pHead��Ȼ��ԭ�������ͷ�ڵ㣬ԭ����һ�㶼���ܱ䣡
 * �����ڲ�ֵ���һ��Ҫע�⣬���ܲ���ԭ��������Ҫ�ָ���ԭ��������
 * @author xjf
 *
 */

public class Test35 {

	private static Integer addr;

	public static void main(String[] args) {
		RandomListNode randomListNode1 = new RandomListNode(1);
		RandomListNode randomListNode2 = new RandomListNode(2);
		RandomListNode randomListNode3 = new RandomListNode(3);
		RandomListNode randomListNode4 = new RandomListNode(4);
		randomListNode1.next = randomListNode2;
		randomListNode2.next = randomListNode3;
		randomListNode3.next = randomListNode4;
		randomListNode1.random = randomListNode4;
		randomListNode2.random = randomListNode1;
		randomListNode3.random = null;
		randomListNode4.random = null;

		RandomListNode node = Clone(randomListNode1);
		System.out.println(node.label);

	}
	
	public static RandomListNode Clone(RandomListNode pHead) {
		if(pHead==null){
            return null;
        }
		RandomListNode head = new RandomListNode(pHead.label);
		RandomListNode srcHead = pHead;
		RandomListNode resultHead = head;
		RandomListNode result = head;
		Map<RandomListNode,Integer> srcHashMap = new HashMap<>();
		List<RandomListNode> list = new ArrayList<>();
		srcHashMap.put(pHead, 0);
		list.add(head);
		pHead=pHead.next;
		int i=1;
		while(pHead!=null) {
			srcHashMap.put(pHead, i);
			head.next=new RandomListNode(pHead.label);
			list.add(head.next);
			pHead=pHead.next;
			head=head.next;
			i++;
		}
		int addr = -1;
		while(srcHead!=null) {
			if(srcHead.random==null) {
				resultHead.random=null;
				srcHead=srcHead.next;
				resultHead=resultHead.next;
				continue;
			}
			addr = srcHashMap.get(srcHead.random);
			resultHead.random=list.get(addr);
			srcHead=srcHead.next;
			resultHead=resultHead.next;
		}
		return result;
	}

	//��ǰ����
//	public static RandomListNode Clone(RandomListNode pHead) {
//		RandomListNode headMark = pHead;
//		if (headMark == null) {
//			return null;
//		}
//		if (headMark.next == null) {
//			return new RandomListNode(headMark.label);
//		}
//		
//		//�ڽڵ��������ķ���
//		while (headMark != null) {
//			if (headMark.next != null) {
//				RandomListNode next = headMark.next;
//				headMark.next = new RandomListNode(headMark.label);
//				headMark.next.next = next;
//				headMark = next;
//			} else {
//				headMark.next = new RandomListNode(headMark.label);
//				break;
//			}
//
//		}
//		
//		//�����random����null����������random��ϵ
//		headMark = pHead;
//		while (headMark != null) {
//			if (headMark.random != null) {
//				headMark.next.random = headMark.random.next;
//			}
//			headMark = headMark.next.next;
//		}
//
//		//���
//		RandomListNode cloneHead = pHead.next;
//		headMark = pHead;
//		while (headMark.next != null) {
//			RandomListNode next = headMark.next;
//			headMark.next=headMark.next.next;
//			headMark=next;
//		}
//		return cloneHead;
//	}

}
