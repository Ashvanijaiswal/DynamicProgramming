package com.fibonacci.number;

public class SumOfProblem {

	private int x;
	private int n;
	private int root;
	private static int val;
	
	public SumOfProblem(int x,int n,int root)
	{
		this.x=x;
		this.n=n;
		this.root=root;
	}
	
	public void solve()
	{
		int count=sumOfPower(x,n,root,0,0);
		System.out.println(count);
	}

	public int sumOfPower(int x2, int n2, int root2, int c,int sum) {
		if(root2==-1)
		{
			return sum;
		}
//	System.out.println(sum);
		if(sum==x2)
		{
			val++;
			sum=0;
//			System.out.println(val);
		
		}
//		System.out.println("included");
		sumOfPower(x2, n2, root2-1, c, sum+(int)Math.pow(root2, n2)) ;
//		System.out.println("excluded");
		sumOfPower(x2, n2, root2-1, c, sum);
		
		
		// TODO Auto-generated method stub
		return val;
	}
}
