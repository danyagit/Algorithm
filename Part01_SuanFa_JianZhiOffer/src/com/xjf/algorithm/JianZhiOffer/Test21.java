package com.xjf.algorithm.JianZhiOffer;

import java.util.ArrayList;
//调整数组顺序使奇数位于偶数前面
//输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
//使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，
//并保证奇数和奇数，偶数和偶数之间的相对位置不变。
//public class Solution {
//    public void reOrderArray(int [] array) {
//        
//    }
//}
/**
 * 用两个数组分别存储奇数和偶数，最后再反向存储到原数组，不难
 * @author xjf
 *
 */

public class Test21 {

	public static void main(String[] args) {

	}

	public void reOrderArray(int[] array) {
		ArrayList<Integer> listOdd = new ArrayList<>();
		ArrayList<Integer> listEven = new ArrayList<>();

		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 1) {
				listOdd.add(array[i]);
			} else {
				listEven.add(array[i]);
			}
		}

		for (int i = 0; i < listOdd.size(); i++) {
			array[i] = listOdd.get(i);
		}
		for (int i = 0; i < listEven.size(); i++) {
			array[i + listOdd.size()] = listEven.get(i);
		}

	}

}
