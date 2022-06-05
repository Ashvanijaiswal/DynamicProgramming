package com.fibonacci.number;

public class SumOfNumber {

	public static void main(String[] args) {
		int res=sumOfNum(187);
		System.out.println(res);
		// TODO Auto-generated method stub

	}
// Bottom-up forward approch
	private static int sumOfNum(int i) {
		int dp[]=new int[i+1];
		dp[1]=1;
		for(int k=2;k<=i;k++)
		{
			dp[k]=dp[k-1]+k;
		}
		return dp[i];
	
	}

//	Bottom -up backward approch
//	private static int sumOfNumback(int i) {
//		int dp[]=new int[i+1];
//		dp[1]=1;
//		for(int k=1;k<=i;k++)
//		{
//			dp[k+1]=dp[k+1]+k;
//			
//		}
//		return dp[i];
	
//	}
}
