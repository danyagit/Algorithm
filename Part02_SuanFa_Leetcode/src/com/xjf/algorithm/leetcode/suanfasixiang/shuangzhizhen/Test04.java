package com.xjf.algorithm.leetcode.suanfasixiang.shuangzhizhen;

//��֤�����ַ��� ��
//����һ���ǿ��ַ��� s�����ɾ��һ���ַ���
//�ж��Ƿ��ܳ�Ϊ�����ַ�����
//����: "aba"
//���: True
//����: "abca"
//���: True
//����: �����ɾ��c�ַ���
public class Test04 {

	public static void main(String[] args) {

		Test04 test04 = new Test04();
		boolean a = test04.validPalindrome(
				"eccer");
		System.out.println(a);
	}
	int myleft = 0;
	int myright=0 ;
	public boolean validPalindrome(String s) {
		int left=0;
		int right = s.length()-1;
		if(!judge(s, left, right)) {
			String sub1 = s.substring(0, myleft)+s.substring(myleft+1, s.length());
			String sub2 = s.substring(0, myright)+s.substring(myright+1, s.length());
			return judge(sub1, 0, sub1.length()-1)||judge(sub2, 0, sub2.length()-1);
		} 
		return true;
	}

	public boolean judge(String s, int left, int right) {

		while (left < right) {
			if (s.charAt(left) == s.charAt(right)) {
				left++;
				right--;
				this.myleft=left;
				this.myright=right;
				continue;
			} else {
				this.myleft=left;
				this.myright=right;
				return false;
			}
		}
		return true;
	}

}
