package com.xjf.algorithm.JianZhiOffer;
//替换空格:字符串
//请实现一个函数，将一个字符串中的每个空格替换成“%20”。
//例如，当字符串为We Are Happy,
//则经过替换之后的字符串为We%20Are%20Happy。

/*public class Solution {
    public String replaceSpace(StringBuffer str) {
    	
    }
}*/


/**
 * string的replace方法可以将所有的某个字符替换为指定字符，而stringbuffer不行 字符串操作之后要注意索引位置和字符串长度是会变化的
 */
public class Test05 {
	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("app le e");
		String str1 = replaceSpace(str);
		System.out.println(str1);
	}

	public static String replaceSpace(StringBuffer str) {
		int length = str.length();
		for (int i = 0; i < length; i++) {
			if (str.charAt(i) == ' ') {
				str.insert(i, "%20");
				length = length + 3;
				i = i + 3;
			}
		}
		return str.toString().replace(" ", "");
	}

}
