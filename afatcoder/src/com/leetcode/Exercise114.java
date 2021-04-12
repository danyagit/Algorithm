package com.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Exercise114 {

	public static void main(String[] args) {

	}

	// ����һ���ݹ�ǰ���������list���棬����list�޸�ָ���ϵ
	// ���������������������ݽṹ����С�ռ临�Ӷ�
	// ��ϰ���ǵݹ��ǰ�����
	public void flatten(TreeNode root) {
		//������
		while(root!=null) {
			//������������������Ȼ�ͼ�����һ��������
			if(root.left!=null) {
				TreeNode pre=root.left;
				pre = root.left;
				//�ҵ����������ұ߽ڵ�pre
				while(pre.right!=null) {
					pre=pre.right;
				}
				//���������ӵ�pre����
				pre.right=root.right;
				
				root.right=root.left;
				root.left=null;
			}
			root=root.right;
		}
	}
	
	//�ǵݹ�ʵ�ֶ�������ǰ�����
	public List<TreeNode> preOrder(TreeNode root) {
		Stack<TreeNode> stack = new Stack<>();
		List<TreeNode> list = new ArrayList<>();
		stack.push(root);
		while(stack.isEmpty()) {
			TreeNode pop = stack.pop();
			list.add(pop);
			if(pop.left!=null) {
				stack.push(pop.right);//�ȼ��ң���
			}
			if(pop.right!=null) {
				stack.push(pop.left);
			}
		}
		return list;
	}

}
