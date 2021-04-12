package com.xjf.algorithm.JianZhiOffer;

//第一个只出现一次的字符:
//在一个字符串(0<=字符串长度<=10000，全部由字母组成)中
//找到第一个只出现一次的字符,并返回它的位置, 如果没有则返回 -1
//（需要区分大小写）.（从0开始计数）
public class Test50 {

	public static void main(String[] args) {

	}
	//hashmap或者整型数组
	
	
	public int FirstNotRepeatingChar(String str) {
        char[] array = str.toCharArray();
        for(int i =0;i<array.length;i++) {
        	for(int j =0;j<array.length;j++) {
        		if(array[j]==array[i]&&i!=j) {
        			break;
        		}
        		if(j==array.length-1) {
        			return i;
        		}
        	}
        }
		return -1;
    }

}
