package com.leetcode;

public class Exercise110 {

	public static void main(String[] args) {

	}
	//�Ƿ�Ϊƽ������������������߶Ȳ�������1
	//��һ����߶ȵĺ��������ˡ�ֻ���ڵݹ�Ĺ����м�һ���жϵĲ��裬��ȫ�ֱ�����ֵ��
	boolean flag=true;
	public boolean isBalanced(TreeNode root) {
		height(root);
		return flag;
	}
	public int height(TreeNode root) {
		if(root==null) {
			return 0;
		}
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);
		if(leftHeight-rightHeight>1||leftHeight-rightHeight<-1) {
			flag=false;
		}
		return Math.max(leftHeight, rightHeight)+1;
	}
	
	
}
