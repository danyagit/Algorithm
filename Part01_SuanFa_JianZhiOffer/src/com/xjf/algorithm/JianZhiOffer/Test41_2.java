package com.xjf.algorithm.JianZhiOffer;

//字符流中第一个不重复的字符:和Test50是一样的
//请实现一个函数用来找出字符流中第一个只出现一次的字符。
//例如，当从字符流中只读出前两个字符"go"时，
//第一个只出现一次的字符是"g"。
//当从该字符流中读出前六个字符“google"时，第一个只出现一次的字符是"l"。
//注意：如果当前字符流没有存在出现一次的字符，返回#字符。
/**
 * TODO 想减少时间复杂度，用队列
 * @author xjf
 *
 */

public class Test41_2 {

	public static void main(String[] args) {

	}
	StringBuffer str =new StringBuffer();
	public void Insert(char ch){
        str.append(ch);
    }
	//return the first appearence once char in current stringstream
    public char FirstAppearingOnce() {
    	String str1 = new String(str);
    	char[] array = str1.toCharArray();
        for(int i =0;i<array.length;i++) {
        	for(int j =0;j<array.length;j++) {
        		if(array[j]==array[i]&&i!=j) {
        			break;
        		}
        		if(j==array.length-1) {
        			return array[i];
        		}
        	}
        }
		return '#';
    }

}
