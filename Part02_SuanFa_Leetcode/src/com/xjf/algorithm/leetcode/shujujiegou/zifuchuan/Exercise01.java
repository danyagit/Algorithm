package com.xjf.algorithm.leetcode.shujujiegou.zifuchuan;
//1. ×Ö·û´®Ñ­»·ÒÆÎ»°üº¬
public class Exercise01 {

	public static void main(String[] args) {
		Exercise01 exercise01 = new Exercise01();
		boolean judgeCycleContain = exercise01.judgeCycleContain("AABCD", "CDAA");
		System.out.println(judgeCycleContain);
		
	}
	
	public boolean judgeCycleContain(String str1,String str2) {
		String str = str1+str1;
		if(str.indexOf(str2)!=-1) {
			return true;
		}
		return false;
	}

}
