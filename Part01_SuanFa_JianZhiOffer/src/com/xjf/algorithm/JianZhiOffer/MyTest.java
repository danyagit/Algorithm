package com.xjf.algorithm.JianZhiOffer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

import org.junit.Test;

public class MyTest {
	
	@Test
	public void testTrim() {
		String str = " 1111 111 ";
		System.out.println(str);
	}
	
	@Test
	public void testFinal() {
		final int[] nums = { 6, 1, 3, 9, 2, 4, 8, 0, 5, 7 };
		nums[1] = 2;
		for (int i : nums) {
			System.out.println(i);
		}
	}

	@Test
	public void testFastChoose() {
		int[] nums = { 6, 1, 3, 9, 2, 4, 8, 0, 5, 7 };
		fastChoose(nums, 5);
		System.out.println(nums);
	}

	// �ҳ���kС��Ԫ��
	private ArrayList<Integer> fastChoose(int[] nums, int k) {
		int i = 0;
		int j = nums.length - 1;
		while (i < j) {
			int index = getIndex(nums, i, j);
			if (index < k - 1) {
				i = index + 1;
			} else if (index > k - 1) {
				j = index - 1;
			} else {
				break;
			}
		}
		ArrayList<Integer> list = new ArrayList<>();
		for (int m = 0; m < k; m++) {
			list.add(nums[m]);
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

	@Test
	public void test01() {
		int[] array = new int[] { 1, 2, 3, 4, 5 };
		int[] copyOfRange = Arrays.copyOfRange(array, 1, 4);
		for (int i : copyOfRange) {
			System.out.println(i);
		}
	}

	@Test
	public void test02() {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(0, 1);
		for (Integer integer : list) {
			System.out.println(integer);
		}
	}

	@Test
	public void tes03() {
		String[] nums = new String[] { "3", "32", "321" };
		Arrays.sort(nums, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return (o1 + o2).compareTo(o2 + o1);
			}
		});
		for (String num : nums) {
			System.out.println(num);
		}
	}

	@Test
	public void test04() {
		System.out.println(fun(1000));
	}

	public int fun(int num) {
		int cnt = 0;
		int j = 0;
		while (num > 0) {
			num = (int) (num - 9 * Math.pow(10, j) * (j + 1));
			j++;
			cnt++;
		}
		return cnt;
	}

	@Test
	public void test05() {
		System.out.println(Translate(25));
	}

	// ����һλ������λ����
	public Character Translate(int num) {
		if (num < 0 || num > 25) {
			return null;
		} else {
			return (char) ('a' + num);
		}
	}

	@Test
	public void test06() {
		System.out.println(String.valueOf(1233));
		Integer num = Integer.valueOf("123456");
		System.out.println(num + 1);
		System.out.println('b' + 'a');
	}

}
