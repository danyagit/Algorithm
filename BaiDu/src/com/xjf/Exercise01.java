package com.xjf;

public class Exercise01 {

	public static void main(String[] args) {
		Exercise01 exercise01 = new Exercise01();
		int[] candidates= {2,3,6,7};
		int change = exercise01.change(7, candidates);
		System.out.println(change);
	}
	//���ظ�ʹ�ã�����Ʒ��Ϊ��ѭ��
	//�ܽ᣺�������⣺
	//�����ظ�ʹ�ã���Ʒ�����棬���������棬����
	//���ظ�ʹ�ã���Ʒ�����棬���������棬����
	//�������뱳����˳�򣺱��������棬��Ʒ������
	//ע�⻭ͼ,���еĶ���newһ������Ϊtarget��С+1������
	public int change(int target, int[] candidates) {
		int[] dp = new int[target+1];
		dp[0]=1;
		for (int i = 0; i < candidates.length; i++) {
			for (int j = 0; j <= target; j++) {
				if(j>=candidates[i]) {
					dp[j]=dp[j]+dp[j-candidates[i]];
				}
			}
		}
		return dp[target];
	}
}
