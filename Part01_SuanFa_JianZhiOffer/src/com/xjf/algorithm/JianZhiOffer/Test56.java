package com.xjf.algorithm.JianZhiOffer;

import java.util.HashSet;
import java.util.Set;

//一个整型数组里除了两个数字之外，其他的数字都出现了两次。
//请写程序找出这两个只出现一次的数字。
public class Test56 {

	public static void main(String[] args) {

	}
	
	//num1,num2分别为长度为1的数组。传出参数
	//将num1[0],num2[0]设置为返回结果
	public void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
		Set<Integer> set = new HashSet<>();
		int size=0;
		for (int i = 0; i < array.length; i++) {
			size = set.size();
			set.add(array[i]);
			if(size == set.size()) {//发现该数据已经存在，就把它以前的也删除了
				set.remove(array[i]);
			}
		}
		num1[0]=(int)set.toArray()[0];
		num2[0]=(int)set.toArray()[1];
	}

}
