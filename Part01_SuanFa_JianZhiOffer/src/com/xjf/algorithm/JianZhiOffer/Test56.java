package com.xjf.algorithm.JianZhiOffer;

import java.util.HashSet;
import java.util.Set;

//һ�����������������������֮�⣬���������ֶ����������Ρ�
//��д�����ҳ�������ֻ����һ�ε����֡�
public class Test56 {

	public static void main(String[] args) {

	}
	
	//num1,num2�ֱ�Ϊ����Ϊ1�����顣��������
	//��num1[0],num2[0]����Ϊ���ؽ��
	public void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
		Set<Integer> set = new HashSet<>();
		int size=0;
		for (int i = 0; i < array.length; i++) {
			size = set.size();
			set.add(array[i]);
			if(size == set.size()) {//���ָ������Ѿ����ڣ��Ͱ�����ǰ��Ҳɾ����
				set.remove(array[i]);
			}
		}
		num1[0]=(int)set.toArray()[0];
		num2[0]=(int)set.toArray()[1];
	}

}
