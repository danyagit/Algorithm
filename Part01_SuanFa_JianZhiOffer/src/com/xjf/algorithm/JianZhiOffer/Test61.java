package com.xjf.algorithm.JianZhiOffer;

import java.util.Arrays;

//�˿���˳��
//�����ƣ����д�С��Ϊ��ӣ�����Ϊ 0���ж����������Ƿ������˳�ӡ�
public class Test61 {

	public static void main(String[] args) {
		
		
		
	}
	public boolean isContinuous(int [] numbers) {
		if (numbers == null || numbers.length == 0) {
			return false;
		}
		Arrays.sort(numbers);
		//ͳ��0�ĸ���
		int numOfZero=0;
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i]==0) {
				numOfZero++;
			}
		}
		int gap=0;
		for (int i = numOfZero; i < numbers.length-1; i++) {
			if(numbers[i+1]-numbers[i]==0) {
				return false;
			}
			if(numbers[i+1]-numbers[i]==1) {
				continue;
			}else if(numbers[i+1]-numbers[i]>1) {
				gap=gap+numbers[i+1]-numbers[i]-1;
			}
		}
		if(gap>numOfZero) {
			return false;
		}
		
		return true;
    }

}
