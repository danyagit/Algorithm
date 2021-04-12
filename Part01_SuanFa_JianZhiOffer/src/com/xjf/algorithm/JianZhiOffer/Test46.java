package com.xjf.algorithm.JianZhiOffer;

//��ָ Offer 46. �����ַ�����ַ���
//����һ�����֣����ǰ������¹����������Ϊ�ַ�����
//0 ����� ��a�� ��1 ����� ��b����������11 ����� ��l����������25 ����� ��z����
//һ�����ֿ����ж�����롣����ʵ��һ����������������һ�������ж����ֲ�ͬ�ķ��뷽����
/**
 * ��̬�滮��dp[i]��ʾ���ֵĵ�iλ��0λ��ʼ��,����ǰ���ɵ����ִ��ܷ���ɵ�����
 * @author xjf
 *
 */


public class Test46 {

	public static void main(String[] args) {
		Test46 test46 = new Test46();
		int num = test46.translateNum(624);
		System.out.println(num);
	}

	public int translateNum(int num) {
		if(num<10) {
			return 1;
		}
		String str = String.valueOf(num);
		char[] array = str.toCharArray();
		int [] dp = new int[str.length()];
		dp[0]=1;
		if(array[0]=='0'||array[0]>'2'||(array[0]>='2'&&array[1]>'5')) {
			dp[1]=1;
		}else {
			dp[1]=2;
		}
		for (int i = 2; i < dp.length; i++) {
			if(array[i-1]=='0'||array[i-1]>'2'||(array[i-1]>='2'&&array[i]>'5')) {
				dp[i]=dp[i-1];
			}else {
				dp[i]=dp[i-1]+dp[i-2];
			}
		}
		return dp[dp.length-1];
	}
	
//	//����һλ������λ����
//	public Character Translate(int num) {
//		if(num<0||num>25) {
//			return null;
//		}
//		else {
//			return (char) ('a'+num);
//		}
//	}
	
}
