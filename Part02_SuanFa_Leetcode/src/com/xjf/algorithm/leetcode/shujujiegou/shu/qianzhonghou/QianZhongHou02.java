package com.xjf.algorithm.leetcode.shujujiegou.shu.qianzhonghou;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;


//二叉树的后序遍历
/**
 * 方法一:递归实现 方法二:非递归实现
 * 
 * @author xjf
 *
 */
public class QianZhongHou02 {

	public static void main(String[] args) {

	}

	// 非递归实现
	public List<Integer> postorderTraversal(TreeNode root) {
	    List<Integer> ret = new ArrayList<>();
	    Stack<TreeNode> stack = new Stack<>();
	    stack.push(root);
	    while (!stack.isEmpty()) {
	        TreeNode node = stack.pop();
	        if (node == null) continue;
	        ret.add(node.val);
	        stack.push(node.left);
	        stack.push(node.right);
	    }
	    Collections.reverse(ret);
	    return ret;
	}
}
