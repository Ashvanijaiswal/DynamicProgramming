package com.fibonacci.number;

public class CoinChangeProblemTotalUniqWays {
 
//	Problem: Find the total number of unique ways to change of i 
//	F(i,t)- is the total number of ways to change i  when the last coin <= t
//	Base case:
//	F[0][0]=1
//	F[1][0]=0
//	F[0][1]=1
//	1 ,2 3,5,k
//	i>=2 F[i][2]=F[i-1][1]+F[i-2][2]
//	i>=3 F[i][3]=F[i-1][1]+F[i-2][2]+F[i-3][3]
//	i>=k F[i][k]=F[i-1][1]+F[i-2][2]+....F[i-k][k]
	public static void main(String[] args) {
		int num=75;
		int coins[]=new int[4];
		int dp[][]=new int[num+1][coins.length];
		dp[0][0]=1;
		dp[1][0]=0;
		dp[0][1]=1;
		
		
		coins[0]=1;
		coins[1]=2;
		coins[2]=3;
		coins[3]=5;
		
		for(int i=0;i<coins.length;i++)
		{
			dp[0][i]=1;
		}
		
		int res=numOfWays(num,coins,dp);
		System.out.println(res);
		
	}

private static int numOfWays(int num, int[] coins, int[][] dp) {
	for(int i=0;i<=num;i++)
	{
		if(i>=1)
		{
			dp[i][0]=dp[i-1][0];
			dp[i][1]=dp[i-1][0];
			dp[i][2]=dp[i-1][0];
			dp[i][3]=dp[i-1][0];
		}
		if(i>=2)
		{
			dp[i][1]+=dp[i-2][1];
			dp[i][2]+=dp[i-2][1];
			dp[i][3]+=dp[i-2][1];
		}
		
		if(i>=3)
		{
			
			dp[i][2]+=dp[i-3][2];
			dp[i][3]+=dp[i-3][2];
		}
		if(i>=5)
		{
			dp[i][3]+=dp[i-5][3];
		}
	}
	// TODO Auto-generated method stub
	return dp[num][coins.length-1];
}
}
