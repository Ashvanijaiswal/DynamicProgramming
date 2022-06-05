package com.sum.of.subarray.memorization;

public class Algorithm {
	private int[]array;
	private int numOfElement;
	private int SUM;
	private boolean dp[][];
	public Algorithm(int[] array,int numOfElement,int SUM) {
		this.array=array;
		this.numOfElement=numOfElement;
		this.SUM=SUM;
		dp=new boolean[numOfElement+1][SUM+1];
		// TODO Auto-generated constructor stub
	}
	public void solveSum(int[]array,int sum,int numOfElement)
	{
		for(int i=0;i<numOfElement+1;i++)
			dp[i][0]=true;
		//System.out.println("Hello");
		for(int item=1;item<numOfElement+1;item++)
		{
			for(int w=1;w<sum+1;w++)
			{
				if(array[item-1]>w)
				{  
					dp[item][w]=dp[item-1][w];
					//System.out.println("Hello1");
				}
				else if(dp[item-1][w]==true) {
					dp[item][w]=true;
					//System.out.println("Hello2");
					}
				else
				{
					dp[item][w]=dp[item-1][w-array[item-1]];
					//System.out.println("Hello3 "+item);
				}
			}
		}
		System.out.println(dp[numOfElement][sum]);
	}
	
	public void showElement()
	{
		for(int i=numOfElement;i>0;i--)
		{
			if(dp[i][SUM]==dp[i-1][SUM])
			{
				continue;
			}
			System.out.println("elements includes "+array[i-1]);
			SUM-=array[i-1];
				
		}
	}
}
