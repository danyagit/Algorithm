package com.xjf.algorithm.leetcode.shujujiegou.shu.digui;
//112. 路径总和
public class DiGui06 {

	public static void main(String[] args) {
	}
	
	public boolean hasPathSum(TreeNode root, int sum) {
		if(root==null) {
			return false;
		}
		int curSum=0;
		return judge(root,sum,curSum);
		
	}
	/**
	 * 深度优先搜索,只是不需要剪枝
	 * @param root 根节点
	 * @param sum 目标总和
	 * @param curSum 当前总和
	 * @return
	 */
	public boolean judge(TreeNode root,int sum,int curSum) {
		if(root==null) {
			return false;
		}
		curSum=curSum+root.val;
		if(curSum==sum&&root.left==null&&root.right==null) {//是两个条件
			return true;
		}
		return judge(root.left, sum,curSum)||judge(root.right, sum,curSum);
	}
	
}
