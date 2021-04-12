package com.xjf;

public class Exercise01 {

	public static void main(String[] args) {
		Exercise01 exercise01 = new Exercise01();
		int[] candidates= {2,3,6,7};
		int change = exercise01.change(7, candidates);
		System.out.println(change);
	}
	//可重复使用，将物品作为外循环
	//总结：背包问题：
	//不可重复使用：物品在外面，背包在里面，倒序
	//可重复使用：物品在外面，背包在里面，正序
	//讲究插入背包的顺序：背包在外面，物品在里面
	//注意画图,所有的都是new一个长度为target大小+1的数组
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
