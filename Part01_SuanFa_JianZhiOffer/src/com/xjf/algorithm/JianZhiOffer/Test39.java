package com.xjf.algorithm.JianZhiOffer;

import java.util.Arrays;

//数组中出现次数超过一半的数字
//数组中有一个数字出现的次数超过数组长度的一半，
//请找出这个数字。例如输入一个长度为9的数组
//{1,2,3,2,2,2,5,4,2}。由于数字2在数组中出现了5次，
//超过数组长度的一半，因此输出2。如果不存在则输出0。
public class Test39 {

	public static void main(String[] args) {

	}

	public int MoreThanHalfNum_Solution(int[] array) {
		Arrays.sort(array);
		int half = array.length / 2;
		int cnt = 0;
		for (int i = half; i < array.length; i++) {
			if (array[i] == array[half]) {
				cnt++;
			} else {
				break;
			}
		}
		for (int i = half - 1; i > 0; i--) {
			if (array[i] == array[half]) {
				cnt++;
			} else {
				break;
			}
		}
		if (cnt > half) {
			return array[half];
		} else {
			return 0;
		}

	}
}
