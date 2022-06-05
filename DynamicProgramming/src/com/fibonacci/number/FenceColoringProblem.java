package com.fibonacci.number;

public class FenceColoringProblem {

	public static void main(String[] args) {
		int m=5;
		int[][]dp=new int[m+1][2];
		
		dp[1][0]=1;
		dp[1][1]=1;
		dp[2][0]=2;
		dp[2][1]=2;
		int res=numOfWays(dp,m);
		System.out.println(res);
		// TODO Auto-generated method stub

	}

	private static int numOfWays(int[][] dp, int m) {
		// TODO Auto-generated method stub
		for(int i=3;i<=m;i++)
		{
			for(int j=0;j<2;j++)
			{
				
				dp[i][j]=dp[i-1][1-j]+dp[i-2][1-j];
				
			}
		}
		return dp[m][1]+dp[m][0];
	}

}
