package com.leetcode;

import java.util.Arrays;

public class Exercis105 {

	public static void main(String[] args) {

	}
	//ǰ�򣺸�-��-��  ������-��-��
	//	ǰ����� preorder = [3,9,20,15,7]
	//	������� inorder =  [9,3,15,20,7]
	//�����˼·�������ģ� 
	//ÿ�εݹ��ʱ��pre��in��������ĳ��ȿ϶���һ���ġ�pre�ĵ�һ��Ԫ�ع�����ڵ�
	//��[9]��[9]������������[20,15,7]��[15,20,7]����������
	//�ݹ���ڣ����鳤��Ϊ1
	public TreeNode buildTree(int[] preorder, int[] inorder) {
		if(preorder==null||preorder.length==0) {
			return null;
		}
		if(preorder.length==1) {
			return new TreeNode(preorder[0]);
		}
		TreeNode root = new TreeNode(preorder[0]);
		int index = getIndex(preorder[0],inorder);
		root.left=buildTree(Arrays.copyOfRange(preorder, 1, index+1), Arrays.copyOfRange(inorder, 0, index));
		root.right=buildTree(Arrays.copyOfRange(preorder, index+1, preorder.length), Arrays.copyOfRange(inorder, index+1, inorder.length));
		return root;
	}
	private int getIndex(int i, int[] inorder) {
		for (int j = 0; j < inorder.length; j++) {
			if(inorder[j]==i) {
				return j;
			}
		}
		return -1;
	}

}
