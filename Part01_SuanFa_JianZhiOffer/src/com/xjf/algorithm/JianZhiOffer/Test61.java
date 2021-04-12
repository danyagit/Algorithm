package com.xjf.algorithm.JianZhiOffer;

import java.util.Arrays;

//扑克牌顺子
//五张牌，其中大小鬼为癞子，牌面为 0。判断这五张牌是否能组成顺子。
public class Test61 {

	public static void main(String[] args) {
		
		
		
	}
	public boolean isContinuous(int [] numbers) {
		if (numbers == null || numbers.length == 0) {
			return false;
		}
		Arrays.sort(numbers);
		//统计0的个数
		int numOfZero=0;
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i]==0) {
				numOfZero++;
			}
		}
		int gap=0;
		for (int i = numOfZero; i < numbers.length-1; i++) {
			if(numbers[i+1]-numbers[i]==0) {
				return false;
			}
			if(numbers[i+1]-numbers[i]==1) {
				continue;
			}else if(numbers[i+1]-numbers[i]>1) {
				gap=gap+numbers[i+1]-numbers[i]-1;
			}
		}
		if(gap>numOfZero) {
			return false;
		}
		
		return true;
    }

}
