package com.xjf.algorithm.JianZhiOffer;

//�����ӽṹ�������� �����õ�������ݹ飬���⸴��
//�������ö�����A��B���ж�B�ǲ���A���ӽṹ��
//��ps������Լ��������������һ�������ӽṹ��
///**
//public class TreeNode {
//    int val = 0;
//    TreeNode left = null;
//    TreeNode right = null;
//
//    public TreeNode(int val) {
//        this.val = val;
//
//    }
//
//}
//*/
//public class Solution {
//    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
//        
//    }
//}
public class Test26 {

	public static void main(String[] args) {

	}

	public boolean HasSubtree(TreeNode root1, TreeNode root2) {
		boolean result = false;

		//��root1��root2����Ϊnull��ʱ�򣬲Ž��бȽϡ�����ֱ�ӷ���false
		if(root1 != null && root2 != null) {
			//����ҵ��˶�Ӧroot2�ĸ��ڵ�ĵ�
			if(root1.val == root2.val) {
				//��������ڵ�ΪΪ����ж��Ƿ����root2
				result = judge(root1, root2);
			}

			if(!result) {
				//����Ҳ�������ô����ȥroot1������ӵ�����㣬ȥ�ж�ʱ�����root2
				result = HasSubtree(root1.left, root2);
			}

			if(!result) {
				//������Ҳ�������ô����ȥroot1���Ҷ��ӵ�����㣬ȥ�ж�ʱ�����root2
				result = HasSubtree(root1.right, root2);
			}
		}
		return result;
	}

	public boolean judge(TreeNode node1, TreeNode node2) {
		// ���node2�Ѿ��������˶��ܶ�Ӧ���ϣ�����true
		if (node2 == null) {
			return true;
		}

		// ���node2��û�б����꣬node1ȴ�������ˡ�����false
		if (node1 == null) {
			return false;
		}

		// ���������һ����û�ж�Ӧ�ϣ�����false
		if (node1.val != node2.val) {
			return false;
		}

		// ������ڵ��Ӧ���ϣ���ô�ͷֱ�ȥ�ӽڵ�����ƥ��
		return judge(node1.left, node2.left) && judge(node1.right, node2.right);

	}
}
