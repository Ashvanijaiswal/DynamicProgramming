package com.hamiltonian;

public class App {

	public static void main(String[] args) {
		int adjecentMatrix[][]= {
				{0,1,1},
				{1,0,1},
				{1,1,0}
		};
		Hamiltonian cycle=new Hamiltonian(adjecentMatrix);
		cycle.solve();
		// TODO Auto-generated method stub

	}

}
