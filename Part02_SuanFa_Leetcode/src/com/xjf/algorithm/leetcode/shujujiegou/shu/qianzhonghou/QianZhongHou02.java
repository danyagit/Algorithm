package com.xjf.algorithm.leetcode.shujujiegou.shu.qianzhonghou;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;


//�������ĺ������
/**
 * ����һ:�ݹ�ʵ�� ������:�ǵݹ�ʵ��
 * 
 * @author xjf
 *
 */
public class QianZhongHou02 {

	public static void main(String[] args) {

	}

	// �ǵݹ�ʵ��
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
