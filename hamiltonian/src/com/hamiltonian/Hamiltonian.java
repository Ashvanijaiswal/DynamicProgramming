package com.hamiltonian;

public class Hamiltonian {
	private int numOfVertex;
	private int[] hamiltonionPath;
	private int adjecentMatrix[][]; 
	
	public Hamiltonian(int [][]adjecentMatrix)
	{
		this.adjecentMatrix=adjecentMatrix;
		this.hamiltonionPath=new int[adjecentMatrix.length];
		this.numOfVertex=adjecentMatrix.length;
		this.hamiltonionPath[0]=0;
	}
	public void solve()
	{
		if(findFesibleSolution(1))
		{
			showHamiltonionPath();
			
		}
		else
		{
			System.out.println("No fesible solution found");
		}
	}
	
	private boolean findFesibleSolution(int position) {
		if(position==numOfVertex)
		{
			if(adjecentMatrix[hamiltonionPath[position-1]][0]==1)
				return true;
			else return false;
		}
		
		for(int vertexIndex=1;vertexIndex<numOfVertex;vertexIndex++)
		{
			if(isFeasible(position,vertexIndex))
			{
				hamiltonionPath[position]=vertexIndex;
			}
			if(findFesibleSolution(position+1))
			{
				return true;
			}
			
			//BACKTRAK
		}
		
		return false;
	}
	private boolean isFeasible(int actualPosition, int vertexIndex) {
		if(adjecentMatrix[hamiltonionPath[actualPosition-1]][vertexIndex]==0)
		return false;
		
		for(int i=0;i<actualPosition;i++)
		{
			if(hamiltonionPath[i]==vertexIndex)
				return false;
		}
		return true;
	}
	public void showHamiltonionPath()
	{
		System.out.println("Hamiltonion path is ");
		for(int i=0;i<hamiltonionPath.length;i++)
		{
			System.out.print(hamiltonionPath[i]+" ");
		}
		System.out.print(hamiltonionPath[0]);
	}
}
