package com.xjf.algorithm.leetcode.shujujiegou.shu.digui;
//112. ·���ܺ�
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
	 * �����������,ֻ�ǲ���Ҫ��֦
	 * @param root ���ڵ�
	 * @param sum Ŀ���ܺ�
	 * @param curSum ��ǰ�ܺ�
	 * @return
	 */
	public boolean judge(TreeNode root,int sum,int curSum) {
		if(root==null) {
			return false;
		}
		curSum=curSum+root.val;
		if(curSum==sum&&root.left==null&&root.right==null) {//����������
			return true;
		}
		return judge(root.left, sum,curSum)||judge(root.right, sum,curSum);
	}
	
}
