package com.xjf.algorithm.JianZhiOffer;

//Ϊ�����ر�����һ��1~13�а���1��������
//1��10��11��12��13��˹�����6��,
//���Ƕ��ں�����������û���ˡ�
//ACMerϣ�����ǰ����,������������ձ黯,
//���Ժܿ���������Ǹ�����������1���ֵĴ���
//����1 �� n ��1���ֵĴ�����
public class Test43 {

	public static void main(String[] args) {

	}

	public int NumberOf1Between1AndN_Solution(int n) {
		int cnt=0;
		for (int i = 1; i<=n; i++) {
			cnt=cnt+count(i);
		}
		return cnt;
	}
	public int count(int num) {
		int cnt=0;
		while(num>0) {
			if(num%10==1) {
				cnt++;
			}
			num=num/10;
		}
		return cnt;
	}
	

}
