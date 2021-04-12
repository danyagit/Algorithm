package com.xjf.algorithm.JianZhiOffer;

import java.util.ArrayList;

//输入一颗二叉树的根节点和一个整数：难，没整会，看的答案
//按字典序打印出二叉树中结点值的和为输入整数的所有路径。
//路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
//思路：把每一条线都加一下，把值当做key，把线路当做value，看看结果是否为target
public class Test34 {

	public static void main(String[] args) {
		TreeNode node1 = new TreeNode(10);
		node1.left = new TreeNode(5);
		node1.left.left = new TreeNode(4);
		node1.left.right = new TreeNode(7);
		node1.right = new TreeNode(12);
		ArrayList<ArrayList<Integer>> findPath = new Test34().FindPath(node1, 22);
		System.out.println(findPath);
	}

	private ArrayList<ArrayList<Integer>> ret = new ArrayList<>();

	public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
		backtracking(root, target, new ArrayList<>());
		return ret;
	}

	private void backtracking(TreeNode node, int target, ArrayList<Integer> path) {
		if (node == null)
			return;
		path.add(node.val);
		target -= node.val;
		if (target == 0 && node.left == null && node.right == null) {
			ret.add(new ArrayList<>(path));
		} else {
			backtracking(node.left, target, path);
			backtracking(node.right, target, path);
		}
		path.remove(path.size() - 1);//每次都去掉最后一个元素
	}
}
