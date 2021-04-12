package com.xjf.algorithm.JianZhiOffer;

//把字符串转换成整数
//将一个字符串转换成一个整数，要求不能使用字符串转换整数的库函数。
//数值为0或者字符串不是一个合法的数值则返回0
public class Test67 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int StrToInt(String str) {
		if(str==null||str.length()==0) {
			return 0;
		}
		
		int num=0;
		for (int i = 0; i < str.length(); i++) {
			if(i==0&&(str.charAt(i)=='+'||str.charAt(i)=='-')) {
				continue;
			}
			if(str.charAt(i)<'0'||str.charAt(i)>'9') {//判断数字
				return 0;
			}else {
				num=num*10+str.charAt(i)-'0';//字符转数字
			}
		}
		if(str.charAt(0)=='+') {
			return num;
		}else if(str.charAt(0)=='-') {
			return -num;
		}
		return num;
	}

}
