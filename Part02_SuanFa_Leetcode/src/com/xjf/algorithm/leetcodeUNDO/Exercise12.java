package com.xjf.algorithm.leetcodeUNDO;

import java.util.HashMap;
import java.util.Map;

//把这些特殊的也排在一起
public class Exercise12 {

	public static void main(String[] args) {
		String str = Exercise12.intToRoman(1994);
		System.out.println(str);
	}
	public static final Map<Integer, String> map = new HashMap<>();
	public static String intToRoman(int num) {
		map.put(4, "IV");
		map.put(9, "IX");
		map.put(40, "XL");
		map.put(90, "XC");
		map.put(400, "CD");
		map.put(900, "CM");
		map.put(1, "I");
		map.put(5, "V");
		map.put(10, "X");
		map.put(50, "L");
		map.put(100, "C");
		map.put(500, "D");
		map.put(1000, "M");
		
		//从小到大排列
		int [] array = {1,4,5,9,10,40,50,90,100,400,500,900,1000};
		int [] array1 = new int[13];
		
		//一个个取余
		for (int i = 12; i >=0; i--) {
			array1[i]=num/array[i];
			num=num%array[i];
		}
		
		String res = "";
		for (int i = 12; i >=0; i--) {
			int cnt = array1[i];
			while(cnt!=0) {
				res=res+map.get(array[i]);
				cnt--;
			}
		}
		
		return res;
	}

}
