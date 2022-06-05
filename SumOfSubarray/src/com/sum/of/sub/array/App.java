package com.sum.of.sub.array;

public class App {
public static void main(String[] args) {
	int array[]=new int[5];
	array[0]=3;
	array[1]=-2;
	array[2]=5;
	array[3]=4;
	array[4]=-4;
	int SUM=6;
	int numOfElements=5;

	Algorithm k=new Algorithm(array, numOfElements, SUM);
	k.solve();
}
}
