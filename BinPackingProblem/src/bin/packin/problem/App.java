package bin.packin.problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb=new Scanner(System.in);
		List<Integer> items=Arrays.asList(5,5,5);
//		items.add(5);
//		items.add(4);
//		items.add(6);
//		items.add(3);
//		items.add(2);
		
		int binCapacity=5;
		FirstFitDecressingAlogorithm ob=new FirstFitDecressingAlogorithm(items, binCapacity);
		ob.solveBinPackingProblen();
		//System.out.println(ob);
	}

}
