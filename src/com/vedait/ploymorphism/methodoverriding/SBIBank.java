package com.vedait.ploymorphism.methodoverriding;

public class SBIBank extends Bank {

	@Override
	public int getRateofIntrest() {
		return 9;

	}
	
	//@Override
	public static void m1() {
		System.out.println("static m1 method");
	}
	//@Override
	public static void main(String[] args) {
		
	}

}
