package com.xjf.algorithm.leetcode.shujujiegou.shu.digui;

//�ֵͬ·��
/**
 * 
 * @author xjf
 *
 */
public class DiGui12 {

	public static void main(String[] args) {
		DiGui12 diGui12 = new DiGui12();
		TreeNode root = new TreeNode(2);
		root.left = new TreeNode(1);
//		root.right = new TreeNode(5);
		root.left.left = new TreeNode(1);
//		root.left.right = new TreeNode(4);
//		root.right.right = new TreeNode(5);
		int path = diGui12.longestUnivaluePath(root);
		System.out.println(path);
	}

	public int longest = Integer.MIN_VALUE;

	public int longestUnivaluePath(TreeNode root) {
		if (root == null) {
			return 0;
		}
		pathOfNode(root);
		return longest;
	}

	// Ѱ����ĳһ���ڵ�Ϊ���ڵ�����ֵ·��,�������������������һ������
	//��Ѱ�ҵĹ�����,˳����ܰ����ĵ�ֵ·���ҳ���
	public int pathOfNode(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int leftLen = 0;
		int rightLen = 0;
		if (root.left != null) {
			if (root.val == root.left.val) {
				leftLen = pathOfNode(root.left);
			} else {
				pathOfNode(root.left);
			}
		} 
		if (root.right != null) {
			if (root.val == root.right.val) {
				rightLen = pathOfNode(root.right);
			} else {
				pathOfNode(root.right);
			}
		} 
//		��Ѱ�ҵĹ�����,˳����ܰ����ĵ�ֵ·���ҳ���
		if (leftLen + rightLen > longest) {
			longest = leftLen + rightLen;
		}
		return Math.max(leftLen, rightLen) + 1;
	}

/**
 * ����ķ��������˶�ζ�����,ʱ�临�Ӷ�̫��	
 */
//	public int curRoot;
//	public int longest=Integer.MIN_VALUE;
//	��������������
//	public int longestUnivaluePath(TreeNode root) {
//		if(root==null) {
//			return 0;
//		}
//		curRoot=root.val;
//		if(pathOfNode(root.left)+pathOfNode(root.right)>longest) {
//			longest=pathOfNode(root.left)+pathOfNode(root.right);
//		}
//		longestUnivaluePath(root.left);
//		longestUnivaluePath(root.right);
//		return longest;
//	}
//	
//	
//	//Ѱ����ĳһ���ڵ�Ϊ���ڵ�����ֵ·��,�������������������һ������
//	public int pathOfNode(TreeNode root) {
//		if(root==null||root.val!=curRoot) {
//			return 0;
//		}
//		//��ڵ��������
//		int leftPath = pathOfNode(root.left);
//		//�ҽڵ��������
//		int rightPath = pathOfNode(root.right);
//		return Math.max(leftPath, rightPath)+1;
//	}

}
