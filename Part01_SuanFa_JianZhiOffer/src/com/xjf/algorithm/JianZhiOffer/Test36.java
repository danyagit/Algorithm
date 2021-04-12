package com.xjf.algorithm.JianZhiOffer;

import java.util.ArrayList;
import java.util.List;

//������������˫������:�������������������ɴ���https://blog.csdn.net/qq_41231926/article/details/82056504
//����һ�ö��������������ö���������ת����һ�������˫������
//Ҫ���ܴ����κ��µĽ�㣬ֻ�ܵ������н��ָ���ָ��
//�����������,��test08��̫һ����test08�и��ڵ�ָ��
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

//	TreeNode head, pre;//��������ȫ�ֱ���
//    public TreeNode Convert(TreeNode root) {
//        if(root==null) return null;
//        dfs(root);
////        pre.right = head;
////        head.left =pre;//����ͷ�ڵ��β�ڵ���໥ָ���������˳��Ҳ�ǿ��Եߵ���
//        return head;
//
//    }
//
//    public void dfs(TreeNode cur){
//        if(cur==null) return;
//        dfs(cur.left);
//
//        //pre���ڼ�¼˫��������λ��cur���Ľڵ㣬����һ�ε����е�cur,��pre==nullʱ��cur���û�нڵ�,����ʱcurΪ˫�������е�ͷ�ڵ�
//        if(pre==null) head = cur;
//        //��֮��pre!=nullʱ��cur�����ڽڵ�pre����Ҫ����pre.right=cur�Ĳ�����
//        else pre.right = cur;
//       
//        cur.left = pre;//pre�Ƿ�Ϊnull�����û��Ӱ��,����������������if else֮ǰҲ�ǿ��Եġ�
//
//        pre = cur;//preָ��ǰ��cur
//        dfs(cur.right);//ȫ��������ɺ�preָ��˫�������е�β�ڵ�
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
