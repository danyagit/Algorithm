package com.xjf.algorithm.JianZhiOffer;

import java.util.ArrayList;

//��ΪS�������������У�˫ָ��
//С����ϲ����ѧ,��һ����������ѧ��ҵʱ,
//Ҫ������9~16�ĺ�,�����Ͼ�д������ȷ����100��
//���������������ڴ�,�����뾿���ж�����
//�������������еĺ�Ϊ100(���ٰ���������)��
//û���,���͵õ���һ������������Ϊ100������:18,19,20,21,22��
//���ڰ����⽻����,
//���ܲ���Ҳ�ܿ���ҳ����к�ΪS��������������? 
//������к�ΪS�������������С������ڰ��մ�С�����˳��
//���м䰴�տ�ʼ���ִ�С�����˳��
public class Test57_2 {

	public static void main(String[] args) {

	}

	public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
		ArrayList<ArrayList<Integer>> lists = new ArrayList<ArrayList<Integer>>();

		if (sum < 1)
			return lists;

		int left = 1, right = 2;
		while (left <= sum / 2) {//�϶���һһ������
			int cur = (left + right) * (right - left + 1) / 2;//�Ȳ�������͹�ʽ
			if (cur == sum) {
				ArrayList<Integer> list = new ArrayList<Integer>();
				for (int i = left; i <= right; i++) {
					list.add(i);
				}
				lists.add(list);
				left++;
			} else if (cur > sum) {
				left++;
			} else {
				right++;
			}
		}
		return lists;
	}

}
