package com.maze.problem;

public class MazeAlgorithom {

	private int[][]mazeTable;
	private int[][]solutionTable;
	private int mazeTableSize;
	
	public MazeAlgorithom(int [][]mazeTable) {
		this.mazeTable=mazeTable;
		mazeTableSize=mazeTable.length;
		solutionTable=new int[mazeTableSize][mazeTableSize];
		
		// TODO Auto-generated constructor stub
	}
	
	public void solve()
	{
		if(isFinished(0,0))
		{
			showResult();
		}
		else
		{
			System.out.println("There is no solution");
		}
	}

	private boolean isFinished(int x, int y) {
		if(x==mazeTableSize-1 && y==mazeTableSize)
			return true;
		if(isValid(x,y))
		{
			solutionTable[x][y]=1;
			if(isFinished(x+1, y))
			return true;
			if(isFinished(x, y+1))
				return true;
			if(isFinished(x-1, y))
				return true;
				if(isFinished(x, y-1))
					return true;
			//BackTrack
			solutionTable[x][y]=0;
			System.out.println("Backtrack");
		}
		
		
		// TODO Auto-generated method stub
		return false;
	}

	private boolean isValid(int x, int y) {
		// TODO Auto-generated method stub
		if(x<0 ||x>=mazeTableSize)
			return false;
		if(y<0 ||y>=mazeTableSize)
			return false;
		if(mazeTable[x][y]!=1)
			return false;
		if(solutionTable[x][y]==1)
			return false;
		return true;
	}

	private void showResult() {
		for(int i=0;i<mazeTableSize;i++)
		{
			for(int j=0;j<mazeTableSize;j++)
			{
				if(solutionTable[i][j]==1)
				System.out.print(solutionTable[i][j]+" ");
				else
					System.out.print("0 ");
			}
			System.out.println();
		}
		// TODO Auto-generated method stub
		
	}
}
