package com.xjf.algorithm.leetcode.shujujiegou.zifuchuan;
//8. �ж�һ�������Ƿ��ǻ�����
/**
 * ����һ��ת��Ϊ�ַ���
 * ����������ʹ�ö���Ŀռ䣬ֱ�Ӵ�������
 * @author xjf
 *
 */
public class Exercise08 {

	public static void main(String[] args) {

	}
	public boolean isPalindrome(int x) {
		if(x<0) {
			return false;
		}
		char[] str = String.valueOf(x).toCharArray();
		if(str.length%2==0) {
			return judge(str.length/2-1,str.length/2,str);
		}else {
			return judge(str.length/2,str.length/2,str);
		}
    }
	private boolean judge(int i, int j, char[] str) {
		while(i>=0&&j<=str.length-1) {
			if(str[i]!=str[j]) {
				return false;
			}
			i--;
			j++;
		}
		return true;
	}
	//������
	public boolean isPalindrome02(int x) {
	    if (x == 0) {
	        return true;
	    }
	    if (x < 0 || x % 10 == 0) {
	        return false;
	    }
	    int right = 0;//ֻ��Ҫ��һ������Ŀռ�
	    //�������ұ߿�ʼ��������Ϊ�����ĸ�λ����һ�뼴��
	    while (x > right) {
	        right = right * 10 + x % 10;
	        x /= 10;
	    }
	    return x == right || x == right / 10;
	}
}
