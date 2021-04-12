package com.xjf.algorithm.leetcode.shujujiegou.shu.BST;

import java.util.ArrayList;
import java.util.List;

//8. 在二叉查找树中寻找两个节点，使它们的和为一个给定值
//先存放在list里面，再用双指针判断
public class BST08 {

	public static void main(String[] args) {

	}
	List<Integer> list = new ArrayList<>();
	public boolean findTarget(TreeNode root, int k) {
		dfs(root);
		int left = 0;
		int right = list.size()-1;
		while(left<right) {
			if(list.get(left)+list.get(right)>k) {
				right--;
			}else if(list.get(left)+list.get(right)<k) {
				left++;
			}else {
				return true;
			}
		}
		return false;
	}
	private void dfs(TreeNode root) {
		if(root==null) {
			return;
		}
		dfs(root.left);
		list.add(root.val);
		dfs(root.right);
	}
}
