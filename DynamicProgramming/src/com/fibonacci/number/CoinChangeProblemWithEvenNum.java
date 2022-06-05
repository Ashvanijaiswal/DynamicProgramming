package com.fibonacci.number;


public class CoinChangeProblemWithEvenNum {
//	Problem: find total number of ways to change n with even number of coins.
//	F(i,j) is the objective function to chnage of i with even number of coins.
//		suppose j=1 even and j=0 is represent odd
//	Base cases:
//	F[0][0]=0, F[0][1]=1, F[1][0]=1, F[1][1]=0
//	1,3,5,10
//	f(i,j)=f(i-1,1-j)+f(i-3,1-j)+f(i-5,1-j)+f(i-10,1-j)     Transition function

	public static void main(String[] args) {
		int num=6;
		int dp[][]=new int[num+1][2];
		dp[0][0]=0;
		dp[0][1]=1;
		int coins[]=new int[4];
		coins[0]=1;
		coins[1]=3;
		coins[2]=5;
		coins[3]=10;
		int res=numOfWays(num,dp,coins);
		System.out.println(res);

	}

private static int numOfWays(int num, int[][] dp, int[] coins) {
	for(int i=0;i<=num;i++)
	{
		for(int j=0;j<2;j++)
		{
			for(int coin:coins)
			{
				if(i-coin>=0)
				dp[i][j]+=dp[i-coin][1-j];
			}
			
		}
		
	}
	// TODO Auto-generated method stub
	return dp[num][1];
}

}
