package com.xjf.future;

import java.util.concurrent.Callable;

public class Task01 implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		Thread.sleep(2000);
		return 1;
	}
	

}
