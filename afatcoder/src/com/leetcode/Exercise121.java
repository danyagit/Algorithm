package com.leetcode;

public class Exercise121 {

	public static void main(String[] args) {

	}
	//̫���ˣ�����
	public int maxProfit(int[] prices) {
		if (prices == null || prices.length <= 1) {
			return 0;
		}
		int curMin=Integer.MAX_VALUE;
		int maxProfit=0;
		for (int i = 0; i < prices.length; i++) {
			if(prices[i]<curMin) {
				curMin=prices[i];
			}
			if(prices[i]-curMin>maxProfit) {
				maxProfit=prices[i]-curMin;
			}
		}
		return maxProfit;
	}
}
