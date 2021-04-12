package com.xjf.algorithm.leetcode.shujujiegou.shu.qianzhonghou;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//��������ǰ�����
/**
 * ����һ:�ݹ�ʵ�� ������:�ǵݹ�ʵ��
 * 
 * @author xjf
 *
 */
public class QianZhongHou01 {

	public static void main(String[] args) {

	}

	// �ǵݹ�ʵ��
	public List<Integer> preorderTraversal1(TreeNode root) {
		List<Integer> ret = new ArrayList<>();
		Stack<TreeNode> stack = new Stack<>();
		stack.push(root);
		while (!stack.isEmpty()) {
			TreeNode node = stack.pop();
			if (node == null)
				continue;
			ret.add(node.val);
			stack.push(node.right); // ���Һ��󣬱�֤�������ȱ���
			stack.push(node.left);
		}
		return ret;
	}

	// �ݹ�ʵ��
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
