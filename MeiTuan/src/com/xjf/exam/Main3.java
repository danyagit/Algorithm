package com.xjf.exam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main3 {

	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		int length = scanner.nextInt();
//		int width = scanner.nextInt();
		int length = 5;
		int width = 3;
		int[] array = { 1, 2, 2, 1, 3 };
//		for (int i = 0; i < length; i++) {
//			array[i] = scanner.nextInt();
//		}
		Map<Integer, Integer> map = new HashMap<>();
		for (int j = 0; j < array.length; j++) {
			int i = j;
			int w = width;
			// i=0Çé¿öÏÂ
			if (i == 0) {
				while (i < array.length && w > 0) {
					if (map.get(array[i]) != null) {
						map.put(array[i], map.get(array[i]) + 1);
					} else {
						map.put(array[i], 1);
					}
					w--;

					i++;
				}
				printMost(map);
			} else {
				if(j + w - 1<array.length) {
					map.put(array[j], map.get(array[j - 1]) - 1);
					if (map.get(array[j + w - 1]) != null) {
						map.put(array[j + w - 1], map.get(array[j + w - 1]) + 1);
					}else map.put(array[j + w - 1], 1);
					printMost(map);
				}
			}

		}

	}

	private static void printMost(Map<Integer, Integer> map) {
		List<Integer> list = new ArrayList<>();
		Set<Integer> keySet = map.keySet();
		int maxFre = 0;
		for (Integer i : keySet) {
			if (map.get(i) >= maxFre) {
				maxFre = map.get(i);
			}
		}
		for (Integer i : keySet) {
			if (map.get(i) == maxFre) {
				maxFre = map.get(i);
				list.add(i);
			}
		}
		Collections.sort(list);
		System.out.println(list.get(0));

	}


}
