package com.xjf.algorithm.leetcode.suanfasixiang.dp;
//��Ǯ�һ�
/**
 * ��ǰ���ⲻһ�����ǣ��������Ʒ�ǿ��ظ�ʹ�õģ�������ȫ�������⡣
 * ����������ķ����ǣ�����ǰ�����������Ʒ��Ϊ˳�������
 * 
 *��ͨ�ı�������ΪʲôҪ��������أ�
 *��Ϊ��ͨ�ı������������ǰ�������dp����ôdp��ǰ��������ܻ����Ⱥ��棬��Ϊ���������ֵ��ʱ��ǰ������ݾͲ������ˡ�
 *������������Ա�֤dp������ǰ�������������һ�ֵģ��ǿ����õġ�
 *
 *��ȫ��������ΪʲôҪ˳�������? TODO
 *
 */
public class ZeroOnePackage04 {

	public static void main(String[] args) {
		ZeroOnePackage04 zeroOnePackage04 = new ZeroOnePackage04();
		int[]coins= {1,2,5};
		int coinChange = zeroOnePackage04.coinChange(coins, 11);
		System.out.println(coinChange);
	}
	public int coinChange(int[] coins, int amount) {
	    if (amount == 0 || coins == null) return 0;
	    int[] dp = new int[amount + 1];
	    for (int coin : coins) {
	        for (int i = coin; i <= amount; i++) { //�����������Ϊ�������
	            if (i == coin) {
	                dp[i] = 1;
	            } else if (dp[i] == 0 && dp[i - coin] != 0) {
	                dp[i] = dp[i - coin] + 1;

	            } else if (dp[i - coin] != 0) {
	                dp[i] = Math.min(dp[i], dp[i - coin] + 1);
	            }
	        }
	    }
	    return dp[amount] == 0 ? -1 : dp[amount];
	}
}
