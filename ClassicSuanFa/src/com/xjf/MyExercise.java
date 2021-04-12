package com.xjf;

import java.util.HashSet;

import org.junit.Test;

public class MyExercise {

	
	
	@Test
	public void testQuickSort() {
		int[] array = {6,1,6,3,7,2,1,33,31};
		quickSort(array, 0, array.length-1);
		for (int i : array) {
			System.out.println(i);
		}
	}
	
	private void quickSort(int array[],int left,int right) {
		int index = getIndex(array, left, right);
		if(index>left+1) {
			quickSort(array, left, index-1);
		}
		if(index<right-1) {
			quickSort(array, index+1, right);
		}
	}
	
	private int getIndex(int array[],int left,int right) {
		int pivot = array[left];
		while(left<right) {
			while(right>left&&array[right]>=pivot) {
				right--;
			}
			array[left]=array[right];
			while(right>left&&array[left]<=pivot) {
				left++;
			}
			array[right]=array[left];
		}
		array[left]=pivot;
		return left;
	}
	
	public int[] intersection(int[] nums1, int[] nums2) {
		
		return null;
    }
	
}
