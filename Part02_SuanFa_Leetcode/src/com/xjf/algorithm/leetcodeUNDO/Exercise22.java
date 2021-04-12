package com.xjf.algorithm.leetcodeUNDO;

import java.util.ArrayList;
import java.util.List;

//生成括号的方案，回溯法，回溯法学会画树形图
public class Exercise22 {

	public static void main(String[] args) {
		Exercise22 exercise22 = new Exercise22();
		List<String> list = exercise22.generateParenthesis(3);
		System.out.println(list);
	}
	public List<String> res;
	int n;
	public List<String> generateParenthesis(int n) {
		List<String> res = new ArrayList<String>();
		this.res=res;
		this.n = n;
		backtracking(new StringBuffer("("),1,0);
		return res;
	}
	/**
	 * @param sb 当前字符串
	 * @param len 字符串长度
	 * @param l 已用左括号个数
	 * @param r 已用右括号个数
	 */
	private void backtracking(StringBuffer sb, int l, int r) {
		if(sb.length() == 2*n) {
			res.add(sb.toString());
			return;
		}
		if(l<n) {
			sb.append('(');
			backtracking(sb, l+1, r);
			sb.deleteCharAt(sb.length()-1);//剪枝。只要是深入尝试的地方，就要有剪枝
		}
		
		if(l>r) {
			sb.append(')');
			backtracking(sb, l, r+1);
			sb.deleteCharAt(sb.length()-1);
		}
	}


}
