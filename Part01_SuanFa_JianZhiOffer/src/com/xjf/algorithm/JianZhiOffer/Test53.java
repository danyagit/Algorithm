package com.xjf.algorithm.JianZhiOffer;

//统计一个数字在升序数组中出现的次数。
//[1,2,3,3,3,3,4,5],3-->输出4
/**
 * 二分法
 * @author xjf
 *
 */

public class Test53 {

	public static void main(String[] args) {

	}

	public int GetNumberOfK(int[] array, int k) {
		if(array==null||array.length==0) {
			return 0;
		}
		if(array.length==1&&array[0]==k) {
			return 1;
		}
		int i = 0;
		int j = array.length - 1;
		int index=-1,cnt=1;

		while (j - i > 1) {
			if (array[(i + j) / 2] > k) {
				j = (i + j) / 2;
			} else if (array[(i + j) / 2] < k) {
				i = (i + j) / 2;
			}else {
				index= (i + j) / 2;
				break;
			}
		}
		if(index==-1) {
			return 0;
		}
		for(int m=index+1;m<array.length&&array[m]==k;m++) {
			cnt++;
		}
		for(int m=index-1;m>=0&&array[m]==k;m--) {
			cnt++;
		}
		return cnt;
	}

}
