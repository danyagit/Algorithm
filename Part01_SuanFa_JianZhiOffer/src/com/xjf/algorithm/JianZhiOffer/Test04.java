package com.xjf.algorithm.JianZhiOffer;

//二维数组中的查找:数组，查找
//在一个二维数组中（每个一维数组的长度相同），
//每一行都按照从左到右递增的顺序排序，
//每一列都按照从上到下递增的顺序排序。请完成一个函数，
//输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
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
//		//先判断空指针和长度，array[0].length == 0不要忘记
//		if (array == null || array.length ==0 ||array[0].length == 0) {
//			return false;
//		}
//		int m = array.length;
//		int n = array[0].length;
//		//再判断范围
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
