package com.xjf.algorithm.JianZhiOffer;

//�������ظ�������:����
//��һ������Ϊn����������������ֶ���0��n-1�ķ�Χ�ڡ�
//������ĳЩ�������ظ��ģ�����֪���м����������ظ��ġ�
//Ҳ��֪��ÿ�������ظ����Ρ�
//���ҳ������е�һ���ظ������֡�
//���磬������볤��Ϊ7������{2,3,1,0,2,5,3}��
//��ô��Ӧ������ǵ�һ���ظ�������2��
//����������
//������������ظ������֣���������true�����򷵻�false��
//������������ظ������֣����ظ������ַŵ�����duplication[0]�С�
//��ps:duplication�Ѿ���ʼ��������ֱ�Ӹ�ֵʹ�á���
/*public class Solution {
    // Parameters:
    //    numbers:     an array of integers
    //    length:      the length of array numbers
    //    duplication: (Output) the duplicated number in the array number,length of duplication array is 1,so using duplication[0] = ? in implementation;
    //                  Here duplication like pointor in C/C++, duplication[0] equal *duplication in C/C++
    //    ����Ҫ�ر�ע��~���������ظ���һ������ֵduplication[0]
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
	//ʱ�临�Ӷ�O(N)���ռ临�Ӷ�O(1)
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
//		// ����һ��������飬Ĭ��ȫΪfalse
//		boolean mark[] = new boolean[length];
//
//		for (int i = 0; i < length; i++) {
//			// ����numbers,ͷһ�α��������Ͱѱ�������еĶ�Ӧ��������ֵ��Ϊtrue
//			if (mark[numbers[i]] == false) {
//				mark[numbers[i]] = true;
//			} else {
//				// ������true,˵��֮ǰ����������Ϊ����
//				duplication[0] = numbers[i];
//				return true;
//			}
//		}
//		return false;
//	}
}
