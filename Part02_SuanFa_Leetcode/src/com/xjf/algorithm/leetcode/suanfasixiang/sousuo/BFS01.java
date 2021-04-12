package com.xjf.algorithm.leetcode.suanfasixiang.sousuo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import javafx.util.Pair;
/**
 * 总结BFS方法
 * 广度优先搜索就是为了找出图的最短路径
 * 主要步骤：
 * 1、queue加入第一个节点，并在标记数组中作出标记（我这里标记数组，0表示没有走过，其他数字表示走的第几步）
 * 2、以queue不为空作为循环条件循环
 * 		弹出queue的元素，并将此元素作为父元素，寻找下一个可能的元素，
 * 筛选出能走的节点（判断条件很关键）。下一个可能的元素可能有很多个，可以把它放到一个ArrayList中。
 * 同时，不能忘记将能走的节点进行标记。
 * 3、遍历ArrayList获取每一个能走的节点，能走的节点里面如果有最终节点，就返回它对应标记数组的值
 *
 * @author xjf
 *
 */

public class BFS01 {
	
	public static void main(String[] args) {
		int [][]grid= {{0,0,0},{1,1,0},{1,1,0}};
		BFS01 bfs01 = new BFS01();
		int path = bfs01.shortestPathBinaryMatrix(grid);
		System.out.println(path);
	}
	public int shortestPathBinaryMatrix(int[][] grid) {
		if(grid==null||grid.length==0||grid[0][0]!=0) {
			return -1;
		}
		if(grid.length==1&&grid[0].length==1&&grid[0][0]==0) {
			return 1;
		}
		int[][] dir = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 }, { 1, 1 }, { 1, -1 }, { -1, 1 }, { -1, -1 } };
		Queue<Pair<Integer, Integer>> queue = new LinkedList<>();
		//标记数组，0表示没有走过，其他数字表示走的第几步
		int[][] mark = new int[grid.length][grid[0].length];
		
		//把第一个节点加入到队列中并标记
		Pair<Integer, Integer> pair = new Pair<Integer, Integer>(0, 0);
		queue.add(pair);
		mark[0][0] = 1;
		
		while (!queue.isEmpty()) {
			Pair<Integer, Integer> poll = queue.poll();
			//弹出节点的下一个节点（能走的0节点、而且必须是之前没有走过的mark对应的0节点、还要考虑不能越界），放入list
			//同时也完成对这些节点的标记（等于弹出元素的标记+1）
			ArrayList<Pair<Integer,Integer>> list = getPairs(dir, grid, poll,mark);
			//遍历list
			for (Pair<Integer, Integer> pair2 : list) {
				if(pair2.getKey()==grid.length-1&&pair2.getValue()==grid[0].length-1) {
					return mark[grid.length-1][grid[0].length-1];
				}
				queue.add(pair2);
			}
		}
		return -1;
	}
	
	//
	public ArrayList<Pair<Integer, Integer>> getPairs(int[][] dir, int[][] grid, Pair<Integer, Integer> pair,int[][] mark) {
		ArrayList<Pair<Integer, Integer>> list = new ArrayList<>();
		//父节点坐标
		int preRowth = pair.getKey();
		int preColth = pair.getValue();
		
		for (int i = 0; i < dir.length; i++) {
			int rowth = dir[i][0] + pair.getKey();
			int colth = dir[i][1] + pair.getValue();
			//rowth < grid.length && colth < grid[0].length&&rowth>=0&&colth>=0防越界
			//grid[rowth][colth]==0：能走的
			//mark[rowth][colth]==0：之前没走过的
			if (rowth < grid.length && colth < grid[0].length&&rowth>=0&&colth>=0&&grid[rowth][colth]==0&&mark[rowth][colth]==0) {//防止越界
				Pair<Integer, Integer> newPair = new Pair<>(rowth, colth);
				list.add(newPair);
				mark[rowth][colth]=mark[preRowth][preColth]+1;
			}
			
		}
		return list;
	}
}
