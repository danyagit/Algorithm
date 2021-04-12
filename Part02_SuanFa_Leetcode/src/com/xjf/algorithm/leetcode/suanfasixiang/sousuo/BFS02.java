package com.xjf.algorithm.leetcode.suanfasixiang.sousuo;

import java.util.ArrayList;

//279. 完全平方数
//给定正整数 n，找到若干个完全平方数（比如 1, 4, 9, 16, ...）
//使得它们的和等于 n。你需要让组成和的完全平方数的个数最少。
//
//示例 1:
//
//输入: n = 12
//输出: 3 
//解释: 12 = 4 + 4 + 4.
//示例 2:
//
//输入: n = 13
//输出: 2
//解释: 13 = 4 + 9.
/**
 * 选择了动态规划
 * @author xjf
 *
 */
public class BFS02 {

	public static void main(String[] args) {
		BFS02 bfs02 = new BFS02();
		int numSquares = bfs02.numSquares(48);
		System.out.println(numSquares);
	}

	// 动态规划，dp[n]为所求
	public int numSquares(int n) {
		int dp[] = new int[n + 1];
		dp[0] = 0;
		dp[1] = 1;
		//储存完全平方数
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		for (int i = 2; i <= n; i++) {
			if (judgeSquare(i)) {
				list.add(i);
				dp[i] = 1;
			} else {
				//遍历前面所有的完全平方数
				if (i > 4) {
					int min=Integer.MAX_VALUE;
					for (int j=0;j<list.size();j++) {
						int cur =dp[i-list.get(j)]+1;
						if(cur<min) {
							min=cur;
						}
					}
					dp[i] = min;
				} else {
					dp[i] = dp[i - 1] + 1;
				}
			}
		}
		return dp[n];
	}

	// 判断i是否为完全平方数
	private boolean judgeSquare(int i) {
		int a = (int) Math.pow(i, 0.5);
		if (a * a == i) {
			return true;
		}
		return false;
	}

}
