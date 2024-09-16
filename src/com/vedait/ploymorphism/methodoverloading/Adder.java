package com.vedait.ploymorphism.methodoverloading;

public class Adder {

	public int add(int a, int b) {

		return a + b;

	}

	public double add(double a, double b) {

		return a + b;

	}

	public static void main(String[] args) {
		Adder ad = new Adder();
		int intValue = ad.add(10, 21);
		double doubleValue = ad.add(20.11, 21.90);
		System.out.println("IntValue:" + intValue);
		System.out.println("DoubleValue: " + doubleValue);

	}
}
