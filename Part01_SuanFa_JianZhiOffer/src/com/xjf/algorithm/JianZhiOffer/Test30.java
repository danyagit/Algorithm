package com.xjf.algorithm.JianZhiOffer;

import java.util.Stack;

/**
 * ����ջ�����ݽṹ�����ڸ�������ʵ��һ���ܹ��õ�
ջ��������СԪ�ص�min������ʱ�临�Ӷ�ӦΪO��1������
���⼼���Ժ�ǿ�����ѶȲ��󣬼�ס�������
 * @author xjf
 *
 */

public class Test30 {
	public static void main(String[] args) {

	}

	Stack<Integer> stack1 = new Stack<>();//����push
	Stack<Integer> stack2 = new Stack<>();//��������push
	// ��ջ�������Ԫ��
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

	// ȡ��ջ�ĵ�һ��Ԫ��
	public void pop() {
		stack1.pop();
		stack2.pop();
	}

	// ����ջ�ĵ�һ��Ԫ��
	public int top() {
		return stack2.peek();
	}

	// ջ����СԪ��
	public int min() {
		return stack1.peek();
	}
}
