package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Exercis113 {

	public static void main(String[] args) {

	}
	//二叉树从根到叶子节点的路径和，有没有等于target的，找出来放到list里面
	//递归参数有三个：root、list（保存当前节点值）、sum（当前和）
	//做法：把节点加到list和sum中去，如果当前节点是叶子节点且sum为所求，就存储到结果（全局变量）中。
	//注意：list需要剪枝
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
