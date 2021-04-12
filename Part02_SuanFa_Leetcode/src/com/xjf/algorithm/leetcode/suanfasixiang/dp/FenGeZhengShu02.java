package com.xjf.algorithm.leetcode.suanfasixiang.dp;

import java.util.ArrayList;

import com.xjf.algorithm.leetcode.suanfasixiang.sousuo.BFS02;

//完全平方数
public class FenGeZhengShu02 {

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
		// 储存完全平方数
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		for (int i = 2; i <= n; i++) {
			if (judgeSquare(i)) {
				list.add(i);
				dp[i] = 1;
			} else {
				// 遍历前面所有的完全平方数
				if (i > 4) {
					int min = Integer.MAX_VALUE;
					for (int j = 0; j < list.size(); j++) {
						int cur = dp[i - list.get(j)] + 1;
						if (cur < min) {
							min = cur;
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
