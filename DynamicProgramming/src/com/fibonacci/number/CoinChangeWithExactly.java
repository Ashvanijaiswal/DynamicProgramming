package com.fibonacci.number;
//  Problem: find total number of ways to change n with exactly t coins.
//  F(i,t) is objective function.
//  F(i,t) is the total number of ways to change i with exactly t coins.
//  Base cases: F[0,0]=1 , because we can acheive 0  with exactly 0 coin.
	// F(i,0)=0 
//	F(i,1)=1 . We need to think on it
//	------- if i is the denominations then it will be 1 other wise it will be zero because we will not get it using 1 coin only.
//  F(i,t)=F(i-1,t-1)+F(i-2,t-1)+F(i-3,t-1)+F(i-5,t-1)
public class CoinChangeWithExactly {

	public static void main(String[] args) {
		int num=0;
		int exactly=0;
		int dp[][]=new int[num+1][exactly+1];
		dp[0][0]=1;
		int coins[]=new int[4];
		coins[0]=1;
		coins[1]=2;
		coins[2]=3;
		coins[3]=5;
		int res=numberOfWays(num,dp,coins,exactly);
		System.out.println(res);
		// TODO Auto-generated method stub

	}

	private static int numberOfWays(int num, int[][] dp, int[] coins,int t) {
		// TODO Auto-generated method stub
		for(int i=0;i<=num;i++)
		{
			for(int j=0;j<=t;j++)
			{
				for(int coin:coins)
				{
					if(i-coin>=0 && j>=1)
					{
						dp[i][j]=dp[i][j]+dp[i-coin][j-1];
					}
				}
			}
		}
		
		return dp[num][t];
	}

}
