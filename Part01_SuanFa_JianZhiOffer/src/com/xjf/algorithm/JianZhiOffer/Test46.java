package com.xjf.algorithm.JianZhiOffer;

//剑指 Offer 46. 把数字翻译成字符串
//给定一个数字，我们按照如下规则把它翻译为字符串：
//0 翻译成 “a” ，1 翻译成 “b”，……，11 翻译成 “l”，……，25 翻译成 “z”。
//一个数字可能有多个翻译。请编程实现一个函数，用来计算一个数字有多少种不同的翻译方法。
/**
 * 动态规划，dp[i]表示数字的第i位（0位开始）,及以前构成的数字串能翻译成的种数
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
	
//	//翻译一位或者两位数字
//	public Character Translate(int num) {
//		if(num<0||num>25) {
//			return null;
//		}
//		else {
//			return (char) ('a'+num);
//		}
//	}
	
}
