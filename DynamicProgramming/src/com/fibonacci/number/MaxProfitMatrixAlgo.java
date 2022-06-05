package com.fibonacci.number;

public class MaxProfitMatrixAlgo {

	// Find number of ways to reach (0,0) to end of matrix(m,n)
//	1) find objective function 
//		F(i,j) where F(i,j) is maximum sum on  position (i,j)
//	 2) find base case
//	3) Find transition function or recurrance relation
//		F(i,j)=max(F(i-1,j),F(i,j-1)+grid[i][j];
//		The best way to find transition function is to visualize from the destination how it can be achieved.
//		where grid[i][j] is cost for grid(i,j)
//	4) Order of problem(Bottom-up or top-down)
//	5) location of answer
	
	public static void main(String[] args) {
		int m=3;
		int n=4;
		int [][]problemMatrix= {    {0,2,2,1},
									{3,1,1,1},
									{4,4,2,3}
							   };
		int [][]dp=new int[m][n];
		dp[0][0]=0;
		int res=maxSum(problemMatrix,dp,m,n);
		System.out.println(res);
//		showPath(dp,m-1,n-1);
		// TODO Auto-generated method stub

	}

	
	private static int maxSum(int[][] problemMatrix, int[][] dp, int m, int n) {
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i>0 && j>0)
				{
					dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1])+problemMatrix[i][j];
				}
				else if(i>0)
				{
					dp[i][j]=dp[i-1][j]+problemMatrix[i][j];
				}
				else if(j>0)
				{
					dp[i][j]=dp[i][j-1]+problemMatrix[i][j];
				}
			}
		}
		
		
		
		
		// TODO Auto-generated method stub
		return dp[m-1][n-1];
	}

}
