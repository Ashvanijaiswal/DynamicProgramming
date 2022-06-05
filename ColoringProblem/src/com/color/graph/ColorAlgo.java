package com.color.graph;

public class ColorAlgo {
	private int numOfVertices;
	private int numOfColors;
	private int[]colors;
	private int[][]adjecencyMatrix;
	
	public ColorAlgo(int[][] adjecencyMatrix, int numOfColors)
	{
		this.numOfColors =numOfColors;
		this.numOfVertices=adjecencyMatrix.length ;
		this.adjecencyMatrix =adjecencyMatrix;
		this.colors=new int[numOfVertices]; 	
	}
	public void solve()
	{
		if(solveProblem(0))
		{
			showResults();
		}
		else
		{
			System.out.println("There is no solution");
		}
	}
	private boolean solveProblem(int nodeIndex) {
		if(nodeIndex==numOfVertices)
		{
			return true;
		}
		for(int colorIndex=0;colorIndex<numOfColors;colorIndex++)
		{
			if(isColorValid(nodeIndex,colorIndex))
			{
				colors[nodeIndex]=colorIndex;
				if(solveProblem(nodeIndex+1))
				{
					
					return true;
				}
				//BAckTrack
			}
			
			
		}
		return false;
	}
	private boolean isColorValid(int nodeIndex, int colorIndex) {
		for(int i=0;i<numOfVertices;i++)
		{
			if(adjecencyMatrix[nodeIndex][i]==1 && colorIndex==colors[i])
				return false;
		}
		// TODO Auto-generated method stub
		return true;
	}
	private void showResults() {
		// TODO Auto-generated method stub
		for(int i=0;i<numOfVertices;i++)
		{
			System.out.print("\n Node "+(i+1)+" has color index: "+colors[i]);
		}
		
	}
	
	
	
}
