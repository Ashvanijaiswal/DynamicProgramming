package com.knapsack.algorithm;

public class App {
public static void main(String[] args) {
	int numOfItems=4;
	int values[]=new int[4];
	int weights[]=new int[4];
	values[0]=12;
	values[1]=3;
	values[2]=5;
	values[3]=6;
	
	weights[0]=6;
	weights[1]=2;
	weights[2]=4;
	weights[3]=3;
	int capacity=14;
	AlgorithmBacktrack k=new AlgorithmBacktrack(capacity,4, numOfItems, values, weights);
	k.solve();
}
}
