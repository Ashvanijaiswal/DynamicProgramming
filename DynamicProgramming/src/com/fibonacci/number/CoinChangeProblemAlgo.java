package com.fibonacci.number;

public class CoinChangeProblemAlgo {

	public static void main(String[] args) {
		int num=5;
		int res=numOfWaysToChange(num);
		System.out.println(res);
		int [] coins=new int[3];
		coins[0]=1;
		coins[1]=3;
		coins[2]=5;
		
		int ways=numberOfWaysToChange(num,coins);
		System.out.println(ways);
		
		// TODO Auto-generated method stub

	}
private static int numberOfWaysToChange(int num, int[] coins) {
	int dp[]=new int[num+1];
//	Base case
	dp[0]=1;
	
//	Transition function
//	F[n]=F[n-1]+F[n-3]+F[n-5]+F[n-10]+..upto k
//	Because we have coins of 1,3,5,10... k
	for(int i=1;i<=num;i++)
	{
//		As we need to handle edge cases hence sometimes n-3 n-5 and n-10 will become -ve location.
		for(int coin:coins)
		{
			if(i-coin>=0)
			dp[i]=dp[i]+dp[i-coin];
		}
	// TODO Auto-generated method stub
	
	}
	return dp[num];
}
	// 	F(i) is total number of ways to change i or to get i. same as stair case problem.
	private static int numOfWaysToChange(int num) {
		int dp[]=new int[num+1];
//		Base case
		dp[0]=1;
		
//		Transition function
//		F[n]=F[n-1]+F[n-3]+F[n-5]+F[n-10]
//		Because we have coins of 1,3,5,10
		for(int i=1;i<=num;i++)
		{
//			As we need to handle edge cases hence sometimes n-3 n-5 and n-10 will become -ve location.
			if(i>=1)
			{
				dp[i]+=dp[i-1];
			}
			if(i>=3)
			{
				dp[i]+=dp[i-3];
			}
			if(i>=5)
			{
				dp[i]+=dp[i-5];
			}
			if(i>=10)
			{
				dp[i]+=dp[i-10];
			}
		}
		// TODO Auto-generated method stub
		return dp[num];
	}

}
