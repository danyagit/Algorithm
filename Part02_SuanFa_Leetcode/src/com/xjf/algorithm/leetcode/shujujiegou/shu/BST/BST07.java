package com.xjf.algorithm.leetcode.shujujiegou.shu.BST;
//7. 根据有序链表构造平衡的二叉查找树
//跟上一题的总体结构是一样的，只不过多了一个找中间节点的过程（不要忘记切断中间节点的和前半部分的关系）
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
	int cnt=0;//加这个cnt是为了防止head只剩一个时的死循环
	public TreeNode sortedListToBST(ListNode head) {
		if(head==null||cnt==1) {
			cnt=0;
			return null;
		}
		ListNode mid = getMid(head);//这里会从中间切断
		TreeNode root = new TreeNode(mid.val);
		root.left=sortedListToBST(head);
		root.right=sortedListToBST(mid.next);
		return root;
    }
	//快慢指针得到中间元素
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
