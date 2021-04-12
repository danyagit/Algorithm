package com.xjf.algorithm.JianZhiOffer;

//对称的二叉树:树。有点难度。
//请实现一个函数，用来判断一棵二叉树是不是对称的。
//注意，如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的。
/*
//public class TreeNode {
//    int val = 0;
//    TreeNode left = null;
//    TreeNode right = null;
//
//    public TreeNode(int val) {
//        this.val = val;
//
//    }
//
//}
//*/
//public class Solution {
//    boolean isSymmetrical(TreeNode pRoot)
//    {
//        
//    }
//}
public class Test28 {

	public static void main(String[] args) {

	}

	boolean isSymmetrical(TreeNode pRoot) {
		if (pRoot == null) {
			return true;
		}
		TreeNode left = pRoot.left;
		TreeNode right = pRoot.right;
		return judge(left,right);
	}

	public boolean judge(TreeNode left, TreeNode right) {

		if (left == null && right == null) {
			return true;
		}
		if (left == null || right == null) {
			return false;
		}
		// 剩下的情况就是两个都不为空，所以right.val不会出现空指针异常
		if (left.val != right.val) {
			return false;
		}
		return judge(left.left, right.right) && judge(left.right, right.left);
	}

}
