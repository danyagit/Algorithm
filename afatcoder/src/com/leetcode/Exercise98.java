package com.leetcode;

public class Exercise98 {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(5);
		TreeNode node2 = new TreeNode(4);
		TreeNode node3 = new TreeNode(6);
		TreeNode node4 = new TreeNode(3);
		TreeNode node5 = new TreeNode(7);
	}

	public boolean isValidBST(TreeNode root) {
		return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
	}
	//�����ǰ�ڵ����������½緶Χ���ʹ������µݹ飨���������������жϽ�������������´���һ�����½�
	//�������������½�͸��ڵ�һ�����Ͻ�Ϊ���ڵ��ֵ
	//�������������Ͻ�͸��ڵ�һ�����½�Ϊ���ڵ��ֵ
	public boolean isValidBST(TreeNode node, long lower, long upper) {
		if (node == null) {
			return true;
		}
		if (node.val <= lower || node.val >= upper) {
			return false;
		}
		return isValidBST(node.left, lower, node.val) && isValidBST(node.right, node.val, upper);
	}
}
