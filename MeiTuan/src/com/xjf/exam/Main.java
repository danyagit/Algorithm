package com.xjf.exam;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();		
		int m = scanner.nextInt();
		int[][] source = new int[n][m];
		for (int i = 0; i < n; i++) {
			for(int j =0;j<m;j++) {
				source[i][j] = scanner.nextInt();
				System.out.println(source[i][j]);
			}
		}*/
		int[][] source = {{1,2},{3,4},{5,6}};
		int n=3;
		int m=2;
		int[][] target = new int[m][n] ;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				target[i][j] = source[j][i];
			}
		}
		
		for (int i = 0; i < target.length; i++) {
			for (int j = 0; j < target[0].length; j++) {
				System.out.print(target[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
