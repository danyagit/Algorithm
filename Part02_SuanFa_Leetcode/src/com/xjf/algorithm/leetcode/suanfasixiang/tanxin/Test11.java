package com.xjf.algorithm.leetcode.suanfasixiang.tanxin;
//划分字母区间

import java.util.ArrayList;
import java.util.List;

//字符串 S 由小写字母组成。我们要把这个字符串划分为尽可能多的片段，同一字母最多出现在一个片段中。返回一个表示每个字符串片段的长度的列表。
//示例：
//输入：S = "ababcbacadefegdehijhklij"
//输出：[9,7,8]
//解释：
//划分结果为 "ababcbaca", "defegde", "hijhklij"。
//每个字母最多出现在一个片段中。
//像 "ababcbacadefegde", "hijhklij" 的划分是错误的，因为划分的片段数较少。

/**
 * 
 * @author xjf
 *
 */

public class Test11 {

	public static void main(String[] args) {
		Test11 test11 = new Test11();
		List<Integer> list = test11.partitionLabels("ababcbacadefegdehijhklij");
		System.out.println(list);
	}

	
	public List<Integer> partitionLabels(String S) {
		char[]array = S.toCharArray();
		List<Integer> list = new ArrayList<Integer>();
		int leftIndex=0;
		while(leftIndex<array.length) {
			int curmax=getLastCharIndex(array[leftIndex], array);
			int index=leftIndex;
			while(index<curmax) {
				index++;
				if(getLastCharIndex(array[index], array)>curmax) {
					curmax=getLastCharIndex(array[index], array);//改变循环边界
				}
			}
			list.add(curmax-leftIndex+1);
			leftIndex=curmax+1;
		}
		return list;
	}
	
	//最后一个字母的索引
	public int getLastCharIndex(char a,char[]array) {
		for (int i = array.length-1; i >=0; i--) {
			if(array[i]==a) {
				return i;
			}
		}
		return -1;
	}
	
}
