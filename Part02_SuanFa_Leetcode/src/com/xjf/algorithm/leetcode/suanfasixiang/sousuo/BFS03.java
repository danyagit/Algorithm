package com.xjf.algorithm.leetcode.suanfasixiang.sousuo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

//127. 单词接龙
//给定两个单词（beginWord 和 endWord）和一个字典，找到从 beginWord 到 endWord 的最短转换序列的长度。转换需遵循如下规则：
//
//每次转换只能改变一个字母。
//转换过程中的中间单词必须是字典中的单词。
//说明:
//
//如果不存在这样的转换序列，返回 0。
//所有单词具有相同的长度。
//所有单词只由小写字母组成。
//字典中不存在重复的单词。
//你可以假设 beginWord 和 endWord 是非空的，且二者不相同。
//示例 1:
//
//输入:
//beginWord = "hit",
//endWord = "cog",
//wordList = ["hot","dot","dog","lot","log","cog"]
//
//输出: 5
//
//解释: 一个最短转换序列是 "hit" -> "hot" -> "dot" -> "dog" -> "cog",
//     返回它的长度 5。
//示例 2:
//
//输入:
//beginWord = "hit"
//endWord = "cog"
//wordList = ["hot","dot","dog","lot","log"]
//
//输出: 0
//
//解释: endWord "cog" 不在字典中，所以无法进行转换。

/**
 * TODO 太慢了5%
 * @author xjf
 *
 */
public class BFS03 {

	public static void main(String[] args) {
		BFS03 bfs03 = new BFS03();
		String beginWord = "hit";
		String endWord = "cog";
		String[] wordList0 = { "hot", "dot", "dog", "lot", "log", "cog" };
		ArrayList<String> wordList = new ArrayList<>();
		for (String string : wordList0) {
			wordList.add(string);
		}
		int length = bfs03.ladderLength(beginWord, endWord, wordList);
		System.out.println(length);
	}

	/*
	 * public int ladderLength(String beginWord, String endWord, List<String>
	 * wordList) {
	 * 
	 * boolean flag = false; for (String str : wordList) { if (str.equals(endWord))
	 * { flag = true; break; } }
	 * 
	 * 
	 * // 尾字母在字典里才进行 if (flag) { int[] mark = new int[wordList.size() + 1];
	 * Queue<String> queue = new LinkedList<>(); queue.add(beginWord); while
	 * (!queue.isEmpty()) { String poll = queue.poll(); // 判断poll的位置 int originIndex
	 * = getIndex(poll, wordList);
	 * 
	 * for (int i = 0; i < wordList.size(); i++) { if (judgeOneCharDiff(poll,
	 * wordList.get(i)) && mark[i + 1] == 0) {
	 * 
	 * mark[i + 1] = mark[originIndex+1] + 1; // 判断是否可以结束 if (wordList.get(i)
	 * .equals(endWord)) { return mark[i + 1]+1; } queue.add(wordList.get(i)); } } }
	 * 
	 * } return 0; }
	 * 
	 * public boolean judgeOneCharDiff(String a, String b) { int cnt = 0; if
	 * (a.length() != b.length()) { return false; } for (int i = 0; i < a.length();
	 * i++) { if (a.charAt(i) != b.charAt(i)) { cnt++; } } return cnt == 1; }
	 * 
	 * public int getIndex(String str, List<String> list) { int index = 0; for (int
	 * i = 0; i < list.size(); i++) { if (list.get(i).equals(str)) { index = i;
	 * break; } } return index; }
	 */

	Map<String, Integer> map = new HashMap<String, Integer>();

	public int ladderLength(String beginWord, String endWord, List<String> wordList) {

		for (int i = 0; i < wordList.size(); i++) {
			map.put(wordList.get(i), i);
		}
		if (!map.containsKey(beginWord)) {
			map.put(beginWord, 0);
		}

		// 尾字母在字典里才进行
		if (map.get(endWord) != null) {
			int[] mark = new int[wordList.size() + 1];//为beginWord预留位置
			Queue<String> queue = new LinkedList<>();
			queue.add(beginWord);
			while (!queue.isEmpty()) {
				String poll = queue.poll();
				// 判断poll的位置
				int originIndex = map.get(poll);

				for (int i = 0; i < wordList.size(); i++) {
					if (judgeOneCharDiff(poll, wordList.get(i)) && mark[i + 1] == 0) {

						mark[i + 1] = mark[originIndex + 1] + 1;
						// 判断是否可以结束
						if (wordList.get(i).equals(endWord)) {
							return mark[i + 1] + 1;
						}
						queue.add(wordList.get(i));
					}
				}
			}
		}
		return 0;
	}

	public boolean judgeOneCharDiff(String a, String b) {
		int cnt = 0;
		if (a.length() != b.length()) {
			return false;
		}
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) != b.charAt(i)) {
				cnt++;
			}
		}
		return cnt == 1;
	}

	public int getIndex(String str, List<String> list) {
		int index = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals(str)) {
				index = i;
				break;
			}
		}
		return index;
	}
}
