package com.xjf.algorithm.leetcode.shujujiegou.zhanheduilie;
import java.util.LinkedList;
import java.util.Queue;
//用队列实现栈
public class Exercise02 {

	public static void main(String[] args) {
	}
	
	Queue<Integer> queue = new LinkedList<>();
	/** Initialize your data structure here. */
    public Exercise02() {
    	
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
    	queue.add(x);
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
    	int size=queue.size();
    	if(size<=1) {
    		return queue.poll();
    	}
    	while(size>1){
    		queue.add(queue.poll());
    		size--;
    	}
    	return queue.poll();
    }
    
    /** Get the top element. */
    public int top() {
    	int size=queue.size();
    	if(size<=1) {
    		return queue.peek();
    	}
    	while(size>1){
    		queue.add(queue.poll());
    		size--;
    	}
    	Integer peek = queue.peek();
    	queue.add(queue.poll());
    	return peek;
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
    	if(queue.isEmpty()) {
    		return true;
    	}
    	return false;
    }
}
