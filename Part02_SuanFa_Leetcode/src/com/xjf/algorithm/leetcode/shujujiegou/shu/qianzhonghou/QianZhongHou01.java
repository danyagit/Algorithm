package com.xjf.algorithm.leetcode.shujujiegou.shu.qianzhonghou;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//二叉树的前序遍历
/**
 * 方法一:递归实现 方法二:非递归实现
 * 
 * @author xjf
 *
 */
public class QianZhongHou01 {

	public static void main(String[] args) {

	}

	// 非递归实现
	public List<Integer> preorderTraversal1(TreeNode root) {
		List<Integer> ret = new ArrayList<>();
		Stack<TreeNode> stack = new Stack<>();
		stack.push(root);
		while (!stack.isEmpty()) {
			TreeNode node = stack.pop();
			if (node == null)
				continue;
			ret.add(node.val);
			stack.push(node.right); // 先右后左，保证左子树先遍历
			stack.push(node.left);
		}
		return ret;
	}

	// 递归实现
	List<Integer> list;

	public List<Integer> preorderTraversal(TreeNode root) {
		list = new ArrayList<>();
		dfs(root);
		return list;
	}

	private void dfs(TreeNode root) {
		if (root == null) {
			return;
		}
		list.add(root.val);
		dfs(root.left);
		dfs(root.right);
	}
}
