package com.leetcode;

public class Exercise670 {

	public static void main(String[] args) {
		Exercise670 exercise670 = new Exercise670();
		int maximumSwap = exercise670.maximumSwap(98368);
		System.out.println(maximumSwap);
	}
	//数字的范围很小，就两层for即可
	public int maximumSwap(int num) {
		String str = String.valueOf(num);
		char[] array = str.toCharArray();
		int max=1;
		int index=-1;
		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length; j++) {
				if(str.charAt(j)-str.charAt(i)>=max) {
					max=str.charAt(j)-str.charAt(i);
					index=j;
				}
			}
			if(index!=-1) {
				swap(array,index,i);
				return Integer.valueOf(new String(array));
			}
		}
		return num;
	}

	private void swap(char[] array, int i, int j) {
		char temp= array[i];
		array[i]=array[j];
		array[j]=temp;
	}
}
