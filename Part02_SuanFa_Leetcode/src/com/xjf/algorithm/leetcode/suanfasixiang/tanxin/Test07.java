package com.xjf.algorithm.leetcode.suanfasixiang.tanxin;

//种花问题
//假设你有一个很长的花坛，一部分地块种植了花，另一部分却没有。
//可是，花卉不能种植在相邻的地块上，它们会争夺水源，两者都会死去。
//给定一个花坛（表示为一个数组包含0和1，其中0表示没种植花，1表示种植了花），和一个数 n 。能否在不打破种植规则的情况下种入 n 朵花？能则返回True，不能则返回False。
//
//示例 1:
//输入: flowerbed = [1,0,0,0,1], n = 1
//输出: True

public class Test07 {

	public static void main(String[] args) {

	}

	public boolean canPlaceFlowers(int[] flowerbed, int n) {
		if(flowerbed==null||flowerbed.length==0) {
			return false;
		}
		if(flowerbed.length==1&&flowerbed[0]==0) {
			return true;
		}
		int cnt = 0;
		for (int i = 0; i < flowerbed.length - 1; i++) {
			if(i==0) {
				if(flowerbed[i]==0&&flowerbed[i+1]==0) {
					cnt++;
					continue;
				}
			}
			if (flowerbed[i] == 1) {
				continue;
			} else {
				if ((flowerbed[i + 1] == 0 && i + 2==flowerbed.length)||(flowerbed[i + 1] == 0 && flowerbed[i + 2] == 0)) {
					cnt++;
					i = i + 1;
				}
				continue;
			}
		}
		if(cnt>=n) {
			return true;
		}
		return false;
	}
}
