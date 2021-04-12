package com.xjf.algorithm.leetcode.suanfasixiang.tanxin;
//������ĸ����

import java.util.ArrayList;
import java.util.List;

//�ַ��� S ��Сд��ĸ��ɡ�����Ҫ������ַ�������Ϊ�����ܶ��Ƭ�Σ�ͬһ��ĸ��������һ��Ƭ���С�����һ����ʾÿ���ַ���Ƭ�εĳ��ȵ��б�
//ʾ����
//���룺S = "ababcbacadefegdehijhklij"
//�����[9,7,8]
//���ͣ�
//���ֽ��Ϊ "ababcbaca", "defegde", "hijhklij"��
//ÿ����ĸ��������һ��Ƭ���С�
//�� "ababcbacadefegde", "hijhklij" �Ļ����Ǵ���ģ���Ϊ���ֵ�Ƭ�������١�

/**
 * 
 * @author xjf
 *
 */

public class Test11 {

	public static void main(String[] args) {
		Test11 test11 = new Test11();
		List<Integer> list = test11.partitionLabels("ababcbacadefegdehijhklij");
		System.out.println(list);
	}

	
	public List<Integer> partitionLabels(String S) {
		char[]array = S.toCharArray();
		List<Integer> list = new ArrayList<Integer>();
		int leftIndex=0;
		while(leftIndex<array.length) {
			int curmax=getLastCharIndex(array[leftIndex], array);
			int index=leftIndex;
			while(index<curmax) {
				index++;
				if(getLastCharIndex(array[index], array)>curmax) {
					curmax=getLastCharIndex(array[index], array);//�ı�ѭ���߽�
				}
			}
			list.add(curmax-leftIndex+1);
			leftIndex=curmax+1;
		}
		return list;
	}
	
	//���һ����ĸ������
	public int getLastCharIndex(char a,char[]array) {
		for (int i = array.length-1; i >=0; i--) {
			if(array[i]==a) {
				return i;
			}
		}
		return -1;
	}
	
}
