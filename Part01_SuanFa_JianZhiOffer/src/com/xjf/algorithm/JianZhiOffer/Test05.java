package com.xjf.algorithm.JianZhiOffer;
//�滻�ո�:�ַ���
//��ʵ��һ����������һ���ַ����е�ÿ���ո��滻�ɡ�%20����
//���磬���ַ���ΪWe Are Happy,
//�򾭹��滻֮����ַ���ΪWe%20Are%20Happy��

/*public class Solution {
    public String replaceSpace(StringBuffer str) {
    	
    }
}*/


/**
 * string��replace�������Խ����е�ĳ���ַ��滻Ϊָ���ַ�����stringbuffer���� �ַ�������֮��Ҫע������λ�ú��ַ��������ǻ�仯��
 */
public class Test05 {
	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("app le e");
		String str1 = replaceSpace(str);
		System.out.println(str1);
	}

	public static String replaceSpace(StringBuffer str) {
		int length = str.length();
		for (int i = 0; i < length; i++) {
			if (str.charAt(i) == ' ') {
				str.insert(i, "%20");
				length = length + 3;
				i = i + 3;
			}
		}
		return str.toString().replace(" ", "");
	}

}
