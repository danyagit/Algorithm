package com.xjf.algorithm.JianZhiOffer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

//最小的K个数
//输入n个整数，找出其中最小的K个数。
//例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4。

/**
 * 这里我采用的是Arrays.sort方法，时间复杂度太高了。 TODO 降低时间复杂度需要采用队列的数据结构，记得探究
 * 
 * @author xjf
 */
public class Test40 {

	public static void main(String[] args) {

	}
	//方法二：
	public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
		if (k > input.length) {
			return new ArrayList<Integer>();
		}
		int i = 0;
		int j = input.length - 1;
		while (i < j) {
			int index = getIndex(input, i, j);
			if (index < k - 1) {
				i = index + 1;
			} else if (index > k - 1) {
				j = index - 1;
			} else {
				break;//此时并没有完成排序，只是将第k小的元素放在了该放的位置，那么他左边就是符合条件
			}
		}
		ArrayList<Integer> list = new ArrayList<>();
		for (int m = 0; m < k; m++) {
			list.add(input[m]);
		}
		return list;
	}

	private static int getIndex(int[] arr, int low, int high) {
		// 以左端点作为基准数据
		int tmp = arr[low];
		while (low < high) {
			// 当队尾的元素大于等于基准数据时,向前挪动high指针
			while (low < high && arr[high] >= tmp) {
				high--;
			}
			// 如果队尾元素小于tmp了,需要将其赋值给low
			arr[low] = arr[high];
			// 当队首元素小于等于tmp时,向前挪动low指针
			while (low < high && arr[low] <= tmp) {
				low++;
			}
			// 当队首元素大于tmp时,需要将其赋值给high
			arr[high] = arr[low];
		}
		// 跳出循环时low和high相等,此时的low或high就是tmp的正确索引位置
		// 由原理部分可以很清楚的知道low位置的值并不是tmp,所以需要将tmp赋值给arr[low]
		arr[low] = tmp;
		return low; // 返回tmp的正确位置
	}

	// 方法一：
//	public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
//		if(input.length<k) {
//			return new ArrayList<Integer>();
//		}
//		//方法一：定义大顶堆（栈顶元素最大，降序排列）
//		PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				return o2-o1;
//			}
//		});
//		for (int val : input) {
//			queue.add(val);
//			if(queue.size()>k) {
//				queue.poll();
//			}
//		}
//		return new ArrayList<>(queue);
//	}

//	public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
//		ArrayList<Integer> list = new ArrayList<>();
//		if (k == 0) {
//			return list;
//		}
//		if(input==null||input.length==0) {
//			return null;
//		}
//		if(k>input.length) {
//			return list;
//		}
//		Arrays.sort(input);
//		for(int i =0;i<k;i++) {
//			list.add(input[i]);
//		}
//		return list;
//	}
}
