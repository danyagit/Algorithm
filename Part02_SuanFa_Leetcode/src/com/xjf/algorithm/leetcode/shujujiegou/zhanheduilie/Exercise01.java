package com.xjf.algorithm.leetcode.shujujiegou.zhanheduilie;

import java.util.Stack;

//用栈实现队列
//主要在于pop方法 (peek和pop是一样的)
public class Exercise01 {

	public static void main(String[] args) {
		Exercise01 exercise01 = new Exercise01();
		exercise01.push(2);

	}

	Stack<Integer> stack1 = new Stack<>();
	Stack<Integer> stack2 = new Stack<>();

	/** Initialize your data structure here. */
	public Exercise01() {

	}

	/** Push element x to the back of queue. */
	public void push(int x) {
		stack1.push(x);
	}

	/** Removes the element from in front of queue and returns that element. */
	public int pop() {
		if (!empty()) {
			if(stack1.isEmpty()&&!stack2.isEmpty()) {
				return stack2.pop();
			}
			if (stack2.isEmpty()&&!stack1.isEmpty()) {
				while (!stack1.isEmpty()) {
					Integer pop = stack1.pop();
					stack2.push(pop);
				}
				return stack2.pop();
			}
			//都不空
			return stack2.pop();
		}
		return 0;
		
	}

	/** Get the front element. */
	public int peek() {
		if (!empty()) {
			if(stack1.isEmpty()&&!stack2.isEmpty()) {
				return stack2.peek();
			}
			if (stack2.isEmpty()&&!stack1.isEmpty()) {
				while (!stack1.isEmpty()) {
					Integer pop = stack1.pop();
					stack2.push(pop);
				}
				return stack2.peek();
			}
			//都不空
			return stack2.peek();
		}
		return 0;
		
	}

	/** Returns whether the queue is empty. */
	public boolean empty() {
		if (stack1.isEmpty() && stack2.isEmpty()) {
			return true;
		}
		return false;
	}
}
