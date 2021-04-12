package com.xjf.algorithm.leetcode.suanfasixiang.sousuo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import javafx.util.Pair;
/**
 * �ܽ�BFS����
 * ���������������Ϊ���ҳ�ͼ�����·��
 * ��Ҫ���裺
 * 1��queue�����һ���ڵ㣬���ڱ��������������ǣ������������飬0��ʾû���߹����������ֱ�ʾ�ߵĵڼ�����
 * 2����queue��Ϊ����Ϊѭ������ѭ��
 * 		����queue��Ԫ�أ�������Ԫ����Ϊ��Ԫ�أ�Ѱ����һ�����ܵ�Ԫ�أ�
 * ɸѡ�����ߵĽڵ㣨�ж������ܹؼ�������һ�����ܵ�Ԫ�ؿ����кܶ�������԰����ŵ�һ��ArrayList�С�
 * ͬʱ���������ǽ����ߵĽڵ���б�ǡ�
 * 3������ArrayList��ȡÿһ�����ߵĽڵ㣬���ߵĽڵ�������������սڵ㣬�ͷ�������Ӧ��������ֵ
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
		//������飬0��ʾû���߹����������ֱ�ʾ�ߵĵڼ���
		int[][] mark = new int[grid.length][grid[0].length];
		
		//�ѵ�һ���ڵ���뵽�����в����
		Pair<Integer, Integer> pair = new Pair<Integer, Integer>(0, 0);
		queue.add(pair);
		mark[0][0] = 1;
		
		while (!queue.isEmpty()) {
			Pair<Integer, Integer> poll = queue.poll();
			//�����ڵ����һ���ڵ㣨���ߵ�0�ڵ㡢���ұ�����֮ǰû���߹���mark��Ӧ��0�ڵ㡢��Ҫ���ǲ���Խ�磩������list
			//ͬʱҲ��ɶ���Щ�ڵ�ı�ǣ����ڵ���Ԫ�صı��+1��
			ArrayList<Pair<Integer,Integer>> list = getPairs(dir, grid, poll,mark);
			//����list
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
		//���ڵ�����
		int preRowth = pair.getKey();
		int preColth = pair.getValue();
		
		for (int i = 0; i < dir.length; i++) {
			int rowth = dir[i][0] + pair.getKey();
			int colth = dir[i][1] + pair.getValue();
			//rowth < grid.length && colth < grid[0].length&&rowth>=0&&colth>=0��Խ��
			//grid[rowth][colth]==0�����ߵ�
			//mark[rowth][colth]==0��֮ǰû�߹���
			if (rowth < grid.length && colth < grid[0].length&&rowth>=0&&colth>=0&&grid[rowth][colth]==0&&mark[rowth][colth]==0) {//��ֹԽ��
				Pair<Integer, Integer> newPair = new Pair<>(rowth, colth);
				list.add(newPair);
				mark[rowth][colth]=mark[preRowth][preColth]+1;
			}
			
		}
		return list;
	}
}
