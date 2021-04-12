package com.xjf;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
	class Node {
		int val;
		Node next;
		Node previous;
		public Node() {
		}
		public Node(int val) {
			this.val=val;
		}
	}

	public static void main(String[] args) {

	}
	Node head;
	Node tail;
	Map<Integer, Node> map = new HashMap<>();
	public LRUCache(int capacity) {
		head = new Node();
		tail = new Node();
		head.next=tail;
		tail.previous=head;
	}
	//得到某个元素，随后这个元素优先级提高
	public int get(int key) {
		//从map里面获得该元素，并移动到队首
		
		return 0;
	}
	
	//新增某个元素，随后这个元素优先级提高
	public void put(int key, int value) {
		if(map.containsKey(key)) {
			//将目标元素移动到队首
			
			return;
		}
		
		//将该元素放在head后面
		Node newNode = add(head,value);
		//将该元素放在map里面
		map.put(key, newNode);
	}
	
	//将该元素放在head后面
	public Node add(Node head, int value) {
		Node next = head.next;
		Node newNode = new Node(value);
		head.next = newNode;
		newNode.next=next;
		newNode.previous=head;
		next.previous=newNode;
		return newNode;
	}
	
	
	
}
