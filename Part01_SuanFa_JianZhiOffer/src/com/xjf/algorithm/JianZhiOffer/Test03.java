package com.xjf.algorithm.JianZhiOffer;

//数组中重复的数字:数组
//在一个长度为n的数组里的所有数字都在0到n-1的范围内。
//数组中某些数字是重复的，但不知道有几个数字是重复的。
//也不知道每个数字重复几次。
//请找出数组中第一个重复的数字。
//例如，如果输入长度为7的数组{2,3,1,0,2,5,3}，
//那么对应的输出是第一个重复的数字2。
//返回描述：
//如果数组中有重复的数字，函数返回true，否则返回false。
//如果数组中有重复的数字，把重复的数字放到参数duplication[0]中。
//（ps:duplication已经初始化，可以直接赋值使用。）
/*public class Solution {
    // Parameters:
    //    numbers:     an array of integers
    //    length:      the length of array numbers
    //    duplication: (Output) the duplicated number in the array number,length of duplication array is 1,so using duplication[0] = ? in implementation;
    //                  Here duplication like pointor in C/C++, duplication[0] equal *duplication in C/C++
    //    这里要特别注意~返回任意重复的一个，赋值duplication[0]
    // Return value:       true if the input is valid, and there are some duplications in the array number
    //                     otherwise false
    public boolean duplicate(int numbers[],int length,int [] duplication) {
    
    }
}*/
public class Test03 {

	public static void main(String[] args) {
		int numbers[] = new int[] { 2, 3, 1, 0, 2, 5, 3 };
		int length = numbers.length;
		int duplication[] = new int[2];
		duplicate(numbers, length, duplication);
		for (int i : duplication) {
			System.out.println(i);
		}
	}
	//时间复杂度O(N)，空间复杂度O(1)
	 public static boolean duplicate(int numbers[],int length,int [] duplication) {
	        for(int i = 0;i<length;i++){
	            if(numbers[i]==i){
	                continue;
	            }
	            if(numbers[i]==numbers[numbers[i]]){
	                duplication[0]=numbers[i];
	                return true;
	            }
	            swap(numbers,numbers[i],i);
	        }
	        return false;
	        
	    }
	    
	    public static void swap(int[]numbers,int i,int j){
		int a = numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = a;
	}
	
	
//	public static boolean duplicate(int numbers[], int length, int[] duplication) {
//		if (numbers == null || length <= 0) {
//			return false;
//		}
//		// 创建一个标记数组，默认全为false
//		boolean mark[] = new boolean[length];
//
//		for (int i = 0; i < length; i++) {
//			// 遍历numbers,头一次遍历到，就把标记数组中的对应索引处的值改为true
//			if (mark[numbers[i]] == false) {
//				mark[numbers[i]] = true;
//			} else {
//				// 发现是true,说明之前遇到过，即为所求
//				duplication[0] = numbers[i];
//				return true;
//			}
//		}
//		return false;
//	}
}
