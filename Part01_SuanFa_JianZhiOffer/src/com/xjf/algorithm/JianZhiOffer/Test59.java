package com.xjf.algorithm.JianZhiOffer;

import java.util.ArrayList;
import java.util.Arrays;

//滑动窗口的最大值
//给定一个数组和滑动窗口的大小，找出所有滑动窗口里数值的最大值。
//例如，如果输入数组{2,3,4,2,6,2,5,1}及滑动窗口的大小3，
//那么一共存在6个滑动窗口，他们的最大值分别为{4,4,6,6,6,5}；
//针对数组{2,3,4,2,6,2,5,1}的滑动窗口有以下6个：
//{[2,3,4],2,6,2,5,1}， {2,[3,4,2],6,2,5,1}，
//{2,3,[4,2,6],2,5,1}， {2,3,4,[2,6,2],5,1}，
//{2,3,4,2,[6,2,5],1}， {2,3,4,2,6,[2,5,1]}。
//窗口大于数组长度的时候，返回空

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
