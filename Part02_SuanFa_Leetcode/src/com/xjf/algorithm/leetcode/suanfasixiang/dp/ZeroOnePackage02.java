package com.xjf.algorithm.leetcode.suanfasixiang.dp;
//目标和
/**
 * 本题没采用dp算法，而是采用了DFS
 * @author xjf
 *
 */
public class ZeroOnePackage02 {

	public static void main(String[] args) {
		ZeroOnePackage02 zeroOnePackage02 = new ZeroOnePackage02();
		int[]nums= {1,1,1,1,1};
		int findTargetSumWays = zeroOnePackage02.findTargetSumWays(nums, 3);
		System.out.println(findTargetSumWays);
	}
	int cnt=0;
	public int findTargetSumWays(int[] nums, int S) {
		int curSum=0;
		int index=0;
		backtracking(nums,S,curSum,index);
		
		return cnt;
    }
	private void backtracking(int[] nums, int S, int curSum,int index) {
		if(index==nums.length) {
			if(curSum==S) {
				cnt++;
			}
			return;
		}
		//将数组分为正负两个，每次从正负中选一个，就是深度优先搜索
		for (int i = 0; i < 2; i++) {
			if(i==0) {
				curSum=curSum+nums[index];
				backtracking(nums, S, curSum,index+1);
				curSum=curSum-nums[index];//剪枝，回溯
			}
			else {
				curSum=curSum-nums[index];
				backtracking(nums, S, curSum,index+1);
				curSum=curSum+nums[index];//剪枝，回溯
			}
		}
	}
}
