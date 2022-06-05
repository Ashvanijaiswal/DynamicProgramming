package com.fibonacci.number;

import java.util.HashSet;
import java.util.Set;

public class StairCaseOptimization2 {

	public static void main(String[] args) {
		int []cost= {0,3,2,4,6,1,1,5,3};
		Set<Integer> h=minCost(8,cost);
		System.out.println(h);
		// TODO Auto-generated method stub

	}
//	Time Complexity- O(n)
//	Space complexity - O(n)
	private static HashSet<Integer> minCost(int n, int[] cost) {
		int F[]=new int[n+1];
		int from[]=new int[n+1];
		F[0]=0;
		F[1]=cost[1];
		from[0]=0;
		from[1]=0;
		
//		F[n]=min(F[n-1],F[n-2])+cost(n)
//		Where F[i] is the min cost to reach at i th stair.
		for(int i=2;i<=n;i++)
		{
			if(F[i-1]<F[i-2])
			{
				from[i]=i-1;
			}
			else
			{
				from[i]=i-2;
			}
			F[i]=Math.min(F[i-1], F[i-2])+cost[i];
		}
		
//		 Best ways to find path is to use stack data structure
//		Stack<Integer> st=new Stack<>();
//		for(int cur =n;cur>0;cur=from[cur])
//		{
//			st.push(cur);
//		}
		HashSet<Integer> h=new HashSet<>();
		for (int cur=n;cur>0;cur=from[cur])
		{
			System.out.println(cur);
			h.add(cur);
		}
		h.add(0);
		return h;
		// TODO Auto-generated method stub
	
	}

}
