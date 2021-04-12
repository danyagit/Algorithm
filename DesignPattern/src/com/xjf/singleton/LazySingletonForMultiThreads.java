package com.xjf.singleton;

//�̰߳�ȫ������ʽ
public class LazySingletonForMultiThreads {
	//volatile��֤��22-26�е�д�������֮ǰ����������һ���߳̽���21�е��жϣ���ʵ����Ҳû����
	private static volatile LazySingletonForMultiThreads l;
	
	private LazySingletonForMultiThreads() {

	}
	//����1��ֱ�ӶԷ�����synchronized��Ч�ʵ�
//	public static synchronized LazySingletonForMultiThreads getInstance() {
//		if (l == null) {
//			l = new LazySingletonForMultiThreads();
//		}
//		return l;
//	}
	
	//������������飬��С��Χ
	public static  LazySingletonForMultiThreads getInstance() {
		if(l==null) {//��һ����Ϊ��Ч�ʣ���Ȼÿ�ζ���Ҫȥ���Ի����
			synchronized (LazySingletonForMultiThreads.class) {
				if(l==null) {
					l = new LazySingletonForMultiThreads();
				}
			}
			
		}
		return l;
		
	}
	
	
}
