package com.fibonacci.number;

import java.util.HashSet;

public class StairCaseOptimization {

	public static void main(String[] args) {
		int []cost= {0,3,2,4,6,1,1,5,3};
		int res=minCost(8,cost);
		System.out.println(res);
		// TODO Auto-generated method stub

	}
//	Time Complexity- O(n)
//	Space complexity - O(n)
	private static int minCost(int n, int[] cost) {
		int F[]=new int[n+1];
		HashSet<Integer> h=new HashSet<>();
		F[0]=0;
		F[1]=cost[1];
		h.add(0);
		
//		F[n]=min(F[n-1],F[n-2])+cost(n)
//		Where F[i] is the min cost to reach at i th stair.
		for(int i=2;i<=n;i++)
		{
			if(F[i-1]<F[i-2])
			{
				h.add(i-1);
			}
			else
			{
				h.add(i-2);
			}
			F[i]=Math.min(F[i-1], F[i-2])+cost[i];
		}
		h.add(n);
		System.out.println(h);
		
		return F[n];
		// TODO Auto-generated method stub
	
	}

}
