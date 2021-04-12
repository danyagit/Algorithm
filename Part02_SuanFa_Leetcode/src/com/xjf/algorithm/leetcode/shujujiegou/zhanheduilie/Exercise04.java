package com.xjf.algorithm.leetcode.shujujiegou.zhanheduilie;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

//有效的括号,经典栈解决问题(记住方法即可)
public class Exercise04 {

	public static void main(String[] args) {

	}

	public boolean isValid(String s) {
		Map<Character,Character> map = new HashMap<>();
		map.put('(', ')');
		map.put('{', '}');
		map.put('[', ']');
		char[] charArray = s.toCharArray();
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < charArray.length; i++) {
			//如果是左括号你就接着往stack里面加
			if(charArray[i]=='('||charArray[i]=='{'||charArray[i]=='[') {
				stack.push(charArray[i]);
			//第一个右括号必须和刚添加的左括号匹配
			}else {
				if(stack.isEmpty()) {
					return false;
				}
				Character pop = stack.pop();
				if(map.get(pop)!=charArray[i]) {
					return false;
				}
			}
		}
		if(stack.isEmpty()) {
			return true;
		}
		return false;
	}
}
