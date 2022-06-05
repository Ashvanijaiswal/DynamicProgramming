package com.fibonacci.number;

import java.util.HashMap;
import java.util.Map;

public class App {
 public static void main(String[] args) {
//	FibonacciAlgorithm f=new FibonacciAlgorithm();
////	int result=f.fibonacciNumber(4, 1, 1);
//	int result=0;
//	Map<Integer,Integer> table=new HashMap();
//	table.put(1, 1);
//	table.put(0, 1);
//	result=f.fibNumTopDown(9, table);
//	System.out.println(result);;
//	result=f.fibonacciTabulation(9, table);
//	System.out.println(result);;
	
	
	int x=300;
	int n=2;
	int root=(int)Math.sqrt(300);
//	System.out.println(root);
	SumOfProblem k=new SumOfProblem(x, n, root);
	k.solve();
		
	
}
}
