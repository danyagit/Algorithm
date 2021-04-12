package com.xjf.algorithm.leetcode.suanfasixiang.sousuo;

import java.util.ArrayList;
import java.util.List;

//�ָ���Ĵ�
/**
 * ����Ϊʲô�˴��û��ݷ�����Ϊ��Ҳ��������ϵ�һ��
 * @author xjf
 *
 */
public class Backtracking13 {

	public static void main(String[] args) {
		Backtracking13 backtracking13 = new Backtracking13();
		List<List<String>> list = backtracking13.partition("aab");
		System.out.println(list);
	}
	public List<List<String>> partition(String s) {
		List<String> list = new ArrayList<>();
		List<List<String>> result = new ArrayList<>();
		backtracking(result,list,s);
		return result;
    }
	//�ָ��ַ�����Ҳ���������
	private void backtracking(List<List<String>> result, List<String> list, String s) {
		if(s.length()==0) {
			result.add(new ArrayList<String>(list));
			return;
		}
		for (int i = 0; i < s.length(); i++) {
			String left = s.substring(0, i+1);
			if(judgeHuiWen(left)) {
				list.add(left);
			}else {
				continue;
			}
			backtracking(result, list, s.substring(i+1, s.length()));
			list.remove(list.size()-1);
		}
		
	}
	public boolean judgeHuiWen(String str) {
		int left = 0;
		int right = str.length()-1;
		while(left<right) {
			if(str.charAt(left)!=str.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
}
