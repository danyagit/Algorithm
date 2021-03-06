package com.xjf.algorithm.leetcode.shujujiegou.shu.qianzhonghou;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//二叉树的中序遍历
/**
 * 方法一:递归实现 方法二:非递归实现
 * 
 * @author xjf
 *
 */
public class QianZhongHou03 {

	public static void main(String[] args) {

	}

	// 非递归实现
	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> ret = new ArrayList<>();
		if (root == null)
			return ret;
		Stack<TreeNode> stack = new Stack<>();
		TreeNode cur = root;
		while (cur != null || !stack.isEmpty()) {
			while (cur != null) {
				stack.push(cur);
				cur = cur.left;
			}
			TreeNode node = stack.pop();
			ret.add(node.val);
			cur = node.right;
		}
		return ret;
	}
}
