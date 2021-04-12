package com.xjf.algorithm.JianZhiOffer;

import java.util.Stack;

//用两个栈实现队列：栈
//用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
//import java.util.Stack;
//
//public class Solution {
//    Stack<Integer> stack1 = new Stack<Integer>();
//    Stack<Integer> stack2 = new Stack<Integer>();
//    
//    public void push(int node) {
//        
//    }
//    
//    public int pop() {
//    
//    }
//}


public class Test09 {

	public static void main(String[] args) {
	}

	Stack<Integer> stack1 = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();

	public void push(int node) {
		stack1.push(node);

	}

	public int pop() {
		if (stack2.isEmpty())// 这个判断很重要，必须在第二个栈空的时候才从第一个栈中取出放入第二个
			while (!stack1.isEmpty())
				stack2.push(stack1.pop());
		return stack2.pop();
	}
}
