package com.xjf.algorithm.JianZhiOffer;

//��̬��̨��쳲���������
//һֻ����һ�ο�������1��̨�ף�Ҳ��������2��������Ҳ��������n����
//�����������һ��n����̨���ܹ��ж�����������
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
