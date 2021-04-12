package com.xjf.algorithm.JianZhiOffer;

import java.util.Arrays;

//二叉搜索树的后序遍历序列:二叉树 类似于重组二叉树
//输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
//如果是则返回true,否则返回false。
//假设输入的数组的任意两个数字都互不相同。
//二叉搜索树的所有左节点都小于根节点，所有右节点都大于根节点。
public class Test33 {

	public static void main(String[] args) {
		int[] sequence = new int[] { 4, 8, 6, 12, 16, 14, 10 };
		System.out.println(new Test33().VerifySquenceOfBST(sequence));
	}

	public boolean VerifySquenceOfBST(int[] sequence) {
		if(sequence.length==0) {
			return false;
		}
		if (sequence.length <= 1) {
			return true;
		}
		
		int root = sequence[sequence.length - 1];
		if(firstSmallerIndex(sequence)<0) {//考虑没有左节点的情况
			return true;
		}
		int[] left = Arrays.copyOfRange(sequence, 0, firstSmallerIndex(sequence) + 1);
//		int [] right = Arrays.copyOfRange(sequence, firstBiggerIndex(arr)+1, arr.length-2);
		for (int i = 0; i < left.length; i++) {
			if (root < left[i]) {
				return false;
			} 
		}
		return VerifySquenceOfBST(left);

	}

	public int firstSmallerIndex(int[] arr) {
		int last = arr[arr.length - 1];
		int index = -1;
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] < last) {
				index = i;
				break;
			}
		}
		return index;
	}
}
