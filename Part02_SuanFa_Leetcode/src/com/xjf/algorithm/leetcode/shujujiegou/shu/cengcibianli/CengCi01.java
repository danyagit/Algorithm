package com.xjf.algorithm.leetcode.shujujiegou.shu.cengcibianli;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//�������Ĳ�ƽ��ֵ
public class CengCi01 {

	public static void main(String[] args) {

	}
	public List<Double> averageOfLevels(TreeNode root) {
		List<Double> result = new ArrayList<>();
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		int size = 0;
		while(!queue.isEmpty()) {//ÿһ��ѭ������һ��
			double sum=0;
			size = queue.size();//��ǰ���Ԫ�ظ���
			for (int i = 1; i <=size ; i++) {
				TreeNode node = queue.poll();
				//����һ��ӽ�ȥ
				if(node.left!=null) queue.add(node.left);
				if(node.right!=null) queue.add(node.right);
				sum=sum+node.val;
			}
			result.add(sum/size);
		}
		return result;
	}

}
