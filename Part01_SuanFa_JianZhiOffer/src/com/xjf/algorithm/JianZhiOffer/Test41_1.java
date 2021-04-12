package com.xjf.algorithm.JianZhiOffer;

import java.util.ArrayList;
import java.util.Arrays;

//数据流中的中位数
//如何得到一个数据流中的中位数？
//如果从数据流中读出奇数个数值，
//那么中位数就是所有数值排序之后位于中间的数值。
//如果从数据流中读出偶数个数值，
//那么中位数就是所有数值排序之后中间两个数的平均值。
//我们使用Insert()方法读取数据流，
//使用GetMedian()方法获取当前读取数据的中位数。

/**
 * 用了Arrays.sort。
 * TODO 但实际上要想减小时间复杂度，需要用到队列
 * @author xjf
 *
 */


public class Test41_1 {

	public static void main(String[] args) {

	}
	ArrayList<Integer> list = new ArrayList<>();
	public void Insert(Integer num) {
		list.add(num);
	}

	public Double GetMedian() {
		Object[] array = list.toArray();
		Arrays.sort(array);
		if(array.length%2==0) {
			return (double)((int)array[array.length/2]+(int)array[array.length/2-1])/2 ;
		}
		else return (double) (int)array[array.length/2];
	}

}
