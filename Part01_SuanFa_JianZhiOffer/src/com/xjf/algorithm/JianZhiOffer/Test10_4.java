package com.xjf.algorithm.JianZhiOffer;

//变态跳台阶斐波那契数列
//一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。
//求该青蛙跳上一个n级的台阶总共有多少种跳法。
//public class Solution {
//    public int JumpFloorII(int target) {
//        
//    }
//}
public class Test10_4 {

	public static void main(String[] args) {

	}

	public int JumpFloorII(int target) {
		if (target <= 2) {
			return target;
		} else {
			return 2*JumpFloorII(target - 1) ;
		}
	}
}
