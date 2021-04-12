package com.xjf.algorithm.leetcode.suanfasixiang.sousuo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

//127. ���ʽ���
//�����������ʣ�beginWord �� endWord����һ���ֵ䣬�ҵ��� beginWord �� endWord �����ת�����еĳ��ȡ�ת������ѭ���¹���
//
//ÿ��ת��ֻ�ܸı�һ����ĸ��
//ת�������е��м䵥�ʱ������ֵ��еĵ��ʡ�
//˵��:
//
//���������������ת�����У����� 0��
//���е��ʾ�����ͬ�ĳ��ȡ�
//���е���ֻ��Сд��ĸ��ɡ�
//�ֵ��в������ظ��ĵ��ʡ�
//����Լ��� beginWord �� endWord �Ƿǿյģ��Ҷ��߲���ͬ��
//ʾ�� 1:
//
//����:
//beginWord = "hit",
//endWord = "cog",
//wordList = ["hot","dot","dog","lot","log","cog"]
//
//���: 5
//
//����: һ�����ת�������� "hit" -> "hot" -> "dot" -> "dog" -> "cog",
//     �������ĳ��� 5��
//ʾ�� 2:
//
//����:
//beginWord = "hit"
//endWord = "cog"
//wordList = ["hot","dot","dog","lot","log"]
//
//���: 0
//
//����: endWord "cog" �����ֵ��У������޷�����ת����

/**
 * TODO ̫����5%
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
	 * // β��ĸ���ֵ���Ž��� if (flag) { int[] mark = new int[wordList.size() + 1];
	 * Queue<String> queue = new LinkedList<>(); queue.add(beginWord); while
	 * (!queue.isEmpty()) { String poll = queue.poll(); // �ж�poll��λ�� int originIndex
	 * = getIndex(poll, wordList);
	 * 
	 * for (int i = 0; i < wordList.size(); i++) { if (judgeOneCharDiff(poll,
	 * wordList.get(i)) && mark[i + 1] == 0) {
	 * 
	 * mark[i + 1] = mark[originIndex+1] + 1; // �ж��Ƿ���Խ��� if (wordList.get(i)
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

		// β��ĸ���ֵ���Ž���
		if (map.get(endWord) != null) {
			int[] mark = new int[wordList.size() + 1];//ΪbeginWordԤ��λ��
			Queue<String> queue = new LinkedList<>();
			queue.add(beginWord);
			while (!queue.isEmpty()) {
				String poll = queue.poll();
				// �ж�poll��λ��
				int originIndex = map.get(poll);

				for (int i = 0; i < wordList.size(); i++) {
					if (judgeOneCharDiff(poll, wordList.get(i)) && mark[i + 1] == 0) {

						mark[i + 1] = mark[originIndex + 1] + 1;
						// �ж��Ƿ���Խ���
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
