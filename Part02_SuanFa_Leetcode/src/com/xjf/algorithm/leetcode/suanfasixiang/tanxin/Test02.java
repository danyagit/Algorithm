package com.xjf.algorithm.leetcode.suanfasixiang.tanxin;

import java.util.Arrays;
import java.util.Comparator;

//无重叠区间
//给定一个区间的集合，找到需要移除区间的最小数量，使剩余区间互不重叠。
//注意:
//可以认为区间的终点总是大于它的起点。
//区间 [1,2] 和 [2,3] 的边界相互“接触”，但没有相互重叠。
//示例 1:
//输入: [ [1,2], [2,3], [3,4], [1,3] ]
//输出: 1
//解释: 移除 [1,3] 后，剩下的区间没有重叠。

public class Test02 {

	public static void main(String[] args) {
//		int[][] a = {{1,2},{2,3},{3,4},{1,3}};
		int[][] a = {{1,2},{1,2},{1,2}};
		Test02 test02 = new Test02();
		int cnt = test02.eraseOverlapIntervals(a);
		System.out.println(cnt);
	}

	public int eraseOverlapIntervals(int[][] intervals) {
		//按照x升序排列
		Arrays.sort(intervals,new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0]-o2[0];//1-2：升序
			}
		});
		int cnt=0;
		for (int i = 0; i < intervals.length-1; i++) {
			//不重合
			if(intervals[i+1][0]-intervals[i][1]>=0) {
				continue;
			}
			//重合，删除后一个的情况
			if(intervals[i+1][0]-intervals[i][1]<0&&intervals[i+1][1]-intervals[i][1]>=0) {
				intervals[i+1][0]=intervals[i][0];
				intervals[i+1][1]=intervals[i][1];
				cnt++;
				continue;
			}
			//重合，删除前一个（即不用赋值）的情况
			if(intervals[i+1][0]-intervals[i][1]<0&&intervals[i+1][1]-intervals[i][1]<0) {
				cnt++;
				continue;
			}
		}
		return cnt;
	}
}
