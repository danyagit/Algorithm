package com.xjf.algorithm.leetcode.suanfasixiang.shuangzhizhen;

//平方数之和
//给定一个非负整数 c ，
//你要判断是否存在两个整数 a 和 b，使得 a2 + b2 = c 。
public class Test02 {

	public static void main(String[] args) {

	}

	public boolean judgeSquareSum(int c) {
		double pow = Math.pow(c, 0.5);
		int right=(int)(pow)+1;
		int left=0;
		while(left<=right) {
			if(left*left+right*right>c) {
				right--;
				continue;
			}
			if(left*left+right*right<c) {
				left++;
				continue;
			}else {
				return true;
			}
		}
		return false;
	}
}
