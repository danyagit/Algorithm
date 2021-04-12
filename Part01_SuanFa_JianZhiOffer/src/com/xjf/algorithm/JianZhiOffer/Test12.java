package com.xjf.algorithm.JianZhiOffer;

//矩阵中的路径：**回溯***，dfs
//看题：https://www.nowcoder.com/practice/c61c6999eecb4b8f88a98f66b273a3cc?tpId=13&tqId=11218&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking&from=cyc_github
//public class Solution {
//    public boolean hasPath(char[] matrix, int rows, int cols, char[] str)
//    {
//    
//    }
//}
public class Test12 {
	public static void main(String[] args) {
		char[] matrix = "ABCEHJIGSFCSLOPQADEEMNOEADIDEJFMVCEIFGGS".toCharArray();
		int rows = 5;
		int cols = 8;
		char[] str = "SGGFIECVAASABCEHJIGQEM".toCharArray();
		System.out.println(new Test12().hasPath(matrix, rows, cols, str));
	}

	public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {

		// 建立标记数组，matrix中只要是str中的字符就标记为1
		int[][] mark = new int[rows][cols];
		char[][] matrix2D = new char[rows][cols];

		// 一维数组变二维数组
		for (int r = 0, idx = 0; r < rows; r++)
			for (int c = 0; c < cols; c++)
				matrix2D[r][c] = matrix[idx++];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (judge(matrix2D, mark, str, 0, i,j, rows, cols)) {
					return true;
				} else {
					mark[i][j]=0;//清空状态
					continue;
				}
			}

		}
		return false;
	}

	
	public static boolean judge(char[][] matrix2D, int[][] mark, char[] str, int strIndex, int i,int j, int rows, int cols) {
		if (strIndex >= str.length) {
			return true;
		}
		//这儿不转化为二维数组还不行，因为如果只用一位数组matrix，是没法判断越界的。
		//比如：matrix中的matrix[8]这个点是不能往左走的，你用一位数组的index-1就跑到上一行末尾了，而不是向左，不符题意
		if (i >= matrix2D.length || i < 0 ||j>=matrix2D[0].length||j<0|| mark[i][j] == 1 || matrix2D[i][j] != str[strIndex]) {
			return false;
		}
		mark[i][j] = 1;
		if (judge(matrix2D, mark, str, strIndex + 1, i - 1,j, rows, cols) || // 上
				judge(matrix2D, mark, str, strIndex + 1, i + 1,j, rows, cols) || // 下
				judge(matrix2D, mark, str, strIndex + 1,i, j - 1, rows, cols) || // 左
				judge(matrix2D, mark, str, strIndex + 1,i, j + 1, rows, cols)) {
			return true;
		} else {
			return false;
		}
		
	}

}
