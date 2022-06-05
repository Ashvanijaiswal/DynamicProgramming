package com.fibonacci.number;

public class TotalNumOfWaysMatrixWithObstacle {
	// Find number of ways to reach (0,0) to end of matrix(m,n)
//		1) find objective function 
//			F(i,j) where F(i,j) is total number of distinct path on position (i,j)
//		 2) find base case
//		3) Find transition function or recurrance relation
//			F(i,j)=F(i-1,j)+F(i,j-1)
//			Only change is we need to set total number of ways to zero for obstacle grids.rest of all are same as prev problem
//		4) Order of problem(Bottom-up or top-down)
//		5) location of answer
	
	public static void main(String[] args) {
		int m=3;
		int n=4;
		int [][]problemMatrix=new int[m][n];
//		Setting obstacles in problem  matrix
		problemMatrix[1][1]=1;
		problemMatrix[1][2]=1;
		problemMatrix[1][3]=1;
		
		int [][]dp=new int[m][n];
		dp[0][0]=1;
		int res=totalNumOfWays(problemMatrix,dp,m,n);
		System.out.println(res);
		
		
		
	}

	private static int totalNumOfWays(int[][] problemMatrix, int[][] dp, int m, int n) {
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(problemMatrix[i][j]==1)
				{
					continue;
				}
				if(i>0 && j>0)
				{
					dp[i][j]=dp[i-1][j]+dp[i][j-1];
				}
				else if(i>0 )
				{
					dp[i][j]=dp[i-1][j];
				}
				else if(j>0)
				{
					dp[i][j]=dp[i][j-1];
				}
			}
		}
		// TODO Auto-generated method stub
		return dp[m-1][n-1];
	}

}
