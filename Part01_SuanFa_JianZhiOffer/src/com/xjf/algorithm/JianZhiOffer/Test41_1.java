package com.xjf.algorithm.JianZhiOffer;

import java.util.ArrayList;
import java.util.Arrays;

//�������е���λ��
//��εõ�һ���������е���λ����
//������������ж�����������ֵ��
//��ô��λ������������ֵ����֮��λ���м����ֵ��
//������������ж���ż������ֵ��
//��ô��λ������������ֵ����֮���м���������ƽ��ֵ��
//����ʹ��Insert()������ȡ��������
//ʹ��GetMedian()������ȡ��ǰ��ȡ���ݵ���λ����

/**
 * ����Arrays.sort��
 * TODO ��ʵ����Ҫ���Сʱ�临�Ӷȣ���Ҫ�õ�����
 * @author xjf
 *
 */


public class Test41_1 {

	public static void main(String[] args) {

	}
	ArrayList<Integer> list = new ArrayList<>();
	public void Insert(Integer num) {
		list.add(num);
	}

	public Double GetMedian() {
		Object[] array = list.toArray();
		Arrays.sort(array);
		if(array.length%2==0) {
			return (double)((int)array[array.length/2]+(int)array[array.length/2-1])/2 ;
		}
		else return (double) (int)array[array.length/2];
	}

}
