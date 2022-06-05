package com.fibonacci.number;
//Problem: find total number of ways to change n with no more than t coins.
//F(i,t) is objective function.
//F(i,t) is the total number of ways to change i with no more than t coins.
//Base cases: F[0,0]=1 , because we can achieve 0  with no more than 0 coin.
// F(i,0)=0 
//F(i,1)=1 . We need to think on it
// F(0,i)=1 . We can get change of 0 with no more than i coins.exactly same as F(0,0)
//F(i,t)=F(i-1,t-1)+F(i-2,t-1)+F(i-3,t-1)+F(i-5,t-1)
public class CoinChangeNoMoreThan {

	public static void main(String[] args) {
		int num=4;
		int noMoreThan=3;
		int dp[][]=new int[num+1][noMoreThan+1];
		dp[0][0]=1;
		int coins[]=new int[4];
		coins[0]=1;
		coins[1]=2;
		coins[2]=3;
		coins[3]=5;
		int res=numberOfWays(num,dp,coins,noMoreThan);
		System.out.println(res);
		// TODO Auto-generated method stub

	}

	private static int numberOfWays(int num, int[][] dp, int[] coins,int t) {
		// TODO Auto-generated method stub
		for(int i=0;i<=num;i++)
		{
			for(int j=0;j<=t;j++)
			{
				if(i==0 && j>0)
				{
					dp[i][j]=1;
				}
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
