package com.xjf.thinkingInJava;

import java.util.Vector;

import org.junit.Test;

public class MyTest {
	@Test
	public void testBreak() {
		int i = 0;
		outer: while (true) {
			while (true) {
				i++;
				if (i == 10) {
					break outer;
				}
			}
		}
		System.out.println(i);
	}
	
	@Test
	public void testVector() {
		Vector<Integer> vector = new Vector<>();
		vector.add(1);
		try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Thread.currentThread().interrupt();
		}
	}

}
