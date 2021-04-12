package com.xjf.suanfa;

public class ErFen {

	public static void main(String[] args) {
		ErFen erFen = new ErFen();
		int mySqrt = erFen.mySqrt(5);
		System.out.println(mySqrt);
	}

	public int mySqrt(int x) {
		if(x<=1) {
			return x;
		}
		int left = 1;
		int right = x;
		int mid;
		while(right>=left) {
			mid = left+(right-left)/2;
			if(mid<x/mid) {
				left=mid+1;
			}else if(mid==x/mid) {
				return mid;
			}else {
				right = mid-1;
			}
		}
		if(right*right>x) {
			return right-1;
		}
		return right;
	}
}
