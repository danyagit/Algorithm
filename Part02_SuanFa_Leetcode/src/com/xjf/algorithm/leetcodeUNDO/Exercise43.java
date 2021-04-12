package com.xjf.algorithm.leetcodeUNDO;

//细节题
public class Exercise43 {

	public static void main(String[] args) {
		Exercise43 exercise43 = new Exercise43();
		String multiply = exercise43.multiply("9", "9");
		System.out.println(multiply);
	}
	
	public String multiply(String num1, String num2) {
		if("0".equals(num1)||"0".equals(num2)) {
			return "0";
		}
		StringBuffer [] sbs = new StringBuffer [num2.length()];
		for (int i = 0; i < num2.length(); i++) {
			StringBuffer sb = getMultResult(new StringBuffer(num1),num2.length()-1-i,num2.charAt(i)-'0');
			sbs[i] = sb;
		}
		StringBuffer res = sbs[0];
		for (int i = 1; i < sbs.length; i++) {
			res = addTwoString(sbs[i],res);
		}
		return res.toString();
    }
	/**
	 * @param array1 
	 * @param i 加i个0
	 * @param j 这一位是什么
	 */
	private StringBuffer getMultResult(StringBuffer sb, int i, int j) {
		StringBuffer s = sb;
		if(j==0) {
			return new StringBuffer("0");
		}
		for (int k = 1; k < j; k++) {
			s = addTwoString(s,sb);
		}
		for (int k = 0; k < i; k++) {
			s.append('0');
		}
		return s;
	}

	private StringBuffer addTwoString(StringBuffer s, StringBuffer s2) {
		int i = s.length()-1;
		int j = s2.length()-1;
		int out = 0;
		int cur = 0;
		StringBuffer sb = new StringBuffer("");
		while(i>=0&&j>=0) {
			cur = (s.charAt(i)-'0'+s2.charAt(j)-'0'+out)%10;
			out = (s.charAt(i)-'0'+s2.charAt(j)-'0'+out)/10;
			sb.insert(0, cur);
			i--;
			j--;
		}
		if(i<0&&j<0&&out>0) {
			sb.insert(0, out);
			out = 0;
		}
		while(i>=0) {
			cur = (s.charAt(i)-'0'+out)%10;
			out = (s.charAt(i)-'0'+out)/10;
			sb.insert(0, cur);
			i--;
		}
		while(j>=0) {
			cur = (s2.charAt(j)-'0'+out)%10;
			out = (s2.charAt(j)-'0'+out)/10;
			sb.insert(0, cur);
			j--;
		}
		if(i<0&&j<0&&out>0) {
			sb.insert(0, out);
		}
		return sb;
	}
}
