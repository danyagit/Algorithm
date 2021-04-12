package com.xjf.algorithm.leetcode.suanfasixiang.dp;

import java.util.Arrays;
import java.util.List;

//单词拆分
/**
 * dict 中的单词没有使用次数的限制，因此这是一个完全背包问题(顺序遍历dp[])。
 * 求解顺序的完全背包问题时，对物品的迭代应该放在最里层，对背包的迭代放在外层，只有这样才能让物品按一定顺序放入背包中。
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
	        for (String word : wordDict) {   // 对物品的遍历应该放在最里层
	            int len = word.length();
	            if (len <= i && word.equals(s.substring(i - len, i))) {
	                dp[i] = dp[i] || dp[i - len];
	            }
	        }
	    }
	    return dp[n];
	}

}
