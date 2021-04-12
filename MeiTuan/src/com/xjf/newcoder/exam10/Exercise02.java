package com.xjf.newcoder.exam10;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int length = scanner.nextInt();
		int[]array = new int[length];
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		System.out.println(timesOfOperation(length,array));
		
	}
	
	
	public static int timesOfOperation(int length,int[] array) {
		int cnt = 0;
		Arrays.sort(array);
		for (int i = 0; i < array.length; i++) {
			if(array[i]>i+1) {
				cnt=cnt+array[i]-(i+1);
			}else if(array[i]<i+1) {
				cnt=cnt-array[i]+(i+1);
			}
		}
		return cnt;
	}
	

}
