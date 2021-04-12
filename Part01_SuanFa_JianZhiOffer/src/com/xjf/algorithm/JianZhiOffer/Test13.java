package com.xjf.algorithm.JianZhiOffer;

//�����˵��˶���Χ��ͼ:dfs�����������
//������һ��m�к�n�еķ���
//һ�������˴�����0,0�ĸ��ӿ�ʼ�ƶ���
//ÿһ��ֻ�������ң��ϣ����ĸ������ƶ�һ��
//���ǲ��ܽ�������������������λ֮�ʹ���k�ĸ��ӡ� 
//���磬��kΪ18ʱ���������ܹ����뷽��35,37������Ϊ3+5+3+7 = 18��
//���ǣ������ܽ��뷽��35,38������Ϊ3+5+3+8= 19��
//���ʸû������ܹ��ﵽ���ٸ����ӣ�
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
		// ��λ��֮��С�ڵ���threadhold��λ�ñ��Ϊ1������λ��Ϊ0
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
		//x��y���ܸ㷴��
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
