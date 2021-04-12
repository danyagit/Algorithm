package com.xjf.algorithm.leetcode.suanfasixiang.dp;

import java.util.Arrays;
import java.util.Comparator;

//�������
public class ZuiChangDiZeng02 {

	public static void main(String[] args) {
		ZuiChangDiZeng02 zuiChangDiZeng02 = new ZuiChangDiZeng02();
		int[][] pairs= {{-10,-8},{8,9},{-5,0},{6,10},{-6,-4},{1,7},{9,10},{-4,7}};
		int longestChain = zuiChangDiZeng02.findLongestChain(pairs);
		System.out.println(longestChain);
	}
/**
 * dp[i]�������Ժ�ģ���i��Ԫ�ؽ�β�ĵ������еĳ��ȣ����Բ��������ģ�
 * ������������,ֻ�Ƕ���һ������
 */
	public int findLongestChain(int[][] pairs) {
		Arrays.sort(pairs,new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0]-o2[0];
			}
		});
		int dp[]=new int[pairs.length];
		int max=0;
		dp[0]=1;
		for (int i = 1; i < pairs.length; i++) {
			dp[i]=1;
			//���preMaxָ���ǣ�i֮ǰ�ģ�����������С��i�������Ԫ�أ�������dp[]���ġ�
			//premax������һ���curMax
			int preMax=0;
			for (int j = 0; j < i; j++) {
				if(pairs[i][0]>pairs[j][1]) {
					if(dp[j]>preMax) {
						preMax=dp[j];
					}
				}
			}
			dp[i]=preMax+1;
			if(dp[i]>max) {
				max=dp[i];
			}
		}
		return max;
	}
}
