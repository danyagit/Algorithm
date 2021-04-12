package com.xjf.algorithm.leetcode.suanfasixiang.sousuo;

import java.util.ArrayList;

//279. ��ȫƽ����
//���������� n���ҵ����ɸ���ȫƽ���������� 1, 4, 9, 16, ...��
//ʹ�����ǵĺ͵��� n������Ҫ����ɺ͵���ȫƽ�����ĸ������١�
//
//ʾ�� 1:
//
//����: n = 12
//���: 3 
//����: 12 = 4 + 4 + 4.
//ʾ�� 2:
//
//����: n = 13
//���: 2
//����: 13 = 4 + 9.
/**
 * ѡ���˶�̬�滮
 * @author xjf
 *
 */
public class BFS02 {

	public static void main(String[] args) {
		BFS02 bfs02 = new BFS02();
		int numSquares = bfs02.numSquares(48);
		System.out.println(numSquares);
	}

	// ��̬�滮��dp[n]Ϊ����
	public int numSquares(int n) {
		int dp[] = new int[n + 1];
		dp[0] = 0;
		dp[1] = 1;
		//������ȫƽ����
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		for (int i = 2; i <= n; i++) {
			if (judgeSquare(i)) {
				list.add(i);
				dp[i] = 1;
			} else {
				//����ǰ�����е���ȫƽ����
				if (i > 4) {
					int min=Integer.MAX_VALUE;
					for (int j=0;j<list.size();j++) {
						int cur =dp[i-list.get(j)]+1;
						if(cur<min) {
							min=cur;
						}
					}
					dp[i] = min;
				} else {
					dp[i] = dp[i - 1] + 1;
				}
			}
		}
		return dp[n];
	}

	// �ж�i�Ƿ�Ϊ��ȫƽ����
	private boolean judgeSquare(int i) {
		int a = (int) Math.pow(i, 0.5);
		if (a * a == i) {
			return true;
		}
		return false;
	}

}
