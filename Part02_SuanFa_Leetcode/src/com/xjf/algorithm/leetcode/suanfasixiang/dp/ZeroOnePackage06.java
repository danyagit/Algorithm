package com.xjf.algorithm.leetcode.suanfasixiang.dp;

import java.util.Arrays;
import java.util.List;

//���ʲ��
/**
 * dict �еĵ���û��ʹ�ô��������ƣ��������һ����ȫ��������(˳�����dp[])��
 * ���˳�����ȫ��������ʱ������Ʒ�ĵ���Ӧ�÷�������㣬�Ա����ĵ���������㣬ֻ��������������Ʒ��һ��˳����뱳���С�
 * @author xjf
 *
 */

public class ZeroOnePackage06 {

	public static void main(String[] args) {
		ZeroOnePackage06 zeroOnePackage06 = new ZeroOnePackage06();
		String[] strs = {"leet","code"};
		List<String> wordDict = Arrays.asList(strs);
		boolean wordBreak = zeroOnePackage06.wordBreak("codeleet", wordDict);
		System.out.println(wordBreak);
	}

	public boolean wordBreak(String s, List<String> wordDict) {
		int n = s.length();
	    boolean[] dp = new boolean[n + 1];
	    dp[0] = true;
	    for (int i = 1; i <= n; i++) {
	        for (String word : wordDict) {   // ����Ʒ�ı���Ӧ�÷��������
	            int len = word.length();
	            if (len <= i && word.equals(s.substring(i - len, i))) {
	                dp[i] = dp[i] || dp[i - len];
	            }
	        }
	    }
	    return dp[n];
	}

}
