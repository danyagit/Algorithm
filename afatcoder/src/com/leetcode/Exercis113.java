package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Exercis113 {

	public static void main(String[] args) {

	}
	//�������Ӹ���Ҷ�ӽڵ��·���ͣ���û�е���target�ģ��ҳ����ŵ�list����
	//�ݹ������������root��list�����浱ǰ�ڵ�ֵ����sum����ǰ�ͣ�
	//�������ѽڵ�ӵ�list��sum��ȥ�������ǰ�ڵ���Ҷ�ӽڵ���sumΪ���󣬾ʹ洢�������ȫ�ֱ������С�
	//ע�⣺list��Ҫ��֦
	List<List<Integer>> result = new ArrayList<>(); 
	int targetSum;
	public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
		this.targetSum=targetSum;
		pathSum(root,0,new ArrayList<Integer>());
		return this.result;
	}
	private void pathSum(TreeNode root,int sum,List<Integer>list) {
		if(root==null) {
			return;
		}
		sum=sum+root.val;
		list.add(root.val);
		if(root.left==null&&root.right==null&&sum==targetSum) {
			result.add(new ArrayList<>(list));
			return;
		}
		pathSum(root.left, sum,list);
		if(root.left!=null) {
			list.remove(list.size()-1);
		}
		pathSum(root.right, sum,list);
		if(root.right!=null) {
			list.remove(list.size()-1);
		}
	}

}
