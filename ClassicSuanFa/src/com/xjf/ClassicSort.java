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

	// ð������
	public void bubbleSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - 1 - i; j++) {
				if (array[j] > array[j + 1]) {
					swap(array, j, j + 1);// �ȽϽ�������������Ԫ�ض��ƶ���ĩβ
				}
			}
		}
	}

	// ѡ������,ÿ���ҵ�ʣ��Ԫ�ص���СԪ�أ��ŵ�ǰ��
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

	// ��������ÿ���õ�ǰԪ����֮ǰ�ıȽϣ�С������ǰ���
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

	// ϣ�����򣬾��Ǳ���ͨ�Ĳ���������˸������������𽥼�С
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

	// �������ݹ飬�ϲ��������ݹ�
	// �鲢���򣺼�ס�ݹ鷽�����̣�������룬�ֱ�������Ӵ���������Ȼ��ϲ�
	public int[] MergeSort(int array[]) {
		if (array.length <= 1) {
			return array;
		}
		int len = array.length;
		// �������
		int[] sortedLeft = MergeSort(Arrays.copyOfRange(array, 0, len / 2));
		// �ұ�����
		int[] sortedRight = MergeSort(Arrays.copyOfRange(array, len / 2, len));
		// �ϲ�����
		return merge(sortedLeft, sortedRight);
	}

	// �ϲ������Ѿ��ź��������
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

	// �������ݹ飬getIndex�������ݹ�
	// �������򣺼�ס�ݹ����̣�getIndex������ߡ����ұ�
	// �ص�����getIndex��������Ҫ��startԪ�ع�λ��������index
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

	// ��ס�㷨���̣�����������ָ�롣
	// �����˵��ֵ-->���������ҵ�һ����pivotС�ģ���ָ��ͣ����������ָ��-->���������ҵ�һ����pivot���Ԫ�أ���ָ��ͣ����������ָ��
	// ����Ĳ�����while����
	public int getIndex(int[] array, int start, int end) {
		// ��׼ֵ
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

	// �ǵݹ�ʵ�ֿ���,��ջ���������Ҷ˵㣨���ݹ��е���������������
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
		// �����󶥶ѣ�������ʵ���ǰѴ��������У����һ���󶥶ѽṹ������
		buildMaxHeap(arr, len);

		// �����Ѷ��͵�ǰĩβ�Ľڵ㣬���ô󶥶�
		for (int i = len - 1; i > 0; i--) {
			swap(arr, 0, i);
			len--;
			heapify(arr, 0, len);
		}
	}

	private void buildMaxHeap(int[] arr, int len) {
		// �����һ����Ҷ�ڵ㿪ʼ��ǰ�����������ڵ����ʣ�ʹ֮��Ϊ�󶥶�
		for (int i = (int) Math.floor(len / 2) - 1; i >= 0; i--) {
			heapify(arr, i, len);
		}
	}

	private void heapify(int[] arr, int i, int len) {
		// �ȸ��ݶ����ʣ��ҳ������ҽڵ������
		int left = 2 * i + 1;
		int right = 2 * i + 2;
		// Ĭ�ϵ�ǰ�ڵ㣨���ڵ㣩�����ֵ��
		int largestIndex = i;
		if (left < len && arr[left] > arr[largestIndex]) {
			// �������ڵ㣬������ڵ��ֵ���󣬸������ֵ������
			largestIndex = left;
		}
		if (right < len && arr[right] > arr[largestIndex]) {
			// ������ҽڵ㣬�����ҽڵ��ֵ���󣬸������ֵ������
			largestIndex = right;
		}

		if (largestIndex != i) {
			// ������ֵ���ǵ�ǰ��Ҷ�ӽڵ��ֵ����ô�Ͱѵ�ǰ�ڵ�����ֵ���ӽڵ�ֵ����
			swap(arr, i, largestIndex);
			// ��Ϊ����֮���ӽڵ��ֵ���ˣ�������ӽڵ�Ҳ���Լ����ӽڵ㣬����Ҫ�ٴε�����
			heapify(arr, largestIndex, len);
		}
	}

	public void swap(int[] array, int i, int j) {
		int a = array[i];
		array[i] = array[j];
		array[j] = a;
	}

	// ���ϵ����򷽷����ǻ��ڱȽϵ��������¶���Ͱ�����˼�룬�ռ任ʱ�䣬û�бȽ�

	// ���������½�һ�����飬�±��ʾ������Ԫ�أ�Ԫ�ش���Ƶ��
	// �������������ǳ��󣬵����ݷ�Χ�����ر������

	// ��������Ͱ˼���һ�֣����ո�λ��ʮλ����λ�����ֱ�����
	// �ȰѸ�λ��ͬ�ķ���һ��Ͱ���桢��һ���ٰ�ʮλ��ͬ�ķ���һ��Ͱ����....����n�ξ������
	// ʵ�ֵ�Ч�����ǣ���������������������λ��ͬ�˰���λ��

	// Ͱ����������������Ӿ��Ǽ�������ͻ�������

}
