package com.rod.cutting.problem;

public class App {

	public static void main(String[] args) {
		int numberOfPieces=5;
		int []pieces=new int[numberOfPieces];
		int fullLength=10;
		int []prices=new int[numberOfPieces];
		
		prices[0]=2;
		prices[1]=3;
		prices[2]=7;
		prices[3]=8;
		prices[4]=11;
		
		Algorithm algo=new Algorithm( prices, fullLength);
		algo.solve();
		//algo.show();
		
	}
}
