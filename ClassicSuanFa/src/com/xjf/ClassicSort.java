package com.xjf;

import java.util.Arrays;
import java.util.Stack;

import org.junit.Test;

public class ClassicSort {
	int[] array = { 3, 5, 1, 2, 7, 22, 2, 345, 123 };

	@Test
	public void myTest() {
//		bubbleSort(array);
//		selectionSort(array);
//		insertionSort(array);
//		ShellSort(array);
//		int[] array1 = MergeSort(array);
//		int[] quickSort = QuickSort(array, 0, array.length-1);
		heapSort(array);
		for (int i : array) {
			System.out.print(i + ",");
		}
	}

	// 冒泡排序
	public void bubbleSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - 1 - i; j++) {
				if (array[j] > array[j + 1]) {
					swap(array, j, j + 1);// 比较交换，最终最大的元素都移动到末尾
				}
			}
		}
	}

	// 选择排序,每次找到剩下元素的最小元素，放到前面
	public void selectionSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int curIndex = i;
			for (int j = i; j < array.length; j++) {
				if (array[j] < array[curIndex]) {
					curIndex = j;
				}
			}
			swap(array, i, curIndex);
		}
	}

	// 插入排序，每次拿当前元素与之前的比较，小，则往前插队
	public void insertionSort(int[] array) {
		int preIndex;
		int cur;
		for (int i = 1; i < array.length; i++) {
			cur = array[i];
			preIndex = i - 1;
			while (preIndex >= 0 && cur < array[preIndex]) {
				array[preIndex + 1] = array[preIndex];
				preIndex--;
			}
			array[preIndex + 1] = cur;
		}
	}

	// 希尔排序，就是比普通的插入排序多了个增量，增量逐渐减小
	public void ShellSort(int array[]) {
		int gap = array.length / 2;
		while (gap > 0) {
			int preIndex;
			int cur;
			for (int i = 1; i < array.length; i = i + gap) {
				cur = array[i];
				preIndex = i - gap;
				while (preIndex >= 0 && cur < array[preIndex]) {
					array[preIndex + gap] = array[preIndex];
					preIndex = preIndex - gap;
				}
				array[preIndex + gap] = cur;
			}
			gap = gap / 2;
		}

	}

	// 主方法递归，合并方法不递归
	// 归并排序：记住递归方法流程：拆成两半，分别对左右子串进行排序，然后合并
	public int[] MergeSort(int array[]) {
		if (array.length <= 1) {
			return array;
		}
		int len = array.length;
		// 左边排序
		int[] sortedLeft = MergeSort(Arrays.copyOfRange(array, 0, len / 2));
		// 右边排序
		int[] sortedRight = MergeSort(Arrays.copyOfRange(array, len / 2, len));
		// 合并两边
		return merge(sortedLeft, sortedRight);
	}

	// 合并两个已经排好序的数组
	private int[] merge(int[] sortedLeft, int[] sortedRight) {
		int[] result = new int[sortedLeft.length + sortedRight.length];
		int i = 0, j = 0, k = 0;
		while (i < sortedLeft.length && j < sortedRight.length) {
			if (sortedLeft[i] <= sortedRight[j]) {
				result[k] = sortedLeft[i];
				i++;
				k++;
			} else {
				result[k] = sortedRight[j];
				j++;
				k++;
			}
		}
		while (i < sortedLeft.length) {
			result[k] = sortedLeft[i];
			i++;
			k++;
		}
		while (j < sortedRight.length) {
			result[k] = sortedRight[j];
			j++;
			k++;
		}
		return result;
	}

	// 主函数递归，getIndex方法不递归
	// 快速排序：记住递归流程：getIndex、排左边、排右边
	// 重点在于getIndex函数，需要将start元素归位并返回其index
	public int[] QuickSort(int[] array, int start, int end) {
		if (array.length < 1 || start < 0 || end >= array.length || start > end)
			return null;
		int smallIndex = getIndex(array, start, end);
		if (smallIndex > start)
			QuickSort(array, start, smallIndex - 1);
		if (smallIndex < end)
			QuickSort(array, smallIndex + 1, end);
		return array;
	}

	// 记住算法过程：有左右两个指针。
	// 标记左端点的值-->从右向左找到一个比pivot小的（右指针停），赋予左指针-->从左向右找到一个比pivot大的元素（左指针停），赋予右指针
	// 上面的操作在while里面
	public int getIndex(int[] array, int start, int end) {
		// 基准值
		int pivot = array[start];
		while (start < end) {
			while (end > start && array[end] >= pivot) {
				end--;
			}
			array[start] = array[end];
			while (end > start && array[start] <= pivot) {
				start++;
			}
			array[end] = array[start];
		}
		array[start] = pivot;
		return start;
	}

	// 非递归实现快排,用栈来保存左右端点（即递归中的另外两个参数）
	private void QuickSort02(int[] nums) {
		int left = 0;
		int right = nums.length - 1;
		Stack<Integer> stack = new Stack<>();
		stack.push(right);
		stack.push(left);
		while (!stack.isEmpty()) {
			left = stack.pop();
			right = stack.pop();
			int index = getIndex(nums, left, right);
			if (index - 1 > left) {
				stack.push(index - 1);
				stack.push(left);
			}
			if (right > index + 1) {
				stack.push(right);
				stack.push(index + 1);
			}
		}
	}

	public void heapSort(int[] arr) {
		if (arr == null || arr.length == 0) {
			return;
		}
		int len = arr.length;
		// 构建大顶堆，这里其实就是把待排序序列，变成一个大顶堆结构的数组
		buildMaxHeap(arr, len);

		// 交换堆顶和当前末尾的节点，重置大顶堆
		for (int i = len - 1; i > 0; i--) {
			swap(arr, 0, i);
			len--;
			heapify(arr, 0, len);
		}
	}

	private void buildMaxHeap(int[] arr, int len) {
		// 从最后一个非叶节点开始向前遍历，调整节点性质，使之成为大顶堆
		for (int i = (int) Math.floor(len / 2) - 1; i >= 0; i--) {
			heapify(arr, i, len);
		}
	}

	private void heapify(int[] arr, int i, int len) {
		// 先根据堆性质，找出它左右节点的索引
		int left = 2 * i + 1;
		int right = 2 * i + 2;
		// 默认当前节点（父节点）是最大值。
		int largestIndex = i;
		if (left < len && arr[left] > arr[largestIndex]) {
			// 如果有左节点，并且左节点的值更大，更新最大值的索引
			largestIndex = left;
		}
		if (right < len && arr[right] > arr[largestIndex]) {
			// 如果有右节点，并且右节点的值更大，更新最大值的索引
			largestIndex = right;
		}

		if (largestIndex != i) {
			// 如果最大值不是当前非叶子节点的值，那么就把当前节点和最大值的子节点值互换
			swap(arr, i, largestIndex);
			// 因为互换之后，子节点的值变了，如果该子节点也有自己的子节点，仍需要再次调整。
			heapify(arr, largestIndex, len);
		}
	}

	public void swap(int[] array, int i, int j) {
		int a = array[i];
		array[i] = array[j];
		array[j] = a;
	}

	// 以上的排序方法都是基于比较的排序，以下都是桶排序的思想，空间换时间，没有比较

	// 计数排序：新建一个数组，下标表示待排序元素，元素代表频率
	// 适用于数据量非常大，但数据范围不是特别大的情况

	// 基数排序：桶思想的一种，按照个位、十位、百位、、分别排序
	// 先把个位相同的放在一个桶里面、下一轮再把十位相同的放在一个桶里面....经过n次就完成了
	// 实现的效果就是：就像联合索引那样，高位相同了按低位排

	// 桶排序：两个特殊的例子就是计数排序和基数排序

}
