package com.xjf.algorithm.JianZhiOffer;

import java.util.ArrayList;

/**
 * ˼·�������ڵ�һ��������Ԫ����ߵ�Ԫ��˳���ǲ��ܱ��
 * 12345
 * 45321����4��ߵ���123�������ǲ��Ǵ��ҵ���123��˳���м������м����
 * 
 * @author xjf
 *
 */
public class Test31 {
	public static void main(String[] args) {
		
	}

	public boolean IsPopOrder(int[] pushA, int[] popA) {
		ArrayList<Integer> list = new ArrayList<>();
		int length = pushA.length;
		int head = popA[0];
		int i = 0;
		if(length==1&&pushA[0]==popA[0]) {
			return true;
		}
		
		while (i < length) {
			if (pushA[i] == head) {
				break;
			}
			i++;
		}
		
		int j =i-1;
		while(j>=0) {
			list.add(pushA[j]);
			j--;
		}
		
		int listIndex=0;
		int popAIndex=0;
		while(listIndex<list.size()&&popAIndex<popA.length) {
			if(list.get(listIndex)==popA[popAIndex]) {
				listIndex++;
				popAIndex++;
				if(listIndex==list.size()) {
					return true;
				}
			}
			else {
				popAIndex++;
			}
		}
		return false;
	}
}
