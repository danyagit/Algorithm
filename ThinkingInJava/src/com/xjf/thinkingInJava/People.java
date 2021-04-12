package com.xjf.thinkingInJava;

public class People {
	int age=2;
	int sex=1;
//	@Override
//	public int hashCode() {
//		return 1;
//	}
	
	@Override
	public boolean equals(Object obj) {
		People people = (People)obj;
		if(people.age==age&&people.sex==sex) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		People people1 = new People();
		People people2 = new People();
		System.out.println(people1.hashCode());
		System.out.println(people2.hashCode());
		System.out.println(people1==people2);
		System.out.println(people1.equals(people2));
	}
	
}
