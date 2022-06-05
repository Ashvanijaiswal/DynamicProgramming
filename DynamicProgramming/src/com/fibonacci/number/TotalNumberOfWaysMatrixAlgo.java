package com.fibonacci.number;

public class TotalNumberOfWaysMatrixAlgo {
// Find number of ways to reach (0,0) to end of matrix(m,n)
//	1) find objective function 
//		F(i,j) where F(i,j) is total number of distinct path on position (i,j)
//	 2) find base case
//	3) Find transition function or recurrance relation
//		F(i,j)=F(i-1,j)+F(i,j-1)
//	4) Order of problem(Bottom-up or top-down)
//	5) location of answer
	public static void main(String[] args) {
		int m=3;
		int n=4;
		int[][] dp=new int[m][n];
		dp[0][0]=1;
		int totalWays=numOfuniqPath(n, m,dp);
		System.out.println(totalWays);
		// TODO Auto-generated method stub

	}

private static int numOfuniqPath(int n,int m,int[][] dp) {
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
			if(i>0 && j>0) {
			dp[i][j]=dp[i-1][j]+dp[i][j-1];
			}
			else if(i>0)
			{
				dp[i][j]=dp[i-1][j];
			}
			else if(j>0)
			{
				dp[i][j]=dp[i][j-1];
			}
			
		}
	}
	return dp[m-1][n-1];
	// TODO Auto-generated method stub
	
}

}
