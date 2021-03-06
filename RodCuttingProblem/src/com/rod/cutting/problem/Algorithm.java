package com.rod.cutting.problem;

public class Algorithm {

//	private int[] pieces;
	private int rodLength;
	private int[] price;
	private int dpTable[][];
	
	public Algorithm(int[] price,int rodLength)
	{
		
		this.price=price;
		this.rodLength=rodLength;
		this.dpTable=new int[price.length+1][rodLength+1];
	}
	
	public void solve()
	{
		for(int i=1;i<price.length+1;i++)
		{
			for(int l=1;l<rodLength+1;l++)
			{
				//if not taking 
				int exclude=dpTable[i-1][l];
				//if taking piece
				int include=0;
				if(i>l)
				{
					include=dpTable[i-1][l];
				}
				else
				{
					include= price[i-1]+dpTable[i][l-i];
				}
				dpTable[i][l]=Math.max(include, exclude);
			}
		}
		System.out.println(dpTable[price.length][rodLength]);
	}
//	public void show()
//	{
//		for(int i=price.length;i>0;i--)
//		{
//			for(int j=rodLength;j>0;j--)
//			{
//				 if(dpTable[i][j]==dpTable[i-1][j])
//				 {
//					 continue;
//				 }
//				 
//				 rodLength-=
//			}
//		}
//	}
}
