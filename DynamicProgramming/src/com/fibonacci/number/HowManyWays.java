package com.fibonacci.number;

import java.util.Arrays;

public class HowManyWays {

	public static void main(String[] args) {
		int n=30;
		boolean []arr=new boolean[n+1];
		Arrays.fill(arr, true);
		arr[0]=false;
		arr[1]=false;
		printPrime(n,arr);
		for(int i=0;i<=n;i++)
		System.out.println(i+" is prime ? "+arr[i]);
		
	}

	private static void printPrime(int n,boolean[] arr) {
		for(int i=2;i*i<=n;i++)
		{
			for(int j=2*i;j<=n;j+=i)
			{
				arr[j]=false;
			}
			
		}
		// TODO Auto-generated method stub
		
	}
}
