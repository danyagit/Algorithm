package com.xjf.exam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		String str = scanner.nextLine();
		String str = "He15l154lo87wor7l87d";
		ArrayList<ArrayList<Character>> list =  getNums(str);
		ArrayList<Integer> result = new ArrayList<>();
		for (ArrayList<Character> arrayList : list) {
			StringBuffer str1 = removeZero(arrayList);
			result.add(Integer.valueOf(str1.toString()));
		}
		Collections.sort(result);
		for (Integer integer : result) {
			System.out.println(integer);
		}
		
	}

	private static StringBuffer removeZero(ArrayList<Character> list) {
		int i =0;
		while(i<list.size()-1) {
			if(i<list.size()-1&&list.get(i)=='0') {
				i++;
			}
			else break;
		}
		StringBuffer sb = new StringBuffer();
		for (int j = i; j < list.size(); j++) {
			sb.append(list.get(j));
		}
		return sb;
	}

	private static ArrayList<ArrayList<Character>> getNums(String str) {
		ArrayList<ArrayList<Character>> res = new ArrayList<>();
		char[] array = str.toCharArray();
		for (int i = 0; i < array.length; i++) {
			if(i < array.length&&array[i]>='0'&&array[i]<='9') {
				ArrayList<Character> list = new ArrayList<>();
				while(i < array.length&&array[i]>='0'&&array[i]<='9') {
					list.add(array[i]);
					i++;
				}
				i--;
				res.add(list);
			}
		}
		return res;
	}

}
