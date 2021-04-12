package com.xjf.algorithm.JianZhiOffer;

import java.util.ArrayList;
import java.util.List;

//二叉搜索树与双向链表:理解中序遍历代码就能完成此题https://blog.csdn.net/qq_41231926/article/details/82056504
//输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。
//要求不能创建任何新的结点，只能调整树中结点指针的指向。
//就是中序遍历,和test08不太一样，test08有父节点指针
public class Test36 {
	public static void main(String[] args) {
		TreeNode node = new TreeNode(1);
		node.left = new TreeNode(2);
		node.right = new TreeNode(3);
		TreeNode node1 = new Test36().Convert(node);
		System.out.println(11);
	}

	public TreeNode Convert(TreeNode pRootOfTree) {
		if (pRootOfTree == null) {
			return null;
		}
		List<TreeNode> list = inorderTraversal(pRootOfTree);
		list.get(0).left = null;
		list.get(list.size() - 1).right = null;
		for (int i = 0; i < list.size() - 1; i++) {
			list.get(i).right = list.get(i + 1);
			list.get(i + 1).left = list.get(i);
		}
		return list.get(0);
	}

	public List<TreeNode> inorderTraversal(TreeNode root) {
		List<TreeNode> list = new ArrayList<>();
		inorderTraversal(root, list);
		return list;
	}

	private void inorderTraversal(TreeNode treeNode, List<TreeNode> list) {
		if (treeNode == null) {
			return;
		}
		inorderTraversal(treeNode.left, list);
		list.add(treeNode);
		inorderTraversal(treeNode.right, list);
	}

//	TreeNode head, pre;//定义两个全局变量
//    public TreeNode Convert(TreeNode root) {
//        if(root==null) return null;
//        dfs(root);
////        pre.right = head;
////        head.left =pre;//进行头节点和尾节点的相互指向，这两句的顺序也是可以颠倒的
//        return head;
//
//    }
//
//    public void dfs(TreeNode cur){
//        if(cur==null) return;
//        dfs(cur.left);
//
//        //pre用于记录双向链表中位于cur左侧的节点，即上一次迭代中的cur,当pre==null时，cur左侧没有节点,即此时cur为双向链表中的头节点
//        if(pre==null) head = cur;
//        //反之，pre!=null时，cur左侧存在节点pre，需要进行pre.right=cur的操作。
//        else pre.right = cur;
//       
//        cur.left = pre;//pre是否为null对这句没有影响,且这句放在上面两句if else之前也是可以的。
//
//        pre = cur;//pre指向当前的cur
//        dfs(cur.right);//全部迭代完成后，pre指向双向链表中的尾节点
//    }

//	public TreeNode Convert(TreeNode pRootOfTree) {
//		TreeNode leftNode = findLeftNode(pRootOfTree);
//		orderLeft(pRootOfTree);
//		return leftNode;
//	}
//
//	public void orderLeft(TreeNode node) {
//		if (node.left==null||node.right==null) {
//			return;
//		}
//		TreeNode left = node.left;
//		TreeNode right = node.right;
//		TreeNode leftestNode=findRightNode(node.left);
//		TreeNode rightestNode=findRightNode(node.right);
//		node.left = leftestNode;
//		leftestNode.right = node;
//		node.right = rightestNode;
//		rightestNode.left = node;
//		orderLeft(left);
//		orderLeft(right);
//	}
//
//	public void orderRight(TreeNode node) {
//		node.right = findLeftNode(node.right);
//		orderRight(node.right);
//	}
//
//	public TreeNode findLeftNode(TreeNode node) {
//		TreeNode root = node;
//		while (root != null) {
//			if (root.left == null) {
//				break;
//			}
//			root = root.left;
//		}
//		return root;
//	}
//
//	public TreeNode findRightNode(TreeNode node) {
//		TreeNode root = node;
//		while (root != null) {
//			if (root.right == null) {
//				break;
//			}
//			root = root.right;
//		}
//		return root;
//	}

}
