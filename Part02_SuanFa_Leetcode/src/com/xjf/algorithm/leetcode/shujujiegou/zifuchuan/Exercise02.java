package com.xjf.algorithm.leetcode.shujujiegou.zifuchuan;

//2. �ַ���ѭ����λ
public class Exercise02 {
	public static void main(String[] args) {
		Exercise02 exercise02 = new Exercise02();
		String string = exercise02.moveCycle("abcde", 8);
		System.out.println(string);
	}

//	abcde����ѭ����λ3λ,cdeab
	// ���ַ�������ѭ���ƶ�kλ
	public String moveCycle(String str, int k) {
		int length = str.length();
		// ���ǽ���kλ��ǰ��Ľ���λ��
		String substring1 = str.substring(length - k%length, length );
		String substring2 = str.substring(0, length - k%length);
		return substring1+substring2;
	}
	
}
