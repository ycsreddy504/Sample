package com.vedait.ploymorphism.methodoverloading;

public class OverLoadingCalculator {

	void sum(int a, long b) {
		System.out.println(a + b);
	}

	void sum(int a, int b, int c) {
		System.out.println("sum(int a, int b, int c)");
		System.out.println(a + b + c);

	}
	void sum(long a, long b, long c) {
		System.out.println("sum(long a, long b, long c)");
		System.out.println(a + b + c);

	}

	public static void main(String[] args) {
		OverLoadingCalculator olc=new OverLoadingCalculator();
		olc.sum(11, 12); // 
		olc.sum(20, 30, 40l);

	}

}
