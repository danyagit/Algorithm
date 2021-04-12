package com.xjf.future;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.Function;
import java.util.function.Supplier;

import org.junit.Test;

public class Main {
	public ExecutorService executor = Executors.newFixedThreadPool(10);

	// 测试future的两个功能
	@Test
	public void test01() throws Exception {
		Future<Integer> future = executor.submit(new Task01());

//		Integer i = future.get();//阻塞等待
//		System.out.println(i);
//		System.out.println(1);

		// 若没完成，就在这里空循环
		while (!future.isDone()) {

		}

		// 其他操作

	}

	@Test
	public void test02() throws Exception {
		CompletableFuture<Void> supplyAsync = CompletableFuture.supplyAsync(new Supplier<Integer>() {
			@Override
			public Integer get() {
				return 1;
			}
		}).thenApplyAsync(new Function<Integer, Void>() {
			@Override
			public Void apply(Integer t) {
				System.out.println(t+"2");
				return null;
			}
		});
//		String string = supplyAsync.get();
//		System.out.println(string);
	}

}
