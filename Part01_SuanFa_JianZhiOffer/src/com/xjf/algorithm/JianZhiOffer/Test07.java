package com.xjf.algorithm.JianZhiOffer;

import static org.hamcrest.CoreMatchers.instanceOf;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//�ؽ�����������  ����ֻ���õݹ飬����Ҫ�ֱ�����������������������еݹ�
//����ĳ��������ǰ���������������Ľ�������ؽ����ö�������
//���������ǰ���������������Ľ���ж������ظ������֡�
//��������ǰ���������{1,2,4,7,3,5,6,8}�������������{4,7,2,1,5,3,8,6}��
//���ؽ������������ء�
/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
//public class Solution {
//    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
//        
//    }
//}
public class Test07 {
	public static void main(String[] args) {
	}


	public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
		if(pre==null||pre.length==0) {
			return null;
		}
		
		TreeNode root = new TreeNode(pre[0]);
		int index = findIndex(pre[0], in);
		//copyOfRange���������һ�����������ǲ������ģ��μ�MyTest
		root.left=reConstructBinaryTree(Arrays.copyOfRange(pre, 1, index+1), Arrays.copyOfRange(in, 0, index));
		root.right=reConstructBinaryTree(Arrays.copyOfRange(pre, index+1, pre.length), Arrays.copyOfRange(in, index+1, in.length));
		return root;
	}
	public static int findIndex(int num,int[] arr) {
		int index=0;
		for (int i = 0; i < arr.length; i++) {
			if(num==arr[i]){
				index = i;
				break;
			}
		}
		return index;
	}
}
