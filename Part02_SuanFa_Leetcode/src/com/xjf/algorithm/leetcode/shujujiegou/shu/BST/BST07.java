package com.xjf.algorithm.leetcode.shujujiegou.shu.BST;
//7. ��������������ƽ��Ķ��������
//����һ�������ṹ��һ���ģ�ֻ��������һ�����м�ڵ�Ĺ��̣���Ҫ�����ж��м�ڵ�ĺ�ǰ�벿�ֵĹ�ϵ��
public class BST07 {

	public static void main(String[] args) {
		ListNode head1 = new ListNode(-10);
		ListNode head2 = new ListNode(-3);
		ListNode head3 = new ListNode(0);
		ListNode head4 = new ListNode(5);
		ListNode head5 = new ListNode(9);
		head1.next=head2;
		head2.next=head3;
		head3.next=head4;
		head4.next=head5;
		BST07 bst07 = new BST07();
		TreeNode sortedListToBST = bst07.sortedListToBST(head1);
		System.out.println(sortedListToBST);

	}
	int cnt=0;//�����cnt��Ϊ�˷�ֹheadֻʣһ��ʱ����ѭ��
	public TreeNode sortedListToBST(ListNode head) {
		if(head==null||cnt==1) {
			cnt=0;
			return null;
		}
		ListNode mid = getMid(head);//�������м��ж�
		TreeNode root = new TreeNode(mid.val);
		root.left=sortedListToBST(head);
		root.right=sortedListToBST(mid.next);
		return root;
    }
	//����ָ��õ��м�Ԫ��
	private ListNode getMid(ListNode head) {
		if(head.next==null) {
			cnt++;
			return head;
		}
		ListNode slow = head;
		ListNode fast = head;
		ListNode res = null;
		while(fast.next!=null) {
			fast = fast.next.next;
			if(fast==null||fast.next==null) {
				res = slow.next;
				slow.next=null;
				break;
			}
			slow = slow.next;
		}
		return res;
	}
}
