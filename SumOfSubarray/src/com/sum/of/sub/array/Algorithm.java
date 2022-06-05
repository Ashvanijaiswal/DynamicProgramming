package com.sum.of.sub.array;

import javax.xml.ws.WebEndpoint;

public class Algorithm {

	private int[]array;
	private int numOfElement;
	private int SUM;
	public Algorithm(int[] array,int numOfElement,int SUM) {
		this.array=array;
		this.numOfElement=numOfElement;
		this.SUM=SUM;
		// TODO Auto-generated constructor stub
	}
	public void solve()
	{
		if(isSolve(array,SUM,numOfElement,0))
		{
			System.out.println("true");
			
		}
		else
		{
			System.out.println("false");
		}
	}
	private boolean isSolve(int[] array2, int M, int numOfElement2,int w) {
		// TODO Auto-generated method stub
		if(w==M ||M==0)
			return true;
		if(numOfElement2==0)
		{
			return false;
		}
		//if not includes
		if(isSolve(array2,M,numOfElement2-1,w))
		{
			return true;
		}
		//include
		if(isSolve(array2,M,numOfElement2-1,w+array2[numOfElement2-1]))
		{
			
			return true;
		}
		return false;
	}
}
