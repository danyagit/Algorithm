package com.xjf.algorithm.JianZhiOffer;

//��ֵ�������η�����ѧ
//����һ��double���͵ĸ�����base��int���͵�����exponent��
//��base��exponent�η���
//��֤base��exponent��ͬʱΪ0
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
