package com.xjf.netease1;
import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		Integer target = Integer.valueOf(scanner.nextLine());
		String[] strings = str.split(" ");
		TreeNode [] nodes = new TreeNode[strings.length];
		for (int i = 0; i < strings.length; i++) {
			nodes[i] = new TreeNode(Integer.valueOf(strings[i]));
		}
		for (int i = 0; i < nodes.length; i++) {
			if(2*i+1<nodes.length){
				nodes[i].left=nodes[2*i+1];
			}
			if(2*i+2<nodes.length) {
				nodes[i].right=nodes[2*i+2];
			}
		}
		getShortPath(nodes[0], target);
		System.out.println(res);
    }
    
    public static ArrayList<Integer> res;
	public static int target = 0;
	public static ArrayList<Integer> getShortPath(TreeNode root, int target) {
		Main.target = target;
		int sum = 0;
		getPath(new ArrayList<Integer>(), root, sum);
		return res;
	}

	private static void getPath(ArrayList<Integer> list, TreeNode root, int sum) {
		if (root == null) {
			return;
		}
		sum = sum + root.val;
		list.add(root.val);
		if (sum == target) {
			if (res == null) {
				res = new ArrayList<>(list);
			} else {
				if (list.size() < res.size()) {
					res = new ArrayList<>(list);
				}
			}
			return;
		}
		if (sum > target) {
			return;
		}
		getPath(list, root.left, sum);
		getPath(list, root.right, sum);
		sum = sum - root.val;
		list.remove(list.size() - 1);
	}
    public static class TreeNode {
	    public int val;
	    public TreeNode left;
	    public TreeNode right;

	    public TreeNode(int val) {
		this.val = val;
	    }
	}
}