package com.xjf.thinkingInJava;

public class Dog extends Animal {

	public Dog(int a) {
		super(a);
	}
	public static void main(String[] args) {
		Dog dog = new Dog(2);
		System.out.println(dog.getAge());
	}
}
