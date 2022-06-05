package com.fibonacci.number;

import java.util.Map;

public class FibonacciAlgorithm {

	public int fibonacciNumber(int n,int prev,int current)
	{
		if(n==1||n==0 || n==2) 
			return current;
		System.out.println("calling function f" +(n-1)+" "+current+ " "+(current+prev)+" ");
		int f= fibonacciNumber(n-1, current, prev+current);
		
		System.out.println(" calling function r" +(n-2)+" "+current+ " "+(current+prev)+" ");
		int r=fibonacciNumber(n-2, current, prev+current);
		System.out.println("//return");
		return f+r;
	}
	
	//Top Down approch (Memorization)
	
	public int fibNumTopDown(int n,Map<Integer,Integer> table)
	{
		if(!table.containsKey(n))
		{
			table.put(n,fibNumTopDown(n-1, table)+fibNumTopDown(n-2, table));
		}
		return table.get(n);
	}
	
	//Bottom Up Approch (Tabulation)
	
	public int fibonacciTabulation(int n,Map<Integer,Integer> table)
	{
		for(int i=2;i<=n;i++)
		{
			table.put(i, table.get(i-1)+table.get(i-2));
		}
		return table.get(n);
	}

	
}
