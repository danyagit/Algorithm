package com.xjf.algorithm.JianZhiOffer;

import java.util.ArrayList;

//����һ�Ŷ������ĸ��ڵ��һ���������ѣ�û���ᣬ���Ĵ�
//���ֵ����ӡ���������н��ֵ�ĺ�Ϊ��������������·����
//·������Ϊ�����ĸ���㿪ʼ����һֱ��Ҷ����������Ľ���γ�һ��·����
//˼·����ÿһ���߶���һ�£���ֵ����key������·����value����������Ƿ�Ϊtarget
public class Test34 {

	public static void main(String[] args) {
		TreeNode node1 = new TreeNode(10);
		node1.left = new TreeNode(5);
		node1.left.left = new TreeNode(4);
		node1.left.right = new TreeNode(7);
		node1.right = new TreeNode(12);
		ArrayList<ArrayList<Integer>> findPath = new Test34().FindPath(node1, 22);
		System.out.println(findPath);
	}

	private ArrayList<ArrayList<Integer>> ret = new ArrayList<>();

	public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
		backtracking(root, target, new ArrayList<>());
		return ret;
	}

	private void backtracking(TreeNode node, int target, ArrayList<Integer> path) {
		if (node == null)
			return;
		path.add(node.val);
		target -= node.val;
		if (target == 0 && node.left == null && node.right == null) {
			ret.add(new ArrayList<>(path));
		} else {
			backtracking(node.left, target, path);
			backtracking(node.right, target, path);
		}
		path.remove(path.size() - 1);//ÿ�ζ�ȥ�����һ��Ԫ��
	}
}
