package com.xjf.algorithm.JianZhiOffer;

import java.util.Arrays;

//��ת����˳����:˫ָ��
//ţ���������һ����Ա��Fish��
//ÿ���糿���ǻ�����һ��Ӣ����־��дЩ�����ڱ����ϡ�
//ͬ��Cat��Fishд�������ĸ���Ȥ����һ������Fish����������
//��ȴ������������˼�����磬��student. a am I����
//��������ʶ������һ�ԭ���Ѿ��ӵ��ʵ�˳��ת�ˣ�
//��ȷ�ľ���Ӧ���ǡ�I am a student.����
//Cat��һһ�ķ�ת��Щ����˳��ɲ����У����ܰ�����ô��
public class Test58_1 {

	public static void main(String[] args) {
		Test58_1 test = new Test58_1();
		String str = test.ReverseSentence("I am student.");
		System.out.println(str);
	}
	StringBuffer sb=new StringBuffer();
	public String ReverseSentence(String str) {
		char[] array = str.toCharArray();
		int right = array.length - 1;
		int left = right;
		while (right >= 0) {
			if(left==0) {
				char[] array2 = Arrays.copyOfRange(array, left, right+1);
				String str2 = new String(array2);
				sb.append(str2);
				return sb.toString();
			}
			if (array[left] == ' ') {
				char[] array1 = Arrays.copyOfRange(array, left+1, right+1);
				String str1 = new String(array1);
				sb.append(str1);
				sb.append(" ");
				right=left-1;
				left=left-1;
			}else {
				left=left-1;
			}
		}
		return sb.toString();
	}

}
