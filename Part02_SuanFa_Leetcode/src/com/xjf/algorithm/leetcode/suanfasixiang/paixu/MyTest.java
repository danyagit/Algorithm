package com.xjf.algorithm.leetcode.suanfasixiang.paixu;

import java.util.PriorityQueue;

import org.junit.Test;

public class MyTest {

	@Test
	public void testPriorityQueue() {
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		queue.add(5);
		queue.add(2);
		queue.add(6);
		System.out.println(queue.poll());
		System.out.println(queue.peek());
	}

	@Test
	public void testPartition() {
		int[]array = {3,2,1,5,2,6,1,4};
		int i = partition(array, 0, 7);
		for (int j : array) {
			System.out.println(j);
		}
		System.out.println(i);
	}
	
	public int partition(int[] array, int left, int right) {
		int myLeft = left + 1;
		while (myLeft < right) {
			if (array[myLeft] <= array[left]) {
				myLeft++;
			}
			if (array[right] >= array[left]) {
				right--;
			}
			//注意这儿还要判断！！
			if(myLeft >= right) {
				break;
			}
			if (array[myLeft] > array[left] && array[right] < array[left]) {
				swap(array, myLeft, right);
				myLeft++;
				right--;
			}
		}
		swap(array, left, right);
		return right;
	}

	private void swap(int[] array, int i, int j) {
		int third = array[i];
		array[i] = array[j];
		array[j] = third;
	}

}
