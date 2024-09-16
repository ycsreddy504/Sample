package com.vedait.ploymorphism.methodoverloading;

public class OverloadingCalculator3 {
	
	void sum(int a, long b) {
		System.out.println("int a, long b");
	}
	
	void sum(long a, int b) {
		System.out.println("long a, int b");
	}
	public static void main(String[] args) {
		
		OverloadingCalculator3 c3=new OverloadingCalculator3();
		// c3.sum(1, 2);
	}

}
