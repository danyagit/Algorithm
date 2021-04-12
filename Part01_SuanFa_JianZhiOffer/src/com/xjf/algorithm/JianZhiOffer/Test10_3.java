package com.xjf.algorithm.JianZhiOffer;

//矩形覆盖,斐波那契数列
//一只青蛙一次可以跳上1级台阶，也可以跳上2级。
//求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。

//public class Solution {
//    public int JumpFloor(int target) {
//		if (target <= 2) {
//			return target;
//		} else {
//			return JumpFloor(target - 1) + JumpFloor(target - 2);
//		}
//    }
//}

class Test10_3 {

	public static void main(String[] args) {

	}

	public int JumpFloor(int target) {
		if (target <= 2) {
			return target;
		} else {
			return JumpFloor(target - 1) + JumpFloor(target - 2);
		}
	}
}
