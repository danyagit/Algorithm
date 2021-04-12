package com.xjf.algorithm.JianZhiOffer;

import java.util.Stack;

/**
 * 定义栈的数据结构，请在该类型中实现一个能够得到
栈中所含最小元素的min函数（时间复杂度应为O（1））。
这题技巧性很强，但难度不大，记住这个技巧
 * @author xjf
 *
 */

public class Test30 {
	public static void main(String[] args) {

	}

	Stack<Integer> stack1 = new Stack<>();//做假push
	Stack<Integer> stack2 = new Stack<>();//做真正的push
	// 往栈里面添加元素
	public void push(int node) {
		stack2.push(node);
		if (stack1.isEmpty()) {
			stack1.push(node);
		}
		else {
			if(stack1.peek()>node) {
				stack1.push(node);
			}
			else {
				stack1.push(stack1.peek());
			}
		}
	}

	// 取出栈的第一个元素
	public void pop() {
		stack1.pop();
		stack2.pop();
	}

	// 返回栈的第一个元素
	public int top() {
		return stack2.peek();
	}

	// 栈的最小元素
	public int min() {
		return stack1.peek();
	}
}
