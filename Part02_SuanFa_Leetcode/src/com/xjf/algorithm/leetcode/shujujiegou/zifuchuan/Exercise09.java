package com.xjf.algorithm.leetcode.shujujiegou.zifuchuan;
//统计二进制字符串中连续 1 和连续 0 数量相同的子字符串个数
//出现01或者10处，中心扩展
public class Exercise09 {

	public static void main(String[] args) {

	}
	public int countBinarySubstrings(String s) {
		int left=0;
		int right=0;
		int cnt=0;
		for (int i = 0; i < s.length()-1; i++) {
			if(s.charAt(i)!=s.charAt(i+1)) {
				left=i;
				right=i+1;
				while(left>=0&&right<s.length()) {
					cnt++;
					left--;
					right++;
					if(left<0||right>=s.length()||s.charAt(left)!=s.charAt(left+1)||s.charAt(right)!=s.charAt(right-1)) {
						break;
					}
				}
			}else {
				continue;
			}
			
		}
		return cnt;
    }
}
