package com.leetcode;

public class Exercise08 {

	public static void main(String[] args) {
		int myAtoi = Exercise08.myAtoi(" ");
		System.out.println(myAtoi);
	}

	public static int myAtoi(String s) {
		if (s.equals("")) {
			return 0;
		}
		int length = s.length();
		// 去空格
		int index = 0;
		while (index < length && s.charAt(index) == ' ') {
			index++;
		}
		if (index >= length) {
			return 0;
		}

		// 首字符是字母的情况，直接返回0
		if (s.charAt(index) != '-' && s.charAt(index) != '+' && s.charAt(index) != ' '
				&& (s.charAt(index) < '0' || s.charAt(index) > '9')) {
			return 0;
		}

		// 以正负号开头的
		if (s.charAt(index) == '-' || s.charAt(index) == '+') {
			int i = index + 1;
			Long value = 0L;
			while (i < length && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				i++;
				value = Long.valueOf(s.substring(index, i));
				if (value > Integer.MAX_VALUE) {
					return Integer.MAX_VALUE;
				}
				if (value < Integer.MIN_VALUE) {
					return Integer.MIN_VALUE;
				}
			}
			if (i == index + 1) {
				return 0;
			}
			return value.intValue();

			// 以数字开头的
		} else if (s.charAt(index) >= '0' && s.charAt(index) <= '9') {
			// 去0，防止00000-123，这种就应该返回0
			while (index < length && s.charAt(index) == '0') {
				index++;
			}
			int i = index;
			Long value = 0L;
			while (i < length && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				i++;
				value = Long.valueOf(s.substring(index, i));
				if (value > Integer.MAX_VALUE) {
					return Integer.MAX_VALUE;
				}
			}
			return value.intValue();
		} else {
			return 0;
		}
	}
}
