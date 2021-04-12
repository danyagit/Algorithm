package com.xjf.singleton;

//线程安全的懒汉式
public class LazySingletonForMultiThreads {
	//volatile保证了22-26行的写操作完成之前，不会有另一个线程进行21行的判断，其实不用也没问题
	private static volatile LazySingletonForMultiThreads l;
	
	private LazySingletonForMultiThreads() {

	}
	//方法1：直接对方法加synchronized，效率低
//	public static synchronized LazySingletonForMultiThreads getInstance() {
//		if (l == null) {
//			l = new LazySingletonForMultiThreads();
//		}
//		return l;
//	}
	
	//方法二：代码块，缩小范围
	public static  LazySingletonForMultiThreads getInstance() {
		if(l==null) {//第一次是为了效率，不然每次都需要去尝试获得锁
			synchronized (LazySingletonForMultiThreads.class) {
				if(l==null) {
					l = new LazySingletonForMultiThreads();
				}
			}
			
		}
		return l;
		
	}
	
	
}
