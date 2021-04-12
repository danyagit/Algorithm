package com.xjf.algorithm.leetcode.suanfasixiang.tanxin;

import static org.hamcrest.CoreMatchers.containsString;

import java.util.Arrays;
import java.util.Comparator;

//用最少数量的箭引爆气球,跟上题非常相似

//在二维空间中有许多球形的气球。对于每个气球，提供的输入是水平方向上，
//气球直径的开始和结束坐标。由于它是水平的，所以纵坐标并不重要，
//因此只要知道开始和结束的横坐标就足够了。开始坐标总是小于结束坐标。
//一支弓箭可以沿着 x 轴从不同点完全垂直地射出。在坐标 x 处射出一支箭，
//若有一个气球的直径的开始和结束坐标为 xstart，xend，
//且满足  xstart ≤ x ≤ xend，则该气球会被引爆。
//可以射出的弓箭的数量没有限制。 弓箭一旦被射出之后，可以无限地前进。
//我们想找到使得所有气球全部被引爆，所需的弓箭的最小数量。

//给你一个数组 points ，其中 points [i] = [xstart,xend] ，
//返回引爆所有气球所必须射出的最小弓箭数。
//示例 1：
//输入：points = [[10,16],[2,8],[1,6],[7,12]]
//输出：2
//解释：对于该样例，x = 6 可以射爆 [2,8],[1,6] 两个气球，以及 x = 11 射爆另外两个气球

public class Test03 {

	public static void main(String[] args) {
		int[][] a = {{10,16},{2,8},{1,6},{7,12}};
		Test03 test03 = new Test03();
		int cnt = test03.findMinArrowShots(a);
		System.out.println(cnt);
	}

	public int findMinArrowShots(int[][] points) {
		// 按照x升序排列
		Arrays.sort(points, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0] - o2[0];// 1-2：升序
			}
		});
		if(points==null||points.length==0) {
			return 0;
		}
		int cnt = 1;
		for (int i = 0; i < points.length - 1; i++) {
			// 不重合
			if (points[i + 1][0] - points[i][1] > 0) {
				cnt++;
				continue;
			}
			if (points[i + 1][0] - points[i][1] <= 0 && points[i + 1][1] - points[i][1] >= 0) {
				points[i + 1][1] = points[i][1];
				continue;
			}
			if (points[i + 1][0] - points[i][1] <= 0 && points[i + 1][1] - points[i][1] <= 0) {
				continue;
			}
		}
		return cnt;
	}
}
