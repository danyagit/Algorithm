package com.xjf.algorithm.JianZhiOffer;

import java.util.ArrayList;
import java.util.Arrays;

//�������ڵ����ֵ
//����һ������ͻ������ڵĴ�С���ҳ����л�����������ֵ�����ֵ��
//���磬�����������{2,3,4,2,6,2,5,1}���������ڵĴ�С3��
//��ôһ������6���������ڣ����ǵ����ֵ�ֱ�Ϊ{4,4,6,6,6,5}��
//�������{2,3,4,2,6,2,5,1}�Ļ�������������6����
//{[2,3,4],2,6,2,5,1}�� {2,[3,4,2],6,2,5,1}��
//{2,3,[4,2,6],2,5,1}�� {2,3,4,[2,6,2],5,1}��
//{2,3,4,2,[6,2,5],1}�� {2,3,4,2,6,[2,5,1]}��
//���ڴ������鳤�ȵ�ʱ�򣬷��ؿ�

public class Test59 {
	public static void main(String[] args) {
		int[]nums = new int[] {2,3,4,2,6,2,5,1};
		Test59 test59 = new Test59();
		ArrayList<Integer> list = test59.maxInWindows(nums, 3);
		System.out.println(0);
	}

	public ArrayList<Integer> maxInWindows(int[] num, int size) {
		ArrayList<Integer> list = new ArrayList<>();
		if(num==null||num.length==0||size==0||size>num.length) {
			return list;
		}
		for(int i=size-1;i<num.length;i++) {
			int[] array = Arrays.copyOfRange(num, i-size+1, i+1);
			list.add(maxOfArray(array));
		}
		return list;
	}
	public int maxOfArray(int[] array) {
		int max=array[0];
		for(int i=1;i<array.length;i++) {
			if(array[i]>max) {
				max=array[i];
			}
		}
		return max;
	}

}
