package com.xjf.algorithm.JianZhiOffer;

//��ά�����еĲ���:���飬����
//��һ����ά�����У�ÿ��һά����ĳ�����ͬ����
//ÿһ�ж����մ����ҵ�����˳������
//ÿһ�ж����մ��ϵ��µ�����˳�����������һ��������
//����������һ����ά�����һ���������ж��������Ƿ��и�������
/*public class Solution {
    public boolean Find(int target, int [][] array) {

    }
}*/


public class Test04 {

	public static void main(String[] args) {
		int[][] array = new int[][] { { 1, 2, 3 }, { 2, 3, 4 }, { 3, 4, 5 } };
		System.out.println(Find(1, array));
	}

	public static boolean Find(int target, int [][] array) {
        int i = 0;
        int j = array[0].length-1;
        while(j>=0&&i<array.length){
            if(target==array[i][j]){
                return true;
            }else if(target>array[i][j]){
                i++;
            }else{
                j--;
            }
        }
        return false;
    }
//	public static boolean Find(int target, int[][] array) {
//		//���жϿ�ָ��ͳ��ȣ�array[0].length == 0��Ҫ����
//		if (array == null || array.length ==0 ||array[0].length == 0) {
//			return false;
//		}
//		int m = array.length;
//		int n = array[0].length;
//		//���жϷ�Χ
//		if(target < array[0][0] || target > array[m - 1][n - 1]) {
//			return false;
//		}
//		for (int i = 0; i < m; i++) {
//			if (target < array[i][0] || target > array[i][n - 1]) {
//				continue;
//			} else {
//				for (int j = 0; j < n; j++) {
//					if (target == array[i][j]) {
//						return true;
//					} else {
//						continue;
//					}
//				}
//			}
//		}
//		return false;
//
//	}
}
