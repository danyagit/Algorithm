package com.xjf.algorithm.JianZhiOffer;

//�ԳƵĶ�����:�����е��Ѷȡ�
//��ʵ��һ�������������ж�һ�ö������ǲ��ǶԳƵġ�
//ע�⣬���һ��������ͬ�˶������ľ�����ͬ���ģ�������Ϊ�ԳƵġ�
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
		// ʣ�µ����������������Ϊ�գ�����right.val������ֿ�ָ���쳣
		if (left.val != right.val) {
			return false;
		}
		return judge(left.left, right.right) && judge(left.right, right.left);
	}

}
