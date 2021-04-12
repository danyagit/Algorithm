package com.xjf.algorithm.JianZhiOffer;

//数字序列中某一位的数字
//数字以0123456789101112131415…的格式序列化到一个字符序列中。
//在这个序列中，第5位（从下标0开始计数）是5，第13位是1，第19位是4，等等。
//请写一个函数，求任意第n位对应的数字。
/**
 * 思路：由所给数通过fun函数找到它是在几位数的区间里面，比如：
 * 一位数区间：0至9
 * 二位数区间：9至9+90*2
 * 三位数区间：9+90*2至9+90*2+900*3
 * 四位数区间：9+90*2+900*3至9+90*2+900*3+9000*4
 * fun函数可以由给定的n，确定它是在i位数的区间里。
 * 接下来是通过n和上一个区间的右端点作差，与i一起求得它在i位数区间排第几（例如：10排在二位数区间的第一）
 * 进而确定这个数的第几位是所求（比如11的第二位是n=13所求）。
 * @author xjf
 *
 */
public class Test44 {

	public static void main(String[] args) {
		Test44 test44 = new Test44();
		int digit = test44.findNthDigit(10000);
		System.out.println(digit);
	}
	public int findNthDigit(int n) {
		if(n/10<1) {
			return n;
		}
		//i表示几位数
//		int i=1;
//		（下面这种找到i的方法弃用）
//		while(true) {
//			if(n<range(i)) {
//				break;
//			}
//			i++;
//		}
		int i = fun(n);
		//现在i表示n是i位数范围里面的
		int b = n-range(i-1);
		//第b/i个i位数的第b%i位
		int th1 =0;
		int th2 =0;
		if(b%i==0) {
			th1=b/i;
			th2=i;
		}else {
			th1=b/i+1;
			th2=b%i;
		}
		int num =(int) (Math.pow(10, i-1)+th1-1);
		return digit(num,th2);
    }
	//i表示几位数，返回右边界(弃用)
	public int range(int i) {
		double range = 0;
		for(int j=1;j<=i;j++) {
			range = range+9*Math.pow(10, j-1)*j;
		}
		return (int) range;
	}
	//num的第order位
	public int digit(int num,int order) {
		int cnt=0;
		int num1=num;
		while(num>0) {
			num=num/10;
			cnt++;
		}
		int a=1;
		while(a<=cnt-order) {
			num1=num1/10;
			a++;
		}
		return num1%10;
	}
	public int fun(int num) {
		int cnt = 0;
		int j = 0;
		while (num > 0) {
			num = (int) (num - 9 * Math.pow(10, j) * (j + 1));
			j++;
			cnt++;
		}
		return cnt;
	}
	
}
