package com.xjf.algorithm.JianZhiOffer;

//�ַ����е�һ�����ظ����ַ�:��Test50��һ����
//��ʵ��һ�����������ҳ��ַ����е�һ��ֻ����һ�ε��ַ���
//���磬�����ַ�����ֻ����ǰ�����ַ�"go"ʱ��
//��һ��ֻ����һ�ε��ַ���"g"��
//���Ӹ��ַ����ж���ǰ�����ַ���google"ʱ����һ��ֻ����һ�ε��ַ���"l"��
//ע�⣺�����ǰ�ַ���û�д��ڳ���һ�ε��ַ�������#�ַ���
/**
 * TODO �����ʱ�临�Ӷȣ��ö���
 * @author xjf
 *
 */

public class Test41_2 {

	public static void main(String[] args) {

	}
	StringBuffer str =new StringBuffer();
	public void Insert(char ch){
        str.append(ch);
    }
	//return the first appearence once char in current stringstream
    public char FirstAppearingOnce() {
    	String str1 = new String(str);
    	char[] array = str1.toCharArray();
        for(int i =0;i<array.length;i++) {
        	for(int j =0;j<array.length;j++) {
        		if(array[j]==array[i]&&i!=j) {
        			break;
        		}
        		if(j==array.length-1) {
        			return array[i];
        		}
        	}
        }
		return '#';
    }

}
