package com.xjf.algorithm.JianZhiOffer;

//序列化二叉树
//请实现两个函数，分别用来序列化和反序列化二叉树

//二叉树的序列化是指：把一棵二叉树按照某种遍历方式的结果以某种格式保存为字符串，
//从而使得内存中建立起来的二叉树可以持久保存。
//序列化可以基于先序、中序、后序、层序的二叉树遍历方式来进行修改，
//序列化的结果是一个字符串，序列化时通过 某种符号表示空节点（#），
//以 ！ 表示一个结点值的结束（value!）。

//二叉树的反序列化是指：根据某种遍历顺序得到的序列化字符串结果str，重构二叉树。

//例如，我们可以把一个只有根节点为1的二叉树序列化为"1,"，然后通过自己的函数来解析回这个二叉树

public class Test37 {

	public static void main(String[] args) {

	}
	
	//掌握二叉树的前序遍历就会这题了
	String Serialize(TreeNode root) {
		if (root == null)
			return "#,";
		String res = "";
		res += root.val + ","; // 采用前序遍历，根-左-右
		res += Serialize(root.left);
		res += Serialize(root.right);
		return res;
	}
	// 反序列化
	int start = -1;

	TreeNode Deserialize(String str) {
		if (str == null || str.length() == 0)
			return null;
		String[] strArr = str.split(",");//按照,打断成字符数组
		return Deserialize(strArr);
	}

	TreeNode Deserialize(String[] strArr) {
		start++;//这儿有个全局变量
		if (start >= strArr.length || strArr[start].equals("#"))
			return null;
		TreeNode cur = new TreeNode(Integer.valueOf(strArr[start]));
		cur.left = Deserialize(strArr);//因为前面有个全局变量start,所以这个地方递归括号里面还可以是这个数组
		cur.right = Deserialize(strArr);
		return cur;
	}

}
