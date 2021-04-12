package com.leetcode;

public class Exercise124 {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(9);
		TreeNode node1 = new TreeNode(6);
		TreeNode node2 = new TreeNode(-3);
		TreeNode node3 = new TreeNode(-6);
		TreeNode node4 = new TreeNode(2);
		TreeNode node5 = new TreeNode(2);
		TreeNode node6 = new TreeNode(-6);
		TreeNode node7 = new TreeNode(-6);
		TreeNode node8 = new TreeNode(-6);
		root.left=node1;
		root.right=node2;
		node2.left=node3;
		node2.right=node4;
		node4.left=node5;
		node5.left=node6;
		node5.right=node7;
		node7.left=node8;
		Exercise124 exercise124 = new Exercise124();
		int maxPathSum = exercise124.maxPathSum(root);
		System.out.println(maxPathSum);
	}
	
	//˼·������һ���ֲ�(root,left,right)��ÿ�εݹ鷵���Ը�root���������ֵ�����������������ֵ+root�����������ֵ+root��������ֻ��root�Լ���
	//�ݹ�Ĺ����л�Ҫ�ǵø���ȫ�����ֵmax����ֵ�����������ֵ+root�����������ֵ+root��root�Լ������������ֵ+root+�������ֵ��ѡһ��
	//����֮�⣬��Ҫ����Ҷ�ӽڵ�С��0�����
	//�����Ǵ������ϵķ������������ظ�����
	int max = Integer.MIN_VALUE;

	public int maxPathSum(TreeNode root) {
		max(root);
		return max;
	}

	public int max(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int leftMax;
		int rightMax;
		if (root.val < 0) {//���ǵ�Ҷ�ӽڵ�С��0��ʱ�򣬵��·���0
			if (root.left == null && root.right == null) {
				max = Math.max(max, root.val);
				return root.val;
			} else if (root.left == null) {
				rightMax = max(root.right);
				max = Math.max(max, Math.max(rightMax+root.val, root.val));
				return root.val + rightMax;
			} else if (root.right == null) {
				leftMax = max(root.left);
				max = Math.max(max, Math.max(leftMax+root.val, root.val));
				return root.val + leftMax;
			}
		}
		leftMax = max(root.left);
		rightMax = max(root.right);
		int curChain = leftMax + rightMax + root.val;
		max = Math.max(max, Math.max(curChain, Math.max(leftMax+root.val, Math.max(rightMax+root.val, root.val))));
		return Math.max(leftMax, Math.max(rightMax, 0)) + root.val;
	}
}
