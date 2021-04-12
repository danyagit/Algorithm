package com.xjf.algorithm.leetcode.shujujiegou.zhanheduilie;
//数组中元素与下一个比它大的元素之间的距离, 数组中元素与下一个比它大的元素之间的距离
/**
 * 此处首先想到的是双指针解法,没有用栈
 * @author xjf
 *
 */
public class Exercise05 {

	public static void main(String[] args) {

	}
	public int[] dailyTemperatures(int[] T) {
		int next=0;
		int [] array = new int[T.length];
		for (int cur = 0; cur < T.length; cur++) {
			next=cur+1;
			while(next<T.length) {
				if(T[next]>T[cur]) {
					array[cur]=next-cur;
					break;
				}
				next++;
			}
			if(next==T.length) {
				array[cur]=0;
			}
		}
		
		return array;
    }
}
