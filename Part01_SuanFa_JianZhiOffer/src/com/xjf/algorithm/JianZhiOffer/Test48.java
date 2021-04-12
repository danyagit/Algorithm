package com.xjf.algorithm.JianZhiOffer;

import java.util.HashMap;
import java.util.Map;

//����ַ������ҳ�һ����Ĳ������ظ��ַ������ַ��������������ַ����ĳ��ȡ�
//����: "abcabcbb"
//���: 3 
//����: ��Ϊ���ظ��ַ�����Ӵ��� "abc"�������䳤��Ϊ 3��
/**
 * ������Ŀ�����ڷ������ۡ�
 * dp[i]��ʾ��iλ�ý����������
 * ��map��������a�����֮ǰ���Ǹ�a���Ǹ��ð취��
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
			//����ַ�aǰ�涼�����ַ�a,����ǰ����ַ�a̫Զ��,����dp[i] = dp[i - 1] + 1;
			if ((!map.containsKey(s.charAt(i))) || (i - map.get(s.charAt(i)) > dp[i - 1])) {
				dp[i] = dp[i - 1] + 1;
			} else {
			//�����һ���ַ�a�ܽ�����ôdp[i]��������a�ľ����
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
