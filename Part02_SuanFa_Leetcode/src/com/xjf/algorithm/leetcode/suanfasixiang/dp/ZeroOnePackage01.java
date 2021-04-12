package com.xjf.algorithm.leetcode.suanfasixiang.dp;

//�ָ�Ⱥ��Ӽ�
/**
 * ������0-1�������� 
 * ����ʲô��0-1�������⣺
 * https://www.jianshu.com/p/a66d5ce49df5
 * �����������ǣ���Ҫ����ǡ����װ����
 * �Ǿ��Ȱ�����װ����dp�����һ��Ԫ���ǲ��ǵ��ڱ�����С
 *
 */
public class ZeroOnePackage01 {

	public static void main(String[] args) {
		ZeroOnePackage01 zeroOnePackage01 = new ZeroOnePackage01();
		int[] nums = { 1, 2, 3, 4 };
		boolean canPartition = zeroOnePackage01.canPartition(nums);
		System.out.println(canPartition);
	}

	public boolean canPartition(int[] nums) {
		int sum = sumOfArray(nums);
		if (sum % 2 != 0) {
			return false;
		}
		// �������nums����ȡ���ɸ�Ԫ�أ����Ϊsum/2��˵������
		//���Կ���һ��������СΪ sum/2 �� 0-1 �������⡣
		int packageSize = sum / 2;
		//�Ľ�����,������Ʒ������Ϊdp��ֵ���Ժ�0-1�������ⶼ��������
		int dp[]=new int[packageSize+1];
		for (int i = 1; i < nums.length; i++) {
			int curNum=nums[i-1];
			for (int j = packageSize; j >=1; j--) {
				if(j>=curNum) {
					dp[j]=Math.max(dp[j], curNum+dp[j-curNum]);
				}
			}
		}
		if(dp[packageSize]==packageSize) {
			return true;
		}
		
		return false;
		
		//ԭ����
//		int dp[][] = new int[nums.length][packageSize];
//		for (int i = 0; i < packageSize; i++) {
//			if (i + 1 >= nums[0]) {
//				dp[0][i] = nums[0];
//			}
//		}//0-1��������ֻ��Ҫ��dp[i-1][j]������ͷ���Ǹ�Ԫ�ء�
//		
//		
//		for (int i = 1; i < nums.length; i++) {
//			for (int j = 0; j < packageSize; j++) {
//				if (j + 1 < nums[i]) {
//					dp[i][j] = dp[i - 1][j];
//				} else if (j + 1 == nums[i]) {
//					dp[i][j] = nums[i];
//				} else {
//					dp[i][j] = Math.max(dp[i - 1][j], nums[i] + dp[i - 1][j - nums[i]]);
//				}
//			}
//		}
//		if (dp[nums.length - 1][packageSize - 1] == packageSize) {
//			return true;
//		}
//
//		return false;
	}

	public int sumOfArray(int[] nums) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum = sum + nums[i];
		}
		return sum;
	}
}
