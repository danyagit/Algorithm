package com.xjf.algorithm.JianZhiOffer;


//二叉树的下一个结点：树
//给定一个二叉树和其中的一个结点，
//请找出中序遍历顺序的下一个结点并且返回。
//注意，树中的结点不仅包含左右子结点，
//同时包含指向父结点的指针。
///*
//public class TreeLinkNode {
//    int val;
//    TreeLinkNode left = null;
//    TreeLinkNode right = null;
//    TreeLinkNode next = null;
//
//    TreeLinkNode(int val) {
//        this.val = val;
//    }
//}
//*/
//public class Solution {
//    public TreeLinkNode GetNext(TreeLinkNode pNode)
//    {
//        
//    }
//}

/**
 * 中序遍历二叉树的下一个节点可能是哪一个 分两种情况： 该节点有右节点：寻找该右节点的最左子节点
 * 该节点无右节点：向上找，找到一个左节点（相对该左节点的父节点而言）
 */
public class Test08 {

	public static void main(String[] args) {

	}

	public TreeLinkNode GetNext(TreeLinkNode pNode) {
		if (pNode.right != null) {
			TreeLinkNode node = pNode.right;
			while (node.left != null)
				node = node.left;
			return node;
		} else {
			while (pNode.next != null) {
				TreeLinkNode parent = pNode.next;
				if (parent.left == pNode)
					return parent;
				pNode = pNode.next;
			}
		}
		return null;
	}
}
