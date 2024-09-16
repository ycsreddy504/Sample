package com.vedait.ploymorphism.methodoverriding;

public class ICICBank extends Bank {

	@Override
	public int getRateofIntrest() {
		return 8;

	}

	public static void m1() {
		System.out.println("static m1 method");
	}

}
