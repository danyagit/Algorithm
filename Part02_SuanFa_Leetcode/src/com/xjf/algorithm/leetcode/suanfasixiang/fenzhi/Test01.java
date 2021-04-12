package com.xjf.algorithm.leetcode.suanfasixiang.fenzhi;

import java.util.ArrayList;
import java.util.List;

//为运算表达式设计优先级
//给定一个含有数字和运算符的字符串，为表达式添加括号，改变其运算优先级以求出不同的结果。你需要给出所有可能的组合的结果。有效的运算符号包含 +, - 以及 * 。
//输入: "2*3-4*5"
//输出: [-34, -14, -10, -10, 10]
//解释: 
//(2*(3-(4*5))) = -34 
//((2*3)-(4*5)) = -14 
//((2*(3-4))*5) = -10 
//(2*((3-4)*5)) = -10 
//(((2*3)-4)*5) = 10

/**
 * 
 * 分治算法三步走：
分解：按运算符分成左右两部分，分别求解
解决：实现一个递归函数，输入算式，返回算式解。左右两部分各返回一个解
合并：根据运算符合并左右两部分的解，得出最终解
@author xjf
 */
public class Test01 {

	public static void main(String[] args) {
		Test01 test01 = new Test01();
		List<Integer> list = test01.diffWaysToCompute("2*3-4*5");
		System.out.println(list);
	}

	public List<Integer> diffWaysToCompute(String input) {
		List<Integer> ways = new ArrayList<>();
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (c == '+' || c == '-' || c == '*') {
				List<Integer> left = diffWaysToCompute(input.substring(0, i));
				List<Integer> right = diffWaysToCompute(input.substring(i + 1));
				for (int l : left) {
					for (int r : right) {
						switch (c) {
						case '+':
							ways.add(l + r);
							break;
						case '-':
							ways.add(l - r);
							break;
						case '*':
							ways.add(l * r);
							break;
						}
					}
				}
			}
		}
		if (ways.size() == 0) {
			ways.add(Integer.valueOf(input));
		}
		return ways;
	}
}
