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
	//�õ�ĳ��Ԫ�أ�������Ԫ�����ȼ����
	public int get(int key) {
		//��map�����ø�Ԫ�أ����ƶ�������
		
		return 0;
	}
	
	//����ĳ��Ԫ�أ�������Ԫ�����ȼ����
	public void put(int key, int value) {
		if(map.containsKey(key)) {
			//��Ŀ��Ԫ���ƶ�������
			
			return;
		}
		
		//����Ԫ�ط���head����
		Node newNode = add(head,value);
		//����Ԫ�ط���map����
		map.put(key, newNode);
	}
	
	//����Ԫ�ط���head����
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
