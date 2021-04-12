package com.xjf.algorithm.leetcode.shujujiegou.shuzuyujuzhen;

//2. 改变矩阵维度
public class Exercise02 {

	public static void main(String[] args) {

	}

	// 将nums改为r行c列的二维数组
	public int[][] matrixReshape(int[][] nums, int r, int c) {
		int row = nums.length;
		int col = nums[0].length;
		if (row * col != r * c) {
			return nums;
		}
		int[][] newArray = new int[r][c];
		//遍历新数组的索引，不要放在for里面，避免和i，j搞混淆了
		int m=0,n=0;
		for (int i = 0; i < row ; i++) {
			for (int j = 0; j < col; j++) {
				newArray[m][n] =nums[i][j];
				n++;
				if(n==c) {
					m++;
					n=0;
					if(m==r) {
						return newArray;
					}
				}
			}
		}
		return newArray;
	}
}
