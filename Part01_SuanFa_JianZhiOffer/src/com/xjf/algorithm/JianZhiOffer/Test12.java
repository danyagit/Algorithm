package com.xjf.algorithm.JianZhiOffer;

//�����е�·����**����***��dfs
//���⣺https://www.nowcoder.com/practice/c61c6999eecb4b8f88a98f66b273a3cc?tpId=13&tqId=11218&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking&from=cyc_github
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

		// ����������飬matrix��ֻҪ��str�е��ַ��ͱ��Ϊ1
		int[][] mark = new int[rows][cols];
		char[][] matrix2D = new char[rows][cols];

		// һά������ά����
		for (int r = 0, idx = 0; r < rows; r++)
			for (int c = 0; c < cols; c++)
				matrix2D[r][c] = matrix[idx++];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (judge(matrix2D, mark, str, 0, i,j, rows, cols)) {
					return true;
				} else {
					mark[i][j]=0;//���״̬
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
		//�����ת��Ϊ��ά���黹���У���Ϊ���ֻ��һλ����matrix����û���ж�Խ��ġ�
		//���磺matrix�е�matrix[8]������ǲ��������ߵģ�����һλ�����index-1���ܵ���һ��ĩβ�ˣ����������󣬲�������
		if (i >= matrix2D.length || i < 0 ||j>=matrix2D[0].length||j<0|| mark[i][j] == 1 || matrix2D[i][j] != str[strIndex]) {
			return false;
		}
		mark[i][j] = 1;
		if (judge(matrix2D, mark, str, strIndex + 1, i - 1,j, rows, cols) || // ��
				judge(matrix2D, mark, str, strIndex + 1, i + 1,j, rows, cols) || // ��
				judge(matrix2D, mark, str, strIndex + 1,i, j - 1, rows, cols) || // ��
				judge(matrix2D, mark, str, strIndex + 1,i, j + 1, rows, cols)) {
			return true;
		} else {
			return false;
		}
		
	}

}
