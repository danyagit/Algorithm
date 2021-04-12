package com.xjf;

import java.util.ArrayList;
import java.util.List;

//�ݹ�ʵ�ֶ������Ĳ������
//����Ĺؼ�����Ҫ���½�һ��list�����result���棬��ȥȡ����ֵ��
//��height��¼����
public class CengXu {

	public static void main(String[] args) {
		CengXu cengXu = new CengXu();
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(5);
		TreeNode node6 = new TreeNode(6);
		TreeNode node7 = new TreeNode(7);
		node1.left=node2;
		node1.right=node3;
		node2.left=node4;
		node2.right=node5;
		node3.left=node6;
		node3.right=node7;
		List<List<Integer>> result = cengXu.levelOrder(node1);
		System.out.println(result);
	}
	
	List<List<Integer>> result;
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> result = new ArrayList<>();
		this.result=result;
		levelOrder(root,0);
		return result;
	}
	/**
	 * @param root 
	 * @param list �洢��ǰ��εĽڵ�
	 * @param height ��ǰ�����
	 */
	private void levelOrder(TreeNode root, int height) {
		if(root==null) {
			return;
		}
		if(result.size()==height) {
			result.add(new ArrayList<>());
		}
		result.get(height).add(root.val);
		levelOrder(root.left,height+1);//�ݹ�������Ĳ������Լ�¼�ݹ�Ĳ�������������Ҳ�ͼ�¼�����Ĳ���
		levelOrder(root.right,height+1);
	}
}
