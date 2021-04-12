package com.xjf.algorithm.leetcodeUNDO;

//先对角线镜像，再翻转
public class Exercise48 {

	public static void main(String[] args) {

	}

	public void rotate(int[][] matrix) {
		int m = matrix.length;
		int n = matrix[0].length;
		for (int i = 0; i < m; i++) {
			for (int j = i+1; j < n; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
		for (int i = 0; i < m; i++) {
			reverse(matrix[i]);
		}
		
	}

	private void reverse(int[] nums) {
		int i = 0,j = nums.length-1;
		while(i<j) {
			int temp = nums[i];
			nums[i] = nums[j];
			nums[j] = temp;
			i++;
			j--;
		}
	}
}
