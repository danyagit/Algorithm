package com.xjf.algorithm.leetcode.suanfasixiang.tanxin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//根据身高重建队列。TODO 这题好难，脑筋急转弯

//假设有打乱顺序的一群人站成一个队列。 每个人由一个整数对 (h, k) 表示，
//其中 h 是这个人的身高，k 是应该排在这个人前面且身高大于或等于 h 的人数。 
//例如：[5,2] 表示前面应该有 2 个身高大于等于 5 的人，
//而 [5,0] 表示前面不应该存在身高大于等于 5 的人。
//
//编写一个算法，根据每个人的身高 h 重建这个队列，
//使之满足每个整数对 (h, k) 中对人数 k 的要求。
//
//示例：
//输入：[[7,0], [4,4], [7,1], [5,0], [6,1], [5,2]]
//输出：[[5,0], [7,0], [5,2], [6,1], [4,4], [7,1]]
//提示：
//总人数少于 1100 人。

public class Test04 {

	public static void main(String[] args) {
		Test04 test04 = new Test04();
		int[][] people = {{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}};
		test04.reconstructQueue(people);
	}

	public int[][] reconstructQueue(int[][] people) {
	    if (people == null || people.length == 0 || people[0].length == 0) {
	        return new int[0][0];
	    }
	    //排序，按身高降序，k升序
	    Arrays.sort(people, (a, b) -> (a[0] == b[0] ? a[1] - b[1] : b[0] - a[0]));
	    List<int[]> queue = new ArrayList<>();
	    for (int[] p : people) {
	        queue.add(p[1], p);
	    }
	    return queue.toArray(new int[queue.size()][]);
	}
}
