package com.leetcode;

public class Exercise76 {

	public static void main(String[] args) {

	}
	
//	输入：s = "ADOBECODEBANC", t = "ABC"
//	输出："BANC"
	//方法：双指针窗口
	//1、先从头开始，left指向字符串首位，right向右移动，直到left~right包含目标字符串
	//2、尝试将left向右移动，缩小窗口的大小，直到left~right不包含目标字符串，那么这个长度+1就是当前最小长度；
	//3、继续向右移动right，重复1
	//此处判断字符串是否包含另一个字符串，可以用int[128]来做，因为此处只要字符串里面该有的字符都有，而且对应的频率大于等于目标字符，就包含
	//像这种顺序不重要、频率重要的字符串相等判断，可以使用int[128]这种统计字符的频率
	public String minWindow(String s, String t) {
		
		
		return null;
	}
}
