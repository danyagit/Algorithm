package com.bishi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Exercise815 {

	public static void main(String[] args) {
		Exercise815 exercise815 = new Exercise815();
		int routes[][] = { {2}, { 2, 8 } };
		int busesToDestination = exercise815.numBusesToDestination(routes, 8, 2);
		System.out.println(busesToDestination);
	}

	Map<int[], Integer> map;

	public int numBusesToDestination(int[][] routes, int S, int T) {
		if(S==T) {
			return 0;
		}
		Queue<int[]> queue = new LinkedList<>();
		Map<int[], Integer> map = new HashMap<>();
		this.map = map;
		int length = routes.length;
		int[] mark = new int[length];
		
		// 找到出发点所在的bus有哪些
		for (int i = 0; i < length; i++) {
			if (hasPosition(routes[i], S)) {
				queue.add(routes[i]);
				mark[i] = 1;// 1代表走过
			}
			map.put(routes[i], i);//每个bus给它一个标记
		}

		while (!queue.isEmpty()) {
			int[] poll = queue.poll();
			if (hasPosition(poll, T)) {
				return mark[map.get(poll)];
			}
			List<int[]> nexts = getNextPossible(poll, mark, routes);
			for (int i = 0; i < nexts.size(); i++) {
				queue.add(nexts.get(i));
				
			}

		}
		return -1;
	}

	private List<int[]> getNextPossible(int[] poll, int[] mark, int[][] routes) {
		List<int[]> list = new ArrayList<>();
		for (int i = 0; i < routes.length; i++) {
			if (mark[i] == 0 && hasCommonPosition(poll, routes[i])) {
				list.add(routes[i]);
				mark[i] = mark[map.get(poll)] + 1;
			}
		}

		return list;
	}

	public boolean hasPosition(int[] bus, int positon) {
		for (int i = 0; i < bus.length; i++) {
			if (bus[i] == positon) {
				return true;
			}
		}
		return false;
	}

	public boolean hasCommonPosition(int[] bus1, int[] bus2) {
		int i = 0, j = 0;
		Arrays.sort(bus1);
		Arrays.sort(bus2);
		while (i < bus1.length && j < bus2.length) {
			if (bus1[i] == bus2[j]) {
				return true;
			} else if (bus1[i] > bus2[j]) {
				j++;
			} else {
				i++;
			}
		}
		return false;
	}

}
