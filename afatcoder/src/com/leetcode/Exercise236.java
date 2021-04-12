package com.leetcode;

public class Exercise236 {

	public static void main(String[] args) {

	}
	//�ڵ�Ϊ�������ȵ������������������������ͬʱ����p||q���Լ���p��q�е�һ��������һ������������һ��
	private TreeNode ans;


    private boolean dfs(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return false;
        
        boolean lson = dfs(root.left, p, q);
        boolean rson = dfs(root.right, p, q);
        //�ݹ�������жϸýڵ��Ƿ����������������㣬�͸�ֵ��ȫ�ֱ���
        if ((lson && rson) || ((root.val == p.val || root.val == q.val) && (lson || rson))) {
            ans = root;
        } 
        //�ݹ�ÿ���ڵ㣬������ĸ��ڵ�˼����ֻҪ�ýڵ�������p/q���е�һ������Ӧ�÷���true
        return lson || rson || (root.val == p.val || root.val == q.val);
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        this.dfs(root, p, q);
        return this.ans;
    }

}
