package com.xjf.algorithm.leetcode.suanfasixiang.sousuo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class MyTest {
	
	@Test
	public void testSubString() {
		StringBuffer buffer = new StringBuffer("0123456");
		System.out.println(buffer.substring(0, 2));
	}
	
	@Test
	public void testArrayList() {
		List<String> list = new ArrayList<>();
		list.add("aa");
		list.remove("bb");
	}
	
	@Test
	public void testStringToInt() {
		String str = "123";
		Integer value = Integer.valueOf(str);
		System.out.println(value);
	}
	
	@Test
	public void testJudgeIsIp() {
		System.out.println(judgeIsIp("1,0,1,023", "101023"));
	}
	
	
	public boolean judgeIsIp(String str,String s) {
		if(str.length()!=s.length()+3) {
			return false;
		}
		String[] split = str.split(",");
		for (String string : split) {
			if(string.length()>1&&string.charAt(0)=='0') {
				return false;
			}
			if(Integer.valueOf(string)>255) {
				return false;
			}
		}
		return true;
	}
	@Test
	public void testString() {
		String str = "1,2,3";
		String replace = str.replace(',', '.');
		System.out.println(replace);
	}
	
	@Test
	public void testCopy() {
		int array[]= {1,2,3};
		int[] copyOfRange = Arrays.copyOfRange(array, 0, 0);
		System.out.println(copyOfRange);
	}
	
	@Test
	public void testEquals() {
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list2.add(1);
		list2.add(3);
		System.out.println(list1.equals(list2));
	}
	
	@Test
	public void testCopyList() {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		ArrayList<Integer> list2 =new ArrayList(list);
		list.set(0, 5);
		System.out.println(list);
		System.out.println(list2);
	}
	
	
	
}
