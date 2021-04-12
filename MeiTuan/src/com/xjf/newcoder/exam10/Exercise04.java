package com.xjf.newcoder.exam10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//复杂度过大
public class Exercise04 {

	public static void main(String[] args) {
//		TreeNode node7 = new TreeNode(7);
//		TreeNode node1 = new TreeNode(1);
//		TreeNode node5 = new TreeNode(5);
//		TreeNode node3 = new TreeNode(3);
//		TreeNode node6 = new TreeNode(6);
//		node7.right=node1;
//		node1.left=node5;
//		node1.right=node3;
//		node5.left=node6;
//		getCost(node7);
//		System.out.println(sum);
		solution();
		
	}
	
	public static void solution() {
		int minCost=Integer.MAX_VALUE;
		int []midOrder = {7,6,5,1,3};
		ArrayList<TreeNode> trees = buildTree(midOrder);
		for (TreeNode root : trees) {
			getCost(root);
			if(sum<minCost) {
				minCost=sum;
			}
			sum=0;
		}
		System.out.println(minCost);
	}
	
	
	
	public static ArrayList<TreeNode> buildTree(int []midOrder){
		ArrayList<TreeNode> list = new ArrayList<>();
		//关键
		if(midOrder==null||midOrder.length==0) {
			list.add(null);
			return list;
		}
		for (int i = 0; i < midOrder.length; i++) {
			List<TreeNode> leftList=buildTree(Arrays.copyOfRange(midOrder,0, i));
			List<TreeNode> rightList=buildTree(Arrays.copyOfRange(midOrder,i+1, midOrder.length));
			for (int j = 0; j < leftList.size(); j++) {
				for (int j2 = 0; j2 < rightList.size(); j2++) {
					//new一定要放在双重循环里面，关键
					TreeNode root = new TreeNode(midOrder[i]);
					root.left=leftList.get(j);
					root.right=rightList.get(j2);
					list.add(root);
				}
			}
		}
		return list;
		
	}
	
	//求二叉树的开销
	public static int sum=0;
	public static void getCost(TreeNode root) {
		if(root.left==null&&root.right==null) {
			return; 
		}else if(root.left==null) {
			sum=sum+root.val*root.right.val;
			getCost(root.right);
		}else if(root.right==null) {
			sum=sum+root.val*root.left.val;
			getCost(root.left);
		}else {
			sum=sum+root.val*root.left.val+root.val*root.right.val;
			getCost(root.left);
			getCost(root.right);
		}
	}
	
	
	static class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		public TreeNode(int val) {
			this.val = val;
		}
	}
	
}
