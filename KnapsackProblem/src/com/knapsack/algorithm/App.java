package com.knapsack.algorithm;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numOfItems=3;
		int capacity=5;
		int totalBenifit=3;
		int []values=new int[numOfItems+1];
		values[1]=8;
		values[2]=4;
		values[3]=7;
		int [] weights=new int[totalBenifit+1];
		weights[1]=4;
		weights[2]=2;
		weights[3]=3;
		Algortithm k=new Algortithm(capacity, totalBenifit, numOfItems, values, weights);
		k.solve();

	}

}
