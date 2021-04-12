package com.xjf.algorithm.JianZhiOffer;

//丑数
//把只包含质因子2、3和5的数称作丑数（Ugly Number）。
//例如6、8都是丑数，但14不是，因为它包含质因子7。 
//习惯上我们把1当做是第一个丑数。
//求按从小到大的顺序的第N个丑数。
/**
 * 动态规划 dp[i]表示第i+1个丑数
 * 
 * @author xjf
 *
 */
public class Test49 {

	public static void main(String[] args) {

	}

	public int GetUglyNumber_Solution(int index) {
		if (index == 0) {
			return 0;
		}
		int[] dp = new int[index];
		dp[0] = 1;
		int index2 = 0;
		int index3 = 0;
		int index5 = 0;
		for (int i = 1; i < dp.length; i++) {
			dp[i] = Math.min(Math.min(2 * dp[index2], 3 * dp[index3]), 5 * dp[index5]);
			if (dp[i] == 2 * dp[index2]) {
				index2++;
			}
			if (dp[i] == 3 * dp[index3]) {
				index3++;
			}
			if (dp[i] == 5 * dp[index5]) {
				index5++;
			}
		}
		return dp[index - 1];
	}
}
