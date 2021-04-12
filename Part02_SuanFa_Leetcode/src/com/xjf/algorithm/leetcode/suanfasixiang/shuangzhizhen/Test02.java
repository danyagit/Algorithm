package com.xjf.algorithm.leetcode.suanfasixiang.shuangzhizhen;

//ƽ����֮��
//����һ���Ǹ����� c ��
//��Ҫ�ж��Ƿ������������ a �� b��ʹ�� a2 + b2 = c ��
public class Test02 {

	public static void main(String[] args) {

	}

	public boolean judgeSquareSum(int c) {
		double pow = Math.pow(c, 0.5);
		int right=(int)(pow)+1;
		int left=0;
		while(left<=right) {
			if(left*left+right*right>c) {
				right--;
				continue;
			}
			if(left*left+right*right<c) {
				left++;
				continue;
			}else {
				return true;
			}
		}
		return false;
	}
}
