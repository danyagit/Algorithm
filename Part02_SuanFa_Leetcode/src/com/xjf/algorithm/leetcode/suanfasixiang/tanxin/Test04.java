package com.xjf.algorithm.leetcode.suanfasixiang.tanxin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//��������ؽ����С�TODO ������ѣ��Խת��

//�����д���˳���һȺ��վ��һ�����С� ÿ������һ�������� (h, k) ��ʾ��
//���� h ������˵���ߣ�k ��Ӧ�����������ǰ������ߴ��ڻ���� h �������� 
//���磺[5,2] ��ʾǰ��Ӧ���� 2 ����ߴ��ڵ��� 5 ���ˣ�
//�� [5,0] ��ʾǰ�治Ӧ�ô�����ߴ��ڵ��� 5 ���ˡ�
//
//��дһ���㷨������ÿ���˵���� h �ؽ�������У�
//ʹ֮����ÿ�������� (h, k) �ж����� k ��Ҫ��
//
//ʾ����
//���룺[[7,0], [4,4], [7,1], [5,0], [6,1], [5,2]]
//�����[[5,0], [7,0], [5,2], [6,1], [4,4], [7,1]]
//��ʾ��
//���������� 1100 �ˡ�

public class Test04 {

	public static void main(String[] args) {
		Test04 test04 = new Test04();
		int[][] people = {{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}};
		test04.reconstructQueue(people);
	}

	public int[][] reconstructQueue(int[][] people) {
	    if (people == null || people.length == 0 || people[0].length == 0) {
	        return new int[0][0];
	    }
	    //���򣬰���߽���k����
	    Arrays.sort(people, (a, b) -> (a[0] == b[0] ? a[1] - b[1] : b[0] - a[0]));
	    List<int[]> queue = new ArrayList<>();
	    for (int[] p : people) {
	        queue.add(p[1], p);
	    }
	    return queue.toArray(new int[queue.size()][]);
	}
}
