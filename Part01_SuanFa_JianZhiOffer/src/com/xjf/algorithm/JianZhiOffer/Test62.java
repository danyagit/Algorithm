package com.xjf.algorithm.JianZhiOffer;

//ԲȦ�����ʣ�µ��� TODO �����ᣨ�򵥣�
//����,��С������Χ��һ����Ȧ��
//Ȼ��,�����ָ��һ����m,�ñ��Ϊ0��С���ѿ�ʼ������
//ÿ�κ���m-1���Ǹ�С����Ҫ���г��׸�,
//Ȼ���������Ʒ�����������ѡ����,���Ҳ��ٻص�Ȧ��,
//��������һ��С���ѿ�ʼ,����0...m-1����....������ȥ....
//ֱ��ʣ�����һ��С����,���Բ��ñ���,
//�����õ�ţ������ġ�����̽���ϡ���ذ�(��������Ŷ!!^_^)��
//������������,�ĸ�С���ѻ�õ������Ʒ�أ�
//(ע��С���ѵı���Ǵ�0��n-1)
//���û��С���ѣ��뷵��-1
public class Test62 {

	public static void main(String[] args) {
		Test62 test62 = new Test62();
		int a = test62.LastRemaining_Solution(6, 7);
		System.out.println(a);
	}

	public int LastRemaining_Solution(int n, int m) {

		return f(n, m);
	}

	public int f(int n, int m) {
		if (n == 1) {
			return 0;
		}
		int x = f(n - 1, m);
		return (m + x) % n;
	}

}
