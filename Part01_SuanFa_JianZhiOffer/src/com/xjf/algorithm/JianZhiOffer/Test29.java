package com.xjf.algorithm.JianZhiOffer;
//顺时针打印矩阵:数组，已通过，但看看还有没有别的方法
//输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
//例如，如果输入如下4 X 4矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 
//则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
//public class Solution {
//    public ArrayList<Integer> printMatrix(int [][] matrix) {
//       
//    }
//}
/**
 * 29. 顺时针打印矩阵
 * 我这个是按圈来打印
 */
import java.util.ArrayList;

public class Test29 {
	public static void main(String[] args) {
		int[][] matrix = new int[][] { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 } };
		printMatrix(matrix);
	}

	public static ArrayList<Integer> printMatrix(int[][] matrix) {
		if (matrix == null || matrix.length == 0) {
			return null;
		}
		int width = matrix.length;
		int length = matrix[0].length;
		int cnt = 0;
		if (width <= length) {
			cnt = (width + 1) / 2;
		} else {
			cnt = (length + 1) / 2;
		}
		ArrayList<Integer> list = new ArrayList<>();
		if (width == 1) {
			for (int i = 0; i < length; i++) {
				list.add(matrix[0][i]);
			}
			return list;
		}
		if (length == 1) {
			for (int i = 0; i < width; i++) {
				list.add(matrix[i][0]);
			}
			return list;
		}
		int leftRows = width;
		for (int i = 0; i < cnt; i++) {
			fourEdge(i, matrix, list, leftRows);
			leftRows = leftRows - 2;
		}
		return list;
	}

	public static void fourEdge(int i, int[][] matrix, ArrayList<Integer> list, int leftRows) {
		int width = matrix.length;
		int length = matrix[0].length;
		for (int j = i; j <= length - i - 1; j++) {
			list.add(matrix[i][j]);
		}
		if (leftRows > 1) {
			for (int j = i + 1; j <= width - i - 1; j++) {
				list.add(matrix[j][length - i - 1]);
			}
			for (int j = length - i - 2; j >= i; j--) {
				list.add(matrix[width - i - 1][j]);
			}
			for (int j = width - i - 2; j > i; j--) {
				list.add(matrix[j][i]);
			}
		}

	}
}
