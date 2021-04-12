package com.xjf.netease;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int length = Integer.valueOf(scanner.nextLine());
		scanner.nextLine();
		int[] array = new int[length];
		scanner.nextLine();
		String nextLine = scanner.nextLine();
		String [] strs = nextLine.split(" ");
		for (int i = 0; i < length; i++) {
			array[i] = Integer.valueOf(strs[i]);
		}
		System.out.println(getSub(array));
	}

	private static int getSub(int[] array) {

		int l = 1, h = 1;
		int cnt1 = 0;
		int cnt2 = 0;
		for (int i = 1; i < array.length; i++) {
			//µÝÔö
			if (array[i] > array[i - 1]) {
				l = h + 1;
				cnt1++;
				//µÝ¼õ
			} else if (array[i] < array[i - 1]) {
				h = l + 1;
				cnt2++;
			}
			
		}
		return Math.max(l, h);
	}

}
