package com.xjf.algorithm.JianZhiOffer;

//����һ�ö����������������ȡ��Ӹ���㵽Ҷ������ξ����Ľ��
//��������Ҷ��㣩�γ�����һ��·�����·���ĳ���Ϊ������ȡ�

//�����ĵݹ���Ŀһ��Ҫ���Դ��Ĵ�����ͼ
public class Test55_1 {
	public static void main(String[] args) {

	}

	public int TreeDepth(TreeNode root) {
		return depth(root, 0);
	}

	public int depth(TreeNode node, int depth) {
		if (node == null) {
			return depth;
		}
		depth = depth + 1;
		return Math.max(depth(node.left, depth),
				depth(node.right, depth));
	}
}
