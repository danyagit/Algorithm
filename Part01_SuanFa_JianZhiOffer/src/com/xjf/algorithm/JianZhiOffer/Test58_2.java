package com.xjf.algorithm.JianZhiOffer;

//����ת�ַ���
//�����������һ����λָ�����ѭ�����ƣ�ROL���������и��򵥵�����
//�������ַ���ģ�����ָ���������������һ���������ַ�����S��
//�������ѭ������Kλ���������������磬�ַ�����S=��abcXYZdef��,
//Ҫ�����ѭ������3λ��Ľ��������XYZdefabc����
/**
 *TODO ˫ָ�룿
 * @author xjf
 *
 */
public class Test58_2 {

	public static void main(String[] args) {

	}

	public String LeftRotateString(String str, int n) {
		StringBuffer sb = new StringBuffer(str);
		if(str.length()<n) {
			return sb.toString();
		}
		String substring = sb.substring(0, n);
		sb.delete(0, n);
		sb.append(substring);
		return sb.toString();
	}
}
