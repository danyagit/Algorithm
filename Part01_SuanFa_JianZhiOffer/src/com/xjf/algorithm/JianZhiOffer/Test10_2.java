package com.xjf.algorithm.JianZhiOffer;

//矩形覆盖,斐波那契数列，递归
//看题目


public class Test10_2 {

	public static void main(String[] args) {

	}

	public int RectCover(int target) {
		if (target <= 2) {
			return target;
		} else {
			return RectCover(target - 1) + RectCover(target - 2);
		}
	}
}
