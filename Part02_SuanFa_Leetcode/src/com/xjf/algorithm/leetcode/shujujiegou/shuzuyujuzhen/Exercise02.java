package com.xjf.algorithm.leetcode.shujujiegou.shuzuyujuzhen;

//2. �ı����ά��
public class Exercise02 {

	public static void main(String[] args) {

	}

	// ��nums��Ϊr��c�еĶ�ά����
	public int[][] matrixReshape(int[][] nums, int r, int c) {
		int row = nums.length;
		int col = nums[0].length;
		if (row * col != r * c) {
			return nums;
		}
		int[][] newArray = new int[r][c];
		//�������������������Ҫ����for���棬�����i��j�������
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
