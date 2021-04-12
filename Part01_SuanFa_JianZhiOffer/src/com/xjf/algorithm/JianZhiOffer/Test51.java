package com.xjf.algorithm.JianZhiOffer;
//TODO 困难 待做
//数组中的逆序对
//在数组中的两个数字，如果前面一个数字大于后面的数字，
//则这两个数字组成一个逆序对。
//输入一个数组,求出这个数组中的逆序对的总数P。
//并将P对1000000007取模的结果输出。 即输出P%1000000007

public class Test51 {

	public static void main(String[] args) {
		int array[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 0 };
		Test51 test = new Test51();
		System.out.println(test.InversePairs(array));
	}

	public int InversePairs(int[] array) {
		int cnt = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					cnt++;
				}
			}
		}
		return cnt % 1000000007;
	}

}
