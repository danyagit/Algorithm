package com.xjf.algorithm.JianZhiOffer;

//ƽ�������
//����һ�ö��������жϸö������Ƿ���ƽ���������
//���������ֻ��Ҫ������ƽ���ԣ�����Ҫ�������ǲ������������
/**
 * ƽ���������ÿ�����ڵ����������ĸ߶Ȳ�����1
 * �õ���55.1����������ȵĺ���
 * @author xjf
 *
 */

public class Test55_2 {
	public static void main(String[] args) {

	}

	public boolean IsBalanced_Solution(TreeNode root) {
		if(root==null) {
			return true;
		}
		if (root.left == null && root.right == null) {
			return true;
		}
		
		if ((depth(root.left, 0) - depth(root.right, 0) > 1) || (depth(root.left, 0) - depth(root.right, 0) < -1)) {
			return false;
		}
//		if ((depth(root.left, 0) - depth(root.right, 0) >= -1) && (depth(root.left, 0) - depth(root.right, 0) < 1)) 
		else {
			return IsBalanced_Solution(root.left) && IsBalanced_Solution(root.right);
		}
	}

	// ����root���������,depth����0
	public int depth(TreeNode node, int depth) {
		if (node == null) {
			return depth;
		}
		depth = depth + 1;
		return Math.max(depth(node.left, depth), depth(node.right, depth));
	}

}
