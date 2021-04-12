package com.xjf.algorithm.leetcode.shujujiegou.zifuchuan;
//8. 判断一个整数是否是回文数
/**
 * 方法一：转换为字符串
 * 方法二：不使用额外的空间，直接处理整数
 * @author xjf
 *
 */
public class Exercise08 {

	public static void main(String[] args) {

	}
	public boolean isPalindrome(int x) {
		if(x<0) {
			return false;
		}
		char[] str = String.valueOf(x).toCharArray();
		if(str.length%2==0) {
			return judge(str.length/2-1,str.length/2,str);
		}else {
			return judge(str.length/2,str.length/2,str);
		}
    }
	private boolean judge(int i, int j, char[] str) {
		while(i>=0&&j<=str.length-1) {
			if(str[i]!=str[j]) {
				return false;
			}
			i--;
			j++;
		}
		return true;
	}
	//方法二
	public boolean isPalindrome02(int x) {
	    if (x == 0) {
	        return true;
	    }
	    if (x < 0 || x % 10 == 0) {
	        return false;
	    }
	    int right = 0;//只需要这一个额外的空间
	    //从数的右边开始，将其作为新数的高位，做一半即可
	    while (x > right) {
	        right = right * 10 + x % 10;
	        x /= 10;
	    }
	    return x == right || x == right / 10;
	}
}
