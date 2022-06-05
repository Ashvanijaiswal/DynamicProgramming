package com.sudoku.problem;

public class App {
public static void main(String[] args) {
	int [][]sudokuTable= {	{5,3,0,0,7,0,0,0,0},
							{6,0,0,1,9,5,0,0,0},
							{0,9,8,0,0,0,0,6,0},
							{8,0,0,0,6,1,4,2,3},
							{4,0,0,8,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0}
							
						 };
//	int [][]sudokuTable={{0,3,0},
//	{2,0,0},
//	{0,0,1}};
	
	SudokuAlgorithm al=new SudokuAlgorithm(sudokuTable);
	al.solve();
	
}
}
