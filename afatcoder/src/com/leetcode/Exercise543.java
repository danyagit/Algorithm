package com.leetcode;

public class Exercise543 {

	public static void main(String[] args) {

	}
	
	//�����������ֱ����ԭ��Ͷ����������·������һ���ģ�����ͨ��һ���ֲ�ȥ����
	//�ݹ麯��Ҫ���ؾ�����root����󳤶ȣ�������������һ�����Ȼ���һ���������ڵݹ�Ĺ����У�Ҫ�������ֵ����max��curChain�ȽϾ����ˣ�
	int max=0;
	public int diameterOfBinaryTree(TreeNode root) {
		if(root==null) {
			return max;
		}
		diameter(root);
		return max-1;
	}
	public int diameter(TreeNode root) {
		if(root==null) {
			return 0;
		}
		int leftLength=diameter(root.left);
		int rightLength=diameter(root.right);
		int curChain = leftLength+rightLength+1;
		max=Math.max(curChain, max);
		return Math.max(leftLength, rightLength)+1;
	}
	
	
	
}
