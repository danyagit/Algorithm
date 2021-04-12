package com.xjf;

public class EF {

	public static void main(String[] args) {
		//e-f的差值最大
		String str = "abceeffeeffeeeeee";
		String substring = EF.getSubstring(str);
		System.out.println(substring);
		
	}
	public static String getSubstring(String str){
		char[] array = str.toCharArray();
		//dp[i]表示第index为i结尾的字符最大差值
		int dp[] = new int[array.length];
		if(array[0]=='e') {
			dp[0]=1;
		}else if(array[0]=='f') {
			dp[0]=-1;
		}else {
			dp[0]=0;
		}
		for (int i = 1; i < dp.length; i++) {
			if(array[i]=='e') {
				dp[i]=dp[i-1]<0 ? 1:dp[i-1]+1;
			}else if(array[i]=='f') {
				dp[i]=dp[i-1]<0 ? -1:dp[i-1]-1;
			}else {
				dp[i]=dp[i-1]<0 ? 0:dp[i-1];
			}
		}
		
		return null;
	}
	
	
}
