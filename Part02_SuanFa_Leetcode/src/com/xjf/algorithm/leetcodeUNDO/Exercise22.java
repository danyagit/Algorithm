package com.xjf.algorithm.leetcodeUNDO;

import java.util.ArrayList;
import java.util.List;

//�������ŵķ��������ݷ������ݷ�ѧ�ử����ͼ
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
	 * @param sb ��ǰ�ַ���
	 * @param len �ַ�������
	 * @param l ���������Ÿ���
	 * @param r ���������Ÿ���
	 */
	private void backtracking(StringBuffer sb, int l, int r) {
		if(sb.length() == 2*n) {
			res.add(sb.toString());
			return;
		}
		if(l<n) {
			sb.append('(');
			backtracking(sb, l+1, r);
			sb.deleteCharAt(sb.length()-1);//��֦��ֻҪ�����볢�Եĵط�����Ҫ�м�֦
		}
		
		if(l>r) {
			sb.append(')');
			backtracking(sb, l, r+1);
			sb.deleteCharAt(sb.length()-1);
		}
	}


}
