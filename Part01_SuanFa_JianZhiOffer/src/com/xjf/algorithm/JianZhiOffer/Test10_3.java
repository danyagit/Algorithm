package com.xjf.algorithm.JianZhiOffer;

//���θ���,쳲���������
//һֻ����һ�ο�������1��̨�ף�Ҳ��������2����
//�����������һ��n����̨���ܹ��ж������������Ⱥ����ͬ�㲻ͬ�Ľ������

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
