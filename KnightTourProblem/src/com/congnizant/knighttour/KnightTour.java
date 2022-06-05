package com.congnizant.knighttour;

public class KnightTour {
private int[][]SolutionMatrix;
private int[] moveX= {1,1,-1,-1,2,2,-2,-2};
private int[]moveY= {2,-2,2,-2,1,-1,1,-1};

public KnightTour()
{
	this.SolutionMatrix=new int[Constants.BOARD_SIZE][Constants.BOARD_SIZE];
	initilizeBoard();
	
}

private void initilizeBoard() {
	// TODO Auto-generated method stub
	for(int i=0;i<Constants.BOARD_SIZE;i++)
	{
		for(int j=0;j<Constants.BOARD_SIZE;j++)
		{
			SolutionMatrix[i][j]=Integer.MIN_VALUE;
		}
	}
	
}
public void solve()
{
	SolutionMatrix[0][0]=0;
	if(isSolution(1,0,0))
	{
		printSolution();
	}
	else
	{
		System.out.println("There is no solution..");
	}
}

private boolean isSolution(int steps, int x, int y) {
	if(steps==Constants.BOARD_SIZE*Constants.BOARD_SIZE)
	{
		return true;
	}
	for(int move=0;move<Constants.noOfMoves;move++)
	{	
		int netX=x+moveX[move];
		int netY=y+moveY[move];
		if(isValidMove(netX,netY))
		{
			SolutionMatrix[netX][netY]=steps;
			if(isSolution(steps+1, netX, netY))
			{
				return true;
			}
			//BackTracking
			
			SolutionMatrix[netX][netY]=Integer.MIN_VALUE;
			
		}
		
		
	}
	// TODO Auto-generated method stub
	return false;
}

private boolean isValidMove(int x, int y) {
	if(x<0 ||x>=Constants.BOARD_SIZE)
		return false;
	else if(y>=Constants.BOARD_SIZE ||y<0)
		return false;
	else if(SolutionMatrix[x][y]!=Integer.MIN_VALUE)
		return false;
	
	// TODO Auto-generated method stub
	return true;
}

private void printSolution() {
	// TODO Auto-generated method stub
	for(int i=0;i<Constants.BOARD_SIZE;i++)
	{
		for(int j=0;j<Constants.BOARD_SIZE;j++)
		{
			System.out.print(SolutionMatrix[i][j]+" ");
		}
		System.out.println();
	}
}




}
