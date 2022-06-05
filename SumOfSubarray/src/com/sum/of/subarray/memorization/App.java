package com.sum.of.subarray.memorization;

import java.util.Arrays;

public class App {
public static void main(String[] args) {
	int array[]=new int[5];
	array[0]=3;
	array[1]=2;
	array[2]=5;
	array[3]=4;
	array[4]=4;
	int SUM=6;
	int numOfElements=5;
	Arrays.sort(array);
	Algorithm k=new Algorithm(array, numOfElements, SUM);
	k.solveSum(array, SUM, numOfElements);
	k.showElement();
}
}
