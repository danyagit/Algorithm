package com.xjf.algorithm.JianZhiOffer;

//��ת�������С����:����
//��һ�������ʼ�����ɸ�Ԫ�ذᵽ�����ĩβ�����ǳ�֮Ϊ�������ת��
//����һ���ǵݼ�����������һ����ת�������ת�������СԪ�ء�
//��������[3,4,5,1,2]Ϊ[1,2,3,4,5]��һ����ת�����������СֵΪ1��
//NOTE������������Ԫ�ض�����0���������СΪ0���뷵��0��
//import java.util.ArrayList;
//public class Solution {
//    public int minNumberInRotateArray(int [] array) {
//    
//    }
//}
public class Test11 {
	public static void main(String[] args) {
		int[] array = new int[] {3,4,5,1,2};
		System.out.println(minNumberInRotateArray(array));
	}

	public static int minNumberInRotateArray(int [] array) {
		if(array==null||array.length==0) {
			return 0;
		}
		int min=0;
	    for(int i=0;i<array.length-1;i++ ) {
	    	if(array[i+1]<array[i]) {
	    		min = array[i+1];
	    		break;
	    	}
	    }
		return min;
    }
}