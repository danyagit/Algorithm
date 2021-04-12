package com.xjf.algorithm.JianZhiOffer;

//�����������ĵ�k�����
//����һ�ö��������������ҳ����еĵ�kС�Ľ�㡣

//���Ƕ������������������
public class Test54 {

	public static void main(String[] args) {
		TreeNode node = new TreeNode(2);
		node.left = new TreeNode(1);
		node.right = new TreeNode(3);
		TreeNode node1 = new Test54().KthNode(node, 1);
		System.out.println(node1);
	}

	TreeNode target;
	int cnt =0;

	TreeNode KthNode(TreeNode pRoot, int k) {
		inorderTraversal(pRoot, k);
		return target;
	}

	private void inorderTraversal(TreeNode treeNode, int k) {
		if (treeNode == null) {
			return;
		}
		inorderTraversal(treeNode.left, k);
		cnt++;
		if (cnt == k) {
			target = treeNode;
		}
		inorderTraversal(treeNode.right, k);
	}

}
