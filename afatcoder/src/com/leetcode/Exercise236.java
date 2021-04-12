package com.leetcode;

public class Exercise236 {

	public static void main(String[] args) {

	}
	//节点为公共祖先的两种情况：左子树和右子树同时包含p||q；自己是p、q中的一个且其中一个子树包含另一个
	private TreeNode ans;


    private boolean dfs(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return false;
        
        boolean lson = dfs(root.left, p, q);
        boolean rson = dfs(root.right, p, q);
        //递归过程中判断该节点是否满足情况，如果满足，就赋值给全局变量
        if ((lson && rson) || ((root.val == p.val || root.val == q.val) && (lson || rson))) {
            ans = root;
        } 
        //递归每个节点，结合它的父节点思考：只要该节点树包含p/q其中的一个，就应该返回true
        return lson || rson || (root.val == p.val || root.val == q.val);
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        this.dfs(root, p, q);
        return this.ans;
    }

}
