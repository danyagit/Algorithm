package com.xjf.algorithm.JianZhiOffer;

//数值的整数次方：数学
//给定一个double类型的浮点数base和int类型的整数exponent。
//求base的exponent次方。
//保证base和exponent不同时为0
//public class Solution {
//    public double Power(double base, int exponent) {
//        
//  }
//}
public class Test16 {
	public static void main(String[] args) {
		System.out.println(Power(2, -3));
	}

	public static double Power(double base, int exponent) {

		double result = 0;
		if (exponent == 0 ) {
			return 1;
		}
		if (exponent < 0) {
			result = 1.0 / base;
			for (int i = 1; i < -exponent; i++) {
				result = result / base;
			}
		} else {
			result = base;
			for (int i = 1; i < exponent; i++) {
				result = base * result;
			}
		}

		return result;
	}
}
