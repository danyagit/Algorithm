package com.xjf.algorithm.JianZhiOffer;

import static org.hamcrest.CoreMatchers.instanceOf;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//重建二叉树：树  此题只能用递归，而且要分别对树的左子树和右子树进行递归
//输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
//假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
//例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，
//则重建二叉树并返回。
/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
//public class Solution {
//    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
//        
//    }
//}
public class Test07 {
	public static void main(String[] args) {
	}


	public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
		if(pre==null||pre.length==0) {
			return null;
		}
		
		TreeNode root = new TreeNode(pre[0]);
		int index = findIndex(pre[0], in);
		//copyOfRange方法的最后一个索引参数是不包括的，参见MyTest
		root.left=reConstructBinaryTree(Arrays.copyOfRange(pre, 1, index+1), Arrays.copyOfRange(in, 0, index));
		root.right=reConstructBinaryTree(Arrays.copyOfRange(pre, index+1, pre.length), Arrays.copyOfRange(in, index+1, in.length));
		return root;
	}
	public static int findIndex(int num,int[] arr) {
		int index=0;
		for (int i = 0; i < arr.length; i++) {
			if(num==arr[i]){
				index = i;
				break;
			}
		}
		return index;
	}
}
