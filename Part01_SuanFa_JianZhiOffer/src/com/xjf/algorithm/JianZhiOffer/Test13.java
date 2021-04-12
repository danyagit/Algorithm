package com.xjf.algorithm.JianZhiOffer;

//机器人的运动范围：图:dfs深度优先搜索
//地上有一个m行和n列的方格。
//一个机器人从坐标0,0的格子开始移动，
//每一次只能向左，右，上，下四个方向移动一格，
//但是不能进入行坐标和列坐标的数位之和大于k的格子。 
//例如，当k为18时，机器人能够进入方格（35,37），因为3+5+3+7 = 18。
//但是，它不能进入方格（35,38），因为3+5+3+8= 19。
//请问该机器人能够达到多少个格子？
//public class Solution {
//    public int movingCount(int threshold, int rows, int cols)
//    {
//        
//    }
//}
public class Test13 {

	public static void main(String[] args) {
		System.out.println(movingCount(10, 1, 100));
	}

	public static int movingCount(int threshold, int rows, int cols) {
		// 让位数之和小于等于threadhold的位置标记为1；其余位置为0
		int[][] mark = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (sum(i) + sum(j) <= threshold) {
					mark[i][j] = 1;
				}
			}
		}
		int cnt = 0;
		fun(0, 0, mark);
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (mark[i][j] == 2) {
					cnt++;
				}
			}
		}
		return cnt;
	}

	public static void fun(int x, int y, int[][] mark) {
		//x和y不能搞反了
		if (x >= mark.length || y >= mark[0].length || x < 0 || y < 0 || mark[x][y] == 2 || mark[x][y] == 0) {
			return;
		}
		mark[x][y] = 2;
		fun(x + 1, y, mark);
		fun(x - 1, y, mark);
		fun(x, y - 1, mark);
		fun(x, y + 1, mark);
	}

	public static int sum(int number) {
		int sum = 0;
		while (number > 0) {
			sum = sum + number % 10;
			number = number / 10;
		}
		return sum;
	}

}
