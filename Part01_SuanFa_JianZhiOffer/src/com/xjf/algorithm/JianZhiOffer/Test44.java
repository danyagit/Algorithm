package com.xjf.algorithm.JianZhiOffer;

//����������ĳһλ������
//������0123456789101112131415���ĸ�ʽ���л���һ���ַ������С�
//����������У���5λ�����±�0��ʼ��������5����13λ��1����19λ��4���ȵȡ�
//��дһ���������������nλ��Ӧ�����֡�
/**
 * ˼·����������ͨ��fun�����ҵ������ڼ�λ�����������棬���磺
 * һλ�����䣺0��9
 * ��λ�����䣺9��9+90*2
 * ��λ�����䣺9+90*2��9+90*2+900*3
 * ��λ�����䣺9+90*2+900*3��9+90*2+900*3+9000*4
 * fun���������ɸ�����n��ȷ��������iλ���������
 * ��������ͨ��n����һ��������Ҷ˵������iһ���������iλ�������ŵڼ������磺10���ڶ�λ������ĵ�һ��
 * ����ȷ��������ĵڼ�λ�����󣨱���11�ĵڶ�λ��n=13���󣩡�
 * @author xjf
 *
 */
public class Test44 {

	public static void main(String[] args) {
		Test44 test44 = new Test44();
		int digit = test44.findNthDigit(10000);
		System.out.println(digit);
	}
	public int findNthDigit(int n) {
		if(n/10<1) {
			return n;
		}
		//i��ʾ��λ��
//		int i=1;
//		�����������ҵ�i�ķ������ã�
//		while(true) {
//			if(n<range(i)) {
//				break;
//			}
//			i++;
//		}
		int i = fun(n);
		//����i��ʾn��iλ����Χ�����
		int b = n-range(i-1);
		//��b/i��iλ���ĵ�b%iλ
		int th1 =0;
		int th2 =0;
		if(b%i==0) {
			th1=b/i;
			th2=i;
		}else {
			th1=b/i+1;
			th2=b%i;
		}
		int num =(int) (Math.pow(10, i-1)+th1-1);
		return digit(num,th2);
    }
	//i��ʾ��λ���������ұ߽�(����)
	public int range(int i) {
		double range = 0;
		for(int j=1;j<=i;j++) {
			range = range+9*Math.pow(10, j-1)*j;
		}
		return (int) range;
	}
	//num�ĵ�orderλ
	public int digit(int num,int order) {
		int cnt=0;
		int num1=num;
		while(num>0) {
			num=num/10;
			cnt++;
		}
		int a=1;
		while(a<=cnt-order) {
			num1=num1/10;
			a++;
		}
		return num1%10;
	}
	public int fun(int num) {
		int cnt = 0;
		int j = 0;
		while (num > 0) {
			num = (int) (num - 9 * Math.pow(10, j) * (j + 1));
			j++;
			cnt++;
		}
		return cnt;
	}
	
}
