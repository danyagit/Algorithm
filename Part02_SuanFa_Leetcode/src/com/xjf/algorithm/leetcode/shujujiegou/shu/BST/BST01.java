package com.xjf.algorithm.leetcode.shujujiegou.shu.BST;

//�޼�����������
public class BST01 {

	public static void main(String[] args) {

	}


	public TreeNode trimBST(TreeNode root, int low, int high) {
		if (root == null) return null;
		//�ýڵ�̫�󣬳��Է������ұ߽ڵ�
	    if (root.val > high) return trimBST(root.left, low, high);
	    //�ýڵ�̫С�����Է�������߽ڵ�
	    if (root.val < low) return trimBST(root.right, low, high);
	    //�ýڵ��ڷ�Χ֮�ڣ����ظýڵ�
	    root.left = trimBST(root.left, low, high);
	    root.right = trimBST(root.right, low, high);
	    return root;
	}

}