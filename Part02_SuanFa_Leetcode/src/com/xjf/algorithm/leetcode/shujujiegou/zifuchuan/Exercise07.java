package com.xjf.algorithm.leetcode.shujujiegou.zifuchuan;

//7. 回文子字符串个数（medium）
/**
 * 中心扩展：从字符串的某一位开始，尝试着去扩展子字符串。
 * @author xjf
 *
 */
public class Exercise07 {

	public static void main(String[] args) {

	}

	private int cnt = 0;

	public int countSubstrings(String s) {
		for (int i = 0; i < s.length(); i++) {
			extendSubstrings(s, i, i); // 奇数长度
			extendSubstrings(s, i, i + 1); // 偶数长度
		}
		return cnt;
	}

	private void extendSubstrings(String s, int start, int end) {
		while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
			start--;
			end++;
			cnt++;
		}
	}
}
