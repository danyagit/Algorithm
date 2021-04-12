package com.xjf.algorithm.JianZhiOffer;
//˳ʱ���ӡ����:���飬��ͨ��������������û�б�ķ���
//����һ�����󣬰��մ���������˳ʱ���˳�����δ�ӡ��ÿһ�����֣�
//���磬�����������4 X 4���� 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 
//�����δ�ӡ������1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
//public class Solution {
//    public ArrayList<Integer> printMatrix(int [][] matrix) {
//       
//    }
//}
/**
 * 29. ˳ʱ���ӡ����
 * ������ǰ�Ȧ����ӡ
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
