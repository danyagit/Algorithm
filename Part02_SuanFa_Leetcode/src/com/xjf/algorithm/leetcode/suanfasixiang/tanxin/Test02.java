package com.xjf.algorithm.leetcode.suanfasixiang.tanxin;

import java.util.Arrays;
import java.util.Comparator;

//���ص�����
//����һ������ļ��ϣ��ҵ���Ҫ�Ƴ��������С������ʹʣ�����以���ص���
//ע��:
//������Ϊ������յ����Ǵ���������㡣
//���� [1,2] �� [2,3] �ı߽��໥���Ӵ�������û���໥�ص���
//ʾ�� 1:
//����: [ [1,2], [2,3], [3,4], [1,3] ]
//���: 1
//����: �Ƴ� [1,3] ��ʣ�µ�����û���ص���

public class Test02 {

	public static void main(String[] args) {
//		int[][] a = {{1,2},{2,3},{3,4},{1,3}};
		int[][] a = {{1,2},{1,2},{1,2}};
		Test02 test02 = new Test02();
		int cnt = test02.eraseOverlapIntervals(a);
		System.out.println(cnt);
	}

	public int eraseOverlapIntervals(int[][] intervals) {
		//����x��������
		Arrays.sort(intervals,new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0]-o2[0];//1-2������
			}
		});
		int cnt=0;
		for (int i = 0; i < intervals.length-1; i++) {
			//���غ�
			if(intervals[i+1][0]-intervals[i][1]>=0) {
				continue;
			}
			//�غϣ�ɾ����һ�������
			if(intervals[i+1][0]-intervals[i][1]<0&&intervals[i+1][1]-intervals[i][1]>=0) {
				intervals[i+1][0]=intervals[i][0];
				intervals[i+1][1]=intervals[i][1];
				cnt++;
				continue;
			}
			//�غϣ�ɾ��ǰһ���������ø�ֵ�������
			if(intervals[i+1][0]-intervals[i][1]<0&&intervals[i+1][1]-intervals[i][1]<0) {
				cnt++;
				continue;
			}
		}
		return cnt;
	}
}
