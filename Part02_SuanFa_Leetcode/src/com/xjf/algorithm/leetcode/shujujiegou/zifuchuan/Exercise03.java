package com.xjf.algorithm.leetcode.shujujiegou.zifuchuan;
//3. 字符串中单词的翻转
//和剑指offer 58.1相同
/**
 *更换思路:先翻转每个单词,再翻转字符串
 * @author xjf
 *
 */
public class Exercise03 {

	public static void main(String[] args) {

	}
	public String ReverseSentence(String str) {
	    int n = str.length();
	    char[] chars = str.toCharArray();
	    int i = 0, j = 0;
	    //交换每个单词
	    while (j <= n) {
	        if (j == n || chars[j] == ' ') {
	            reverse(chars, i, j - 1);
	            i = j + 1;
	        }
	        j++;
	    }
	    //交换整个数组
	    reverse(chars, 0, n - 1);
	    return new String(chars);
	}
	/**
	 * 翻转字符串某个子区间内的字符
	 * @param c 整个字符串数组
	 * @param i 起始索引
	 * @param j 最终索引
	 */
	private void reverse(char[] c, int i, int j) {
	    while (i < j)
	        swap(c, i++, j--);
	}
	
	//交换字符串某两个元素的位置
	private void swap(char[] c, int i, int j) {
	    char t = c[i];
	    c[i] = c[j];
	    c[j] = t;
	}
	
}
