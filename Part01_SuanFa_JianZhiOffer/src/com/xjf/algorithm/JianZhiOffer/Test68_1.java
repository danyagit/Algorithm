package com.xjf.algorithm.JianZhiOffer;

//����һ������������, �ҵ�����������ָ���ڵ������������ȡ�
//˼·�����p��q��С��root����p��q������root����ôroot�϶���p��q�Ĺ����ڵ�
//��������������Ĺ����ڵ㡣��Ҫroot->root.left����root->root.right����������
public class Test68_1 {

	public static void main(String[] args) {

	}

	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if(root==null) {
			return null;//û�ҵ�
		}
		if(root.val>p.val&&root.val>q.val) {
			return lowestCommonAncestor(root.left,p,q);
		}
		if(root.val<p.val&&root.val<q.val) {
			return lowestCommonAncestor(root.right,p,q);
		}
		return root;//�ߵ���һ��˵��
	}

}
