package com.xjf.algorithm.leetcode.suanfasixiang.dp;
//��ҽ��� II
public class FeiBoNaQi03 {
	public static void main(String[] args) {
		int[]nums= {4,1,2,7,5,3,1};
		FeiBoNaQi03 feiBoNaQi03 = new FeiBoNaQi03();
		int rob = feiBoNaQi03.rob(nums);
		System.out.println(rob);
	}

	public int rob(int[] nums) {
		if(nums==null||nums.length==0) {
			return 0;
		}
		if(nums.length==1) {
			return nums[0];
		}
		if(nums.length==2) {
			return Math.max(nums[0], nums[1]);
		}
		if(nums.length==3) {
			return Math.max(Math.max(nums[0], nums[1]), nums[2]);
		}
		
		//����ٵ�һ�䷿
		int dp[]=new int[nums.length];
		dp[0]=0;
		dp[1]=nums[1];
		dp[2]=nums[2];
		dp[3]=nums[1]+nums[3];
		for (int i = 4; i < dp.length; i++) {
			dp[i]=Math.max(dp[i-2]+nums[i], dp[i-3]+nums[i]);
		}
		int withoutFirst= Math.max(dp[dp.length-1], dp[dp.length-2]);//���һλ���Բ���Ƚ�
		
		//��ٵ�һ�䷿
		dp[0]=nums[0];
		dp[1]=0;
		dp[2]=nums[0]+nums[2];
		dp[3]=nums[0]+nums[3];
		for (int i = 4; i < dp.length-1; i++) {
			dp[i]=Math.max(dp[i-2]+nums[i], dp[i-3]+nums[i]);
		}
		int withFirst= Math.max(dp[dp.length-2], dp[dp.length-3]);//���һλ�����룬ֻ�Ƚϵ����ڶ�����λ
		return Math.max(withoutFirst, withFirst);
	}
}
