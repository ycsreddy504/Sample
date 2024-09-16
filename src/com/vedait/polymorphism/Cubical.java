package com.vedait.polymorphism;

public class Cubical {

	public static int cubical(int a, int b, int c) {

		return a * b * c;
	}

	public static int cubical(int a, int b) {

		return a * b ;
	}

	public static void main(String[] args) {
		Cubical c = new Cubical(); // object creatoin
		int cubicalValue = c.cubical(1, 1, 1);
		// how to call static method in java?
		int value = Cubical.cubical(2, 2, 2);
		System.out.println("Cubical object method  value: " + cubicalValue);
		System.out.println("Cubical satic method value: " + value);
		// practice example I want print table 2 * 1 = 2

	}

}
