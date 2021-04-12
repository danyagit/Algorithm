package com.xjf.algorithm.leetcode.suanfasixiang.fenzhi;

import java.util.ArrayList;
import java.util.List;

//不同的二叉搜索树 II
//给定一个整数 n，生成所有由 1 ... n 为节点所组成的 二叉搜索树 。
/**
 * 二叉搜索树：left<root<right
 * 
 * @author xjf
 *
 */
public class Test02 {

	public static void main(String[] args) {
		Test02 test02 = new Test02();
		List<TreeNode> list = test02.generateTrees(3);
		System.out.println(list);
	}

	
	public List<TreeNode> generateTrees(int n) {
		if(n<1) {
			return new ArrayList<>();
		}
		return generate(1, n);
	}

	private List<TreeNode> generate(int m, int n) {
		List<TreeNode> list = new ArrayList<>();
		if (n < m) {
			list.add(null);
			return list;
		}
		for (int i = m; i <= n; i++) {
			List<TreeNode> leftList = generate(m, i - 1);
			List<TreeNode> rightList = generate(i + 1, n);
			for (TreeNode left : leftList) {
				for (TreeNode right : rightList) {
					TreeNode root = new TreeNode(i);
					root.left = left;
					root.right = right;
					list.add(root);
				}
			}
		}
		return list;
	}

}
