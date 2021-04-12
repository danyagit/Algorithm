package com.xjf.algorithm.leetcode.suanfasixiang.sousuo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//复原IP地址
/**
 * 回溯，排列组合，类似backtracking01
 * @author xjf TODO 还不会
 *
 */
public class Backtracking02 {
	public static void main(String[] args) {
		Backtracking02 backtracking02 = new Backtracking02();
		String s = "101023";
		List<String> list = backtracking02.restoreIpAddresses(s);
		System.out.println(list);
	}

	public List<String> restoreIpAddresses(String s) {
		List<String> list = new ArrayList<>();
		if(s.length()>12) {
			return list;
		}
		char[] array = s.toCharArray();
		doRestore(new ArrayList<String>(),array,list);
		List<String> list1 = new ArrayList<>();
		for (String string : list) {
			if(judgeIsIp(string,s)) {
				String replace = string.replace(',', '.');
				list1.add(replace);
			}
		}
		return list1;
    }

	private void doRestore(ArrayList<String> curIp, char[] array, List<String> list) {
		if(curIp.size()==4) {
			StringBuilder sb = new StringBuilder();
			for (String string : curIp) {
				if(sb.length()!=0) {
					sb.append(","+string);	
				}else {
					sb.append(string);	
				}
			}
			list.add(sb.toString());
			return;
		}
		//遍历要排列组合的字符串
		for (int i = 0; i < array.length; i++) {
			String append = new String(Arrays.copyOfRange(array, 0, i+1));
			curIp.add(append);
			char[] right = Arrays.copyOfRange(array, i+1,array.length );
			doRestore(curIp, right, list);
			//剪枝(回溯！！)
			curIp.remove(curIp.size()-1);
			right=array;
		}
	}
	public boolean judgeIsIp(String str,String s) {
		if(str.length()!=s.length()+3) {
			return false;
		}
		String[] split = str.split(",");
		for (String string : split) {
			if(string.length()>1&&string.charAt(0)=='0') {
				return false;
			}
			if(Long.valueOf(string)>255) {
				return false;
			}
		}
		return true;
	}

}
