package com.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Exercise114 {

	public static void main(String[] args) {

	}

	// 方法一：递归前序遍历存入list里面，遍历list修改指针关系
	// 方法二：无需其他的数据结构，减小空间复杂度
	// 复习：非递归的前序遍历
	public void flatten(TreeNode root) {
		//方法二
		while(root!=null) {
			//有左子树，就做，不然就继续下一个右子树
			if(root.left!=null) {
				TreeNode pre=root.left;
				pre = root.left;
				//找到左子树最右边节点pre
				while(pre.right!=null) {
					pre=pre.right;
				}
				//把右子树接到pre下面
				pre.right=root.right;
				
				root.right=root.left;
				root.left=null;
			}
			root=root.right;
		}
	}
	
	//非递归实现二叉树的前序遍历
	public List<TreeNode> preOrder(TreeNode root) {
		Stack<TreeNode> stack = new Stack<>();
		List<TreeNode> list = new ArrayList<>();
		stack.push(root);
		while(stack.isEmpty()) {
			TreeNode pop = stack.pop();
			list.add(pop);
			if(pop.left!=null) {
				stack.push(pop.right);//先加右！！
			}
			if(pop.right!=null) {
				stack.push(pop.left);
			}
		}
		return list;
	}

}
