package com.xjf.algorithm.leetcode.shujujiegou.shu.digui;

//�Գƶ�����
//����ÿ���ڵ�������ӽڵ�,�����ԭ����ͬ,��˵���ǶԳƵ�?
public class DiGui09 {

	public static void main(String[] args) {

	}

	public boolean isSymmetric(TreeNode root) {
		if (root == null) return true;
		return isSymmetric(root.left, root.right);
	}
	//�ж�������1,2�Ƿ�Գ�
	//���ж���1������������2���������Ƿ�Գ�,��1������������2���������Ƿ�Գ�
	public boolean isSymmetric(TreeNode left,TreeNode right) {
		if(left==null&&right==null) {
			return true;
		}
		if(left==null||right==null) {
			return false;
		}
		if(left.val!=right.val) {
			return false;
		}
		return isSymmetric(left.left, right.right)&&isSymmetric(left.right, right.left);
		
	}
	
}
