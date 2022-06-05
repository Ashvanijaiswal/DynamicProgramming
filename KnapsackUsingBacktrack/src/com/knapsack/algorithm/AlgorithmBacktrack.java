package com.knapsack.algorithm;

public class AlgorithmBacktrack {
	private int Capacity;
	private int totalBenifit;
	private int numOfItems;
	private int[][]knapsackTable;
	private int [] values;
	private int[]weights;
	
	public AlgorithmBacktrack(int Capacity,int totalBenifits,int numOfItems,int[] values,int [] weights) {
		// TODO Auto-generated constructor stub
		this.Capacity=Capacity;
		this.totalBenifit=totalBenifits;
		this.numOfItems=numOfItems;
		this.values=values;
		this.weights=weights;
	}
	public void solve()
	{
		int max=maxSum(values,weights,numOfItems,Capacity);
		System.out.println(max);
	}
	private int maxSum(int[] values2, int[] weights2, int numOfItems2, int capacity2) {
		// TODO Auto-generated method stub
		if(numOfItems2==0 || Capacity==0)
			return 0;
		if(weights[numOfItems2-1]>capacity2)
			return maxSum(values2, weights2, numOfItems2-1, capacity2);
		
		int included=values[numOfItems2-1]+maxSum(values2, weights2, numOfItems2-1, capacity2-weights2[numOfItems2-1]);
		int excluded=maxSum(values2, weights2, numOfItems2-1, capacity2);
		return Math.max(included, excluded);
////			values[0]=12;
//		values[1]=3;
//		values[2]=5;
//		values[3]=6;
//		
//		weights[0]=6;
//		weights[1]=2;
//		weights[2]=4;
//		weights[3]=3;
////		int capacity=14;	
		
	}
}
