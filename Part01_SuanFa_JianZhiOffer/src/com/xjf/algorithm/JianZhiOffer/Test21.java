package com.xjf.algorithm.JianZhiOffer;

import java.util.ArrayList;
//��������˳��ʹ����λ��ż��ǰ��
//����һ���������飬ʵ��һ�����������������������ֵ�˳��
//ʹ�����е�����λ�������ǰ�벿�֣����е�ż��λ������ĺ�벿�֣�
//����֤������������ż����ż��֮������λ�ò��䡣
//public class Solution {
//    public void reOrderArray(int [] array) {
//        
//    }
//}
/**
 * ����������ֱ�洢������ż��������ٷ���洢��ԭ���飬����
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
