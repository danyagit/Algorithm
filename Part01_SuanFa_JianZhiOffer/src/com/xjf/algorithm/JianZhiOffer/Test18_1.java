package com.xjf.algorithm.JianZhiOffer;

//在 O(1) 时间内删除链表节点，返回头结点
//思路：并没有用递归。删除：因为单向链表无法找到上一个元素，
//所以只能假删除：我要删除a节点，就让a的下一个节点b的value给到a，
//然后将a指向b的下一个节点c，这样就好像完成了a节点的删除。
//要分两类情况：要删的节点是否为最后一个节点
/**
 * 什么是时间复杂度
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
		//当要删除的元素是最后一个元素的时候，时间复杂度为N，但概率是1/N
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
		//要删除的元素不是最后一个元素,时间复杂度为1
		else {
			tobeDelete.val = tobeDelete.next.val;
			tobeDelete.next=tobeDelete.next.next;
		}
		
		return null;
	}

}
