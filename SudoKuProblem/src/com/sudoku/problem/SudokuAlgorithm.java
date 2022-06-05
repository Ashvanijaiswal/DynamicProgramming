package com.sudoku.problem;

public class SudokuAlgorithm {
	private int [][]sudokuTable;
	public SudokuAlgorithm(int [][]sudokuTable)
	{
		this.sudokuTable=sudokuTable;
	}
	public void solve()
	{
		if(solveMethod(0,0))
		{
			showresult();
		}
		else
		{
			System.out.println("No solution Found");
		}
	}
	private boolean solveMethod(int rowIndex, int colIndex) {
		// TODO Auto-generated method stub
		if(rowIndex==Constants.BOARD_SIZE && ++colIndex==Constants.BOARD_SIZE)
		{	
			return true;
			
		}
		if(rowIndex==Constants.BOARD_SIZE)
		{
			rowIndex=0;
		}
		if(sudokuTable[rowIndex][colIndex]!=0)
		{
			return solveMethod(rowIndex+1, colIndex);
			
		}
		for(int value=Constants.MIN_VALUE;value<=Constants.MAX_VALUE;value++)
		{
			if(isValid(rowIndex,colIndex,value))
			{
				sudokuTable[rowIndex][colIndex]=value;
				if(solveMethod( rowIndex+1, colIndex))
				{
					return true;
				}
				//BackTrack
				sudokuTable[rowIndex][colIndex]=0;
			}
		}
		
		return false;
	}
	private boolean isValid(int rowIndex,int colIndex,int value) {
		for(int i=0;i<Constants.BOARD_SIZE;i++)
		{
			if(sudokuTable[rowIndex][i]==value)
				return false;
				
		}
		for(int i=0;i<Constants.BOARD_SIZE;i++)
		{
			if(sudokuTable[i][colIndex]==value)
				return false;
				
		}
		int boxRow=rowIndex/3*3;
		int boxCol=colIndex/3*3;
		for(int i=boxRow;i<boxRow+3;i++)
		{
			for(int j=boxCol;j<boxCol+3;j++)
			{
				if(sudokuTable[i][j]==value)
					return false;
			}
		}
		

		
		// TODO Auto-generated method stub
		return true;
	}
	private void showresult() {
		// TODO Auto-generated method stub
		for(int i=0;i<Constants.BOARD_SIZE;i++)
		{
			if(i%3==0)
				System.out.println(" ");
			for(int j=0;j<Constants.BOARD_SIZE;j++)
			{
				if(j%3==0)
				System.out.print(" ");	
				System.out.print(sudokuTable[i][j]+" ");
				
			}
			System.out.println(" ");
		}
		
	}
	

}
