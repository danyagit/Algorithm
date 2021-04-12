package com.xjf.algorithm.leetcode.shujujiegou.shu.digui;

//路径总和 III(任意路径)
public class DiGui07 {

	public static void main(String[] args) {
		TreeNode node1 = new TreeNode(10);
		TreeNode node2 = new TreeNode(5);
		TreeNode node3 = new TreeNode(-3);
		TreeNode node4 = new TreeNode(3);
		TreeNode node5 = new TreeNode(2);
		TreeNode node6 = new TreeNode(11);
		TreeNode node7 = new TreeNode(3);
		TreeNode node8 = new TreeNode(-2);
		TreeNode node9 = new TreeNode(1);
		node1.left=node2;
		node1.right=node3;
		node2.left=node4;
		node2.right=node5;
		node3.right=node6;
		node4.left=node7;
		node4.right=node8;
		node5.right=node9;
		DiGui07 diGui07 = new DiGui07();
		int pathSum = diGui07.pathSum(node1, 8);
		System.out.println(pathSum);
	}

	int cnt = 0;

	public int pathSum(TreeNode root, int sum) {
		int curSum=0;
		countAll(root,sum,curSum);
		return cnt;
	}
	
	
	private void countAll(TreeNode root, int sum,int curSum) {
		if(root==null) {
			return;
		}
		count(root,sum,curSum);
		countAll(root.left, sum, curSum);//curSum无需剪枝,因为它不是个对象,它只是值传递
		countAll(root.right, sum, curSum);
	}
	
	//递归计算以当前节点开头的序列里面,和为目标值的方案数
	private void count(TreeNode root, int sum,int curSum) {
		if(root==null) {
			return;
		}
		curSum=curSum+root.val;
		if(sum==curSum) {
			cnt++;
		}
		count(root.left,sum,curSum);//curSum无需剪枝,因为它不是个对象,它只是值传递
		count(root.right,sum,curSum);
	}
}
