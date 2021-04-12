package com.xjf.algorithm.JianZhiOffer;

//为此他特别数了一下1~13中包含1的数字有
//1、10、11、12、13因此共出现6次,
//但是对于后面问题他就没辙了。
//ACMer希望你们帮帮他,并把问题更加普遍化,
//可以很快的求出任意非负整数区间中1出现的次数
//（从1 到 n 中1出现的次数）
public class Test43 {

	public static void main(String[] args) {

	}

	public int NumberOf1Between1AndN_Solution(int n) {
		int cnt=0;
		for (int i = 1; i<=n; i++) {
			cnt=cnt+count(i);
		}
		return cnt;
	}
	public int count(int num) {
		int cnt=0;
		while(num>0) {
			if(num%10==1) {
				cnt++;
			}
			num=num/10;
		}
		return cnt;
	}
	

}
