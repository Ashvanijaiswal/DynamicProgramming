package com.maze.problem;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]mazeTable= {	{1,1,1,0},
						   		{1,0,1,0},
						   		{1,1,1,0},
						   		{0,1,1,1}
			
						  };
		MazeAlgorithom m=new MazeAlgorithom(mazeTable);
		m.solve();
	}

}
