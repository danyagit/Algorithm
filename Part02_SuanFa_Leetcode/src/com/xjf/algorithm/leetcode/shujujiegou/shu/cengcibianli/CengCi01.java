package com.xjf.algorithm.leetcode.shujujiegou.shu.cengcibianli;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//二叉树的层平均值
public class CengCi01 {

	public static void main(String[] args) {

	}
	public List<Double> averageOfLevels(TreeNode root) {
		List<Double> result = new ArrayList<>();
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		int size = 0;
		while(!queue.isEmpty()) {//每一次循环代表一层
			double sum=0;
			size = queue.size();//当前层的元素个数
			for (int i = 1; i <=size ; i++) {
				TreeNode node = queue.poll();
				//把下一层加进去
				if(node.left!=null) queue.add(node.left);
				if(node.right!=null) queue.add(node.right);
				sum=sum+node.val;
			}
			result.add(sum/size);
		}
		return result;
	}

}
