package com.xjf.algorithm.leetcode.shujujiegou.shuzuyujuzhen;

//����������
public class Exercise04 {

	public static void main(String[] args) {

	}

	public boolean searchMatrix(int[][] matrix, int target) {
		int a=matrix.length;
		int b = matrix[0].length;
		
		for (int i = 0; i < a; i++) {
			if(matrix[i][0]>target) {
				return false;
			}
			for (int j = 0; j < b; j++) {
				if (matrix[i][j] > target) {
					b=j;//��С��Χ
					break;
				} else if (matrix[i][j] < target) {
					continue;
				} else {
					return true;
				}
			}
		}
		return false;
	}
}
