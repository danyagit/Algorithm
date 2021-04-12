package com.xjf.suanfa;

import java.util.ArrayList;
import java.util.List;

public class Tanxin {

	public static void main(String[] args) {
		Tanxin tanxin = new Tanxin();
		String S = "caedbdedda";
		List<Integer> partitionLabels = tanxin.partitionLabels(S);
		System.out.println(partitionLabels);
	}

	public List<Integer> partitionLabels(String S) {
		char[] array = S.toCharArray();
		int start=0;
		List<Integer> list = new ArrayList<>();
		while(start<array.length) {
			int first = start;
			int lastIndex = getLastIndex(array[start], array);
			while(start<lastIndex) {
				if(getLastIndex(array[start], array)>lastIndex) {
					lastIndex=getLastIndex(array[start], array);
				}
				start++;
			}
			start++;
			list.add(lastIndex-first+1);
		}
		return list;
	}
	
	public int getLastIndex(char a,char [] array){
		for (int i = array.length-1; i >=0 ; i--) {
			if(array[i]==a) {
				return i;
			}
		}
		return -1;
	}
}
