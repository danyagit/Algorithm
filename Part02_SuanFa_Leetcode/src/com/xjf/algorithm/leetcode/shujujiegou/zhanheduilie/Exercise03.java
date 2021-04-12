package com.xjf.algorithm.leetcode.shujujiegou.zhanheduilie;

import java.util.Stack;

//��Сջ
public class Exercise03 {

	public static void main(String[] args) {

	}
	Stack<Integer> stack = new Stack<>();
	Stack<Integer> minStack = new Stack<>();
	Integer min=Integer.MAX_VALUE;
	/** initialize your data structure here. */
    public Exercise03() {

    }
    
    public void push(int x) {
    	stack.push(x);
    	min = Math.min(min, x);//��һ���ؼ���.stackÿ��λ�ö���Ӧһ����Сֵ,��Ӧջ�׵���λ�õ���Сֵ
        minStack.add(min);
    }
    
    public void pop() {
    	stack.pop();
    	minStack.pop();
        min = minStack.isEmpty() ? Integer.MAX_VALUE : minStack.peek();
    }
    
    public int top() {
    	return stack.peek();
    }
    
    public int getMin() {
    	return minStack.peek();
    }
}
