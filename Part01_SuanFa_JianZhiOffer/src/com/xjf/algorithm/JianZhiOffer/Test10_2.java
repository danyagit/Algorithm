package com.xjf.algorithm.JianZhiOffer;

//���θ���,쳲��������У��ݹ�
//����Ŀ


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
