package com.xjf.algorithm.JianZhiOffer;

import java.util.HashMap;
import java.util.Map;

//请从字符串中找出一个最长的不包含重复字符的子字符串，计算该最长子字符串的长度。
//输入: "abcabcbb"
//输出: 3 
//解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
/**
 * 经典题目，重在分类讨论。
 * dp[i]表示以i位置结束的最长长度
 * 用map来储存离a最近的之前的那个a，是个好办法。
 * @author xjf
 *
 */
public class Test48 {

	public static void main(String[] args) {
		Test48 test48 = new Test48();
		int length = test48.lengthOfLongestSubstring("abcabcbb");
		System.out.println(length);
	}

	public int lengthOfLongestSubstring(String s) {
		if (s.length() == 0) {
			return 0;
		}
		int[] dp = new int[s.length()];
		dp[0] = 1;
		Map<Character, Integer> map = new HashMap<>();
		map.put(s.charAt(0), 0);
		for (int i = 1; i < s.length(); i++) {
			//如果字符a前面都不含字符a,或者前面的字符a太远了,就让dp[i] = dp[i - 1] + 1;
			if ((!map.containsKey(s.charAt(i))) || (i - map.get(s.charAt(i)) > dp[i - 1])) {
				dp[i] = dp[i - 1] + 1;
			} else {
			//如果上一个字符a很近，那么dp[i]就是两个a的距离差
				dp[i] = i - map.get(s.charAt(i));
			}
			map.put(s.charAt(i), i);
		}
		int max = dp[0];
		for (int i = 1; i < dp.length; i++) {
			if (dp[i] > max) {
				max = dp[i];
			}
		}
		return max;
	}

}
