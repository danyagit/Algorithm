package com.xjf.algorithm.JianZhiOffer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

//��С��K����
//����n���������ҳ�������С��K������
//��������4,5,1,6,2,7,3,8��8�����֣�����С��4��������1,2,3,4��

/**
 * �����Ҳ��õ���Arrays.sort������ʱ�临�Ӷ�̫���ˡ� TODO ����ʱ�临�Ӷ���Ҫ���ö��е����ݽṹ���ǵ�̽��
 * 
 * @author xjf
 */
public class Test40 {

	public static void main(String[] args) {

	}
	//��������
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
				break;//��ʱ��û���������ֻ�ǽ���kС��Ԫ�ط����˸÷ŵ�λ�ã���ô����߾��Ƿ�������
			}
		}
		ArrayList<Integer> list = new ArrayList<>();
		for (int m = 0; m < k; m++) {
			list.add(input[m]);
		}
		return list;
	}

	private static int getIndex(int[] arr, int low, int high) {
		// ����˵���Ϊ��׼����
		int tmp = arr[low];
		while (low < high) {
			// ����β��Ԫ�ش��ڵ��ڻ�׼����ʱ,��ǰŲ��highָ��
			while (low < high && arr[high] >= tmp) {
				high--;
			}
			// �����βԪ��С��tmp��,��Ҫ���丳ֵ��low
			arr[low] = arr[high];
			// ������Ԫ��С�ڵ���tmpʱ,��ǰŲ��lowָ��
			while (low < high && arr[low] <= tmp) {
				low++;
			}
			// ������Ԫ�ش���tmpʱ,��Ҫ���丳ֵ��high
			arr[high] = arr[low];
		}
		// ����ѭ��ʱlow��high���,��ʱ��low��high����tmp����ȷ����λ��
		// ��ԭ���ֿ��Ժ������֪��lowλ�õ�ֵ������tmp,������Ҫ��tmp��ֵ��arr[low]
		arr[low] = tmp;
		return low; // ����tmp����ȷλ��
	}

	// ����һ��
//	public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
//		if(input.length<k) {
//			return new ArrayList<Integer>();
//		}
//		//����һ������󶥶ѣ�ջ��Ԫ����󣬽������У�
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
