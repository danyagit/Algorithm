package com.xjf.algorithm.leetcode.suanfasixiang.sousuo;

import java.util.ArrayList;
import java.util.List;

//������������·��

public class Backtracking04 {

	public static void main(String[] args) {

		Backtracking04 backtracking04 = new Backtracking04();
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
//		root.left.left=new TreeNode(4);
		root.left.right = new TreeNode(5);
//		root.right.left=new TreeNode(6);
//		root.right.right=new TreeNode(7);
		List<String> list = backtracking04.binaryTreePaths(root);
		System.out.println(list);
	}

	public List<String> binaryTreePaths(TreeNode root) {
		List<String> list = new ArrayList<>();
		List<String> list1 = new ArrayList<>();
		saveToList(list1, root, list);
		return list;
	}

	/**
	 * @param list1 ���浱ǰ�ַ���
	 * @param root  ��ǰ�ڵ�
	 * @param list  ����ַ���
	 */
	private void saveToList(List<String> list1, TreeNode root, List<String> list) {
		if (root == null) {
			return;
		}
		if (root.left == null && root.right == null) {
			list1.add(root.val + "");
			StringBuilder sb = new StringBuilder();
			for (String string : list1) {
				if (sb.length() == 0) {
					sb.append(string);
				} else {
					sb.append("-" + ">" + string);
				}
			}
			list.add(sb.toString());
			return;
		}
		list1.add(root.val + "");
		saveToList(list1, root.left, list);
		if (root.left != null) {//��֦֮ǰ��Ҫ�жϣ������Ϊ�վͼ�֦���ͻᵼ�¶�ɾ��
			list1.remove(list1.size() - 1);
		}
		saveToList(list1, root.right, list);
		if (root.right != null) {//��֦֮ǰ��Ҫ�ж�
			list1.remove(list1.size() - 1);
		}
	}
}
