package com.knapsack.algorithm;

public class Algortithm {

	private int Capacity;
	private int totalBenifit;
	private int numOfItems;
	private int[][]knapsackTable;
	private int [] values;
	private int[]weights;
	
	public Algortithm(int Capacity,int totalBenifit,int numOfItems,int[]values,int[]weights)
	{
		this.Capacity=Capacity;
		this.totalBenifit=totalBenifit;
		this.numOfItems=numOfItems;
		this.values=values;
		this.weights=weights;
		knapsackTable=new int[numOfItems+1][Capacity+1];
	}
	
	public void solve()
	{
		for(int i=1;i<=numOfItems;i++)
		{
			for(int w=1;w<=Capacity;w++)
			{
				int notTakingItem=knapsackTable[i-1][w];
				int takingItem=0;
				if(weights[i]<=w)
				{
					 takingItem=values[i]+knapsackTable[i-1][w-weights[i]];
				}
			knapsackTable[i][w]=Math.max(notTakingItem,takingItem);	
			
			}
			
		}
		totalBenifit=knapsackTable[numOfItems][Capacity];
		showresult();
	}
	public void showresult()
	{
		System.out.println(totalBenifit);
		for(int n=numOfItems,w=Capacity;n>0;n--)
		{
			if(knapsackTable[n][w]!=0 && knapsackTable[n][w]!=knapsackTable[n-1][w])
			{
				System.out.println("The elements include "+n);
				w=w-weights[n];
			}
		}
	}
}
