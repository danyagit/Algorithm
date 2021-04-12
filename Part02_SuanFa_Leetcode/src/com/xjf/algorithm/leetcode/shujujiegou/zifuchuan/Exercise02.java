package com.xjf.algorithm.leetcode.shujujiegou.zifuchuan;

//2. 字符串循环移位
public class Exercise02 {
	public static void main(String[] args) {
		Exercise02 exercise02 = new Exercise02();
		String string = exercise02.moveCycle("abcde", 8);
		System.out.println(string);
	}

//	abcde向右循环移位3位,cdeab
	// 将字符串向右循环移动k位
	public String moveCycle(String str, int k) {
		int length = str.length();
		// 就是将后k位和前面的交换位置
		String substring1 = str.substring(length - k%length, length );
		String substring2 = str.substring(0, length - k%length);
		return substring1+substring2;
	}
	
}
