package com.xjf.algorithm.JianZhiOffer;
//TODO ���� ����
//�����е������
//�������е��������֣����ǰ��һ�����ִ��ں�������֣�
//���������������һ������ԡ�
//����һ������,�����������е�����Ե�����P��
//����P��1000000007ȡģ�Ľ������� �����P%1000000007

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
