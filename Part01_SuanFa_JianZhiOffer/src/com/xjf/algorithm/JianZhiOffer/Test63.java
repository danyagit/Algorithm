package com.xjf.algorithm.JianZhiOffer;

//买卖股票的最佳时机
//给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
//如果你最多只允许完成一笔交易（即买入和卖出一支股票一次），设计一个算法来计算你所能获取的最大利润。
//注意：你不能在买入股票前卖出股票

/**
 * 用一个min记录当前最小值
 * @author xjf
 *
 */

public class Test63 {

	public static void main(String[] args) {

	}

	public int maxProfit(int[] prices) {
		if(prices==null||prices.length<=1) {
			return 0;
		}
		int curMin = prices[0];
		int maxProfit =-999999;
		
		for(int i=1;i<prices.length;i++) {
			if(prices[i]-curMin>maxProfit) {
				maxProfit=prices[i]-curMin;
			}
			if(prices[i]<curMin) {
				curMin=prices[i];
			}
		}
		if(maxProfit<0) {//只能亏本的时候，就当天卖
			return 0;
		}
		return maxProfit;
	}

}
