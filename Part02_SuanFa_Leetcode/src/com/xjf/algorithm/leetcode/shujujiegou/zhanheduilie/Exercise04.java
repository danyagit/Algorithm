package com.xjf.algorithm.leetcode.shujujiegou.zhanheduilie;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

//��Ч������,����ջ�������(��ס��������)
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
			//�������������ͽ�����stack�����
			if(charArray[i]=='('||charArray[i]=='{'||charArray[i]=='[') {
				stack.push(charArray[i]);
			//��һ�������ű���͸���ӵ�������ƥ��
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
