package com.xjf.algorithm.JianZhiOffer;

//二进制中1的个数：进制转化 补码反码原码 数学
//输入一个整数，输出该数32位二进制表示中1的个数。其中负数用补码表示。
//public class Solution {
//    public int NumberOf1(int n) {
//
//    }
//}
public class Test15 {

	public static void main(String[] args) {
		System.out.println(NumberOf1(7));
	}

	public static int NumberOf1(int n) {
		int cnt = 0;
		while (n != 0) {
			cnt++;
			//位运算&，上下都是1才是1.输入的n是十进制的会自动转化为二进制进行位运算
			//n和n-1进行位运算&的效果就是少一个1
			n &= (n - 1);
		}
		return cnt;
	}
}
