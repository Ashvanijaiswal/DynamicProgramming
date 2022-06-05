package com.fibonacci.number;

import java.util.Arrays;

public class CoinChangeWithMinCoin {

//	Problem:- Find number of ways to change n with min number of coin.
//	F(i) is the min number of coins to change make of i
//	1,3,5
//	Base case- F(0)=0
//	F(1)=1
//	F(i)=min(1+f(i-1),1+f(i-3),1+f(i-10))
	public static void main(String[] args) {
		int num=56;
		int coins[]= {15,3,4};
		int dp[]=new int[num+1];
		Arrays.fill(dp, Integer.MAX_VALUE);
		dp[0]=0;
		dp[1]=1;
		int res=numOfWays(num,dp,coins);
		System.out.println(res);
		// TODO Auto-generated method stub

	}

private static int numOfWays(int num, int[] dp, int[] coins) {

	for(int i=2;i<=num;i++)
	{
		for(int coin:coins)
		{
			if(i-coin<0 || 1+dp[i-coin]<0)
			{
				continue;
			}
			dp[i]=Math.min(dp[i], 1+dp[i-coin]);
		}
		
	}
	return dp[num];
}

}
