package com.xjf.algorithm.leetcode.suanfasixiang.erfen;

//x 的平方根
//实现 int sqrt(int x) 函数。
//计算并返回 x 的平方根，其中 x 是非负整数。
//由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
//
//示例 1:
//输入: 4
//输出: 2
//示例 2:
//输入: 8
//输出: 2
//说明: 8 的平方根是 2.82842...,由于返回类型是整数，小数部分将被舍去。
public class Test01 {

	public static void main(String[] args) {
		Test01 test01 = new Test01();
		int mySqrt = test01.mySqrt(2147395599);
		System.out.println(mySqrt);
	}

	public int mySqrt(int x) {
		//这里要用long
		long left = 0;
		long right = x;
		if(x<1) {
			return 0;
		}
		if(x==1) {
			return 1;
		}
		while (left < right) {
			if (right - left <= 1) {
				return (int)left;
			}
			//这儿不加括号是不行的
			if (((right + left) / 2) * ((right + left) / 2 )< x) {
				left = (right + left) / 2;
			} else if (((right + left) / 2) * ((right + left) / 2 )> x) {
				right = (right + left) / 2;
			} else {
				return (int)(right + left) / 2;
			}
		}
		return 0;
	}
}
