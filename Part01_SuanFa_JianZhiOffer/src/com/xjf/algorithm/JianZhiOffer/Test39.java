package com.xjf.algorithm.JianZhiOffer;

import java.util.Arrays;

//�����г��ִ�������һ�������
//��������һ�����ֳ��ֵĴ����������鳤�ȵ�һ�룬
//���ҳ�������֡���������һ������Ϊ9������
//{1,2,3,2,2,2,5,4,2}����������2�������г�����5�Σ�
//�������鳤�ȵ�һ�룬������2����������������0��
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
