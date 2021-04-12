package com.xjf.algorithm.leetcode.shujujiegou.shu.BST;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//10. 寻找二叉查找树中出现次数最多的值
public class BST10 {

	public static void main(String[] args) {

	}
	int maxFreq=1;
	Map<Integer,Integer> map = new HashMap<>();
	List<Integer> list = new ArrayList<>();
	public int[] findMode(TreeNode root) {
		dfs(root);
		for (int key:map.keySet()) {
			if(map.get(key)==maxFreq) {
				list.add(key);
			}
		}
		int[] a = new int[list.size()];
		for (int i = 0; i<list.size(); i++) {
			a[i]=list.get(i);
		}
		return a;
	}

	private void dfs(TreeNode root) {
		if (root == null) {
			return;
		}
		dfs(root.left);
		if(map.containsKey(root.val)) {
			map.put(root.val, map.get(root.val)+1);
			if(map.get(root.val)>maxFreq) {
				maxFreq=map.get(root.val);
			}
		}else {
			map.put(root.val, 1);
		}
		dfs(root.right);
	}

}
