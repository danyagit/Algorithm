package com.xjf.algorithm.leetcode.shujujiegou.shu.cengcibianli;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//�������½ǵ�ֵ
public class CengCi02 {

	public static void main(String[] args) {

	}

	public int findBottomLeftValue(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			root = queue.poll();
			if (root.right != null)
				queue.add(root.right);//�ȼ��ұߵ�,��ô���ȡ�����ľ�������ߵ�
			if (root.left != null)
				queue.add(root.left);
		}
		return root.val;
	}

	// ��һ��ķ���
//	public int findBottomLeftValue(TreeNode root) {
//		List<TreeNode> list = new ArrayList<>();
//		Queue<TreeNode> queue = new LinkedList<>();
//		queue.add(root);
//		int size=0;
//		while(!queue.isEmpty()) {
//			size=queue.size();
//			for (int i = 1; i <=size; i++) {
//				TreeNode node = queue.poll();
//				list.add(node);
//				if(node.left!=null) queue.add(node.left);
//				if(node.right!=null) queue.add(node.right);
//			}
//		}
//		return list.get(list.size()-size).val;
//	}
}
