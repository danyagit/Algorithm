package com.xjf.algorithm.JianZhiOffer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//复杂链表的复制:链表
//输入一个复杂链表（每个节点中有节点值，以及两个指针，
//一个指向下一个节点，另一个特殊指针random指向一个随机节点）
//，请对此链表进行深拷贝，并返回拷贝后的头结点。
//（注意，输出结果中请不要返回参数中的节点引用，
//否则判题程序会直接返回空）

/**
 * 拷贝之后pHead依然是原来链表的头节点，原链表一点都不能变！
 * 所以在拆分的那一步要注意，不能不管原来的链表，要恢复它原来的样子
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

	//以前做的
//	public static RandomListNode Clone(RandomListNode pHead) {
//		RandomListNode headMark = pHead;
//		if (headMark == null) {
//			return null;
//		}
//		if (headMark.next == null) {
//			return new RandomListNode(headMark.label);
//		}
//		
//		//在节点后插入它的分身
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
//		//分身的random还是null，给分身建立random关系
//		headMark = pHead;
//		while (headMark != null) {
//			if (headMark.random != null) {
//				headMark.next.random = headMark.random.next;
//			}
//			headMark = headMark.next.next;
//		}
//
//		//拆分
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
