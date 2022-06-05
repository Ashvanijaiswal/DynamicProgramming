package com.fibonacci.number;

public class StairCaseProblem {
//	Note:- F(i) - is number of distinct ways to reach at stair ith
//	Person can climb either 1 stair or 2 stair at a time.
	public static void main(String[] args) {
		int res=numOfWays(4);
		System.out.println(res);
		int k=4;
		System.out.println(numOfWays(5,3 ));
		boolean redStairs[]= {false,true,false,true,true,false,false};
		System.out.println(numOfWays(6, 3, redStairs));
		// TODO Auto-generated method stub

	}

	private static int numOfWays(int i) {
		int []F=new int[i+1];
		F[0]=1;
		F[1]=1;
		for(int k=2;k<=i;k++)
		{
			F[k]=F[k-1]+F[k-2];
		}
		// TODO Auto-generated method stub
		return F[i];
	}
	
	private static int numOfWays(int i,int s) {
		int []F=new int[i+1];
		F[0]=1;
		F[1]=1;
		for(int k=2;k<=i;k++)
		{
			for(int j=1;j<=s;j++)
			{
				if(k-j<0)
				{
					continue;
				}
				F[k]=F[k]+F[k-j];
			}
		}
		// TODO Auto-generated method stub
		return F[i];
	}
	
	
	private static int numOfWays(int i,int s,boolean []redStairs) {
		int []F=new int[i+1];
		F[0]=1;
		F[1]=1;
		for(int k=2;k<=i;k++)
		{
			for(int j=1;j<=s;j++)
			{
				if(k-j<0)
				{
					continue;
				}
				if(redStairs[k-1])
				{
					F[k]=0;
				}
				else
				F[k]=F[k]+F[k-j];
			}
		}
		// TODO Auto-generated method stub
		return F[i];
	}
	
}
