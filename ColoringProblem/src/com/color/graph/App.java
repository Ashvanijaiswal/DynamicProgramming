package com.color.graph;

public class App {

	public static void main(String[] args) {
	   int adjecencyMatrix[][]=new int[][] {
		   {0,1,0,1,1,0},
		   {1,0,1,0,1,1},
		   {0,1,0,1,1,1},
		   {1,0,1,0,1,0},
		   {1,1,1,1,0,1},
		   {0,1,1,0,0,0}
	   };
	   int numOfColors=3;
	   ColorAlgo color=new ColorAlgo(adjecencyMatrix, numOfColors);
	   color.solve();
	}

}
