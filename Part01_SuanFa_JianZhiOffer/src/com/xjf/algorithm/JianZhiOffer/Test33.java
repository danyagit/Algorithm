package com.xjf.algorithm.JianZhiOffer;

import java.util.Arrays;

//�����������ĺ����������:������ ���������������
//����һ���������飬�жϸ������ǲ���ĳ�����������ĺ�������Ľ����
//������򷵻�true,���򷵻�false��
//�������������������������ֶ�������ͬ��
//������������������ڵ㶼С�ڸ��ڵ㣬�����ҽڵ㶼���ڸ��ڵ㡣
public class Test33 {

	public static void main(String[] args) {
		int[] sequence = new int[] { 4, 8, 6, 12, 16, 14, 10 };
		System.out.println(new Test33().VerifySquenceOfBST(sequence));
	}

	public boolean VerifySquenceOfBST(int[] sequence) {
		if(sequence.length==0) {
			return false;
		}
		if (sequence.length <= 1) {
			return true;
		}
		
		int root = sequence[sequence.length - 1];
		if(firstSmallerIndex(sequence)<0) {//����û����ڵ�����
			return true;
		}
		int[] left = Arrays.copyOfRange(sequence, 0, firstSmallerIndex(sequence) + 1);
//		int [] right = Arrays.copyOfRange(sequence, firstBiggerIndex(arr)+1, arr.length-2);
		for (int i = 0; i < left.length; i++) {
			if (root < left[i]) {
				return false;
			} 
		}
		return VerifySquenceOfBST(left);

	}

	public int firstSmallerIndex(int[] arr) {
		int last = arr[arr.length - 1];
		int index = -1;
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] < last) {
				index = i;
				break;
			}
		}
		return index;
	}
}
