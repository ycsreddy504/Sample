package com.vedait.ploymorphism.methodoverriding;

public class AxisBank extends Bank {

	@Override
	public int getRateofIntrest() {
		return 7;

	}
	
	public int getROI() {
		return 5;
		
	}

	public static void m1() {
		System.out.println("static m1 method");
	}
	
	public static void main(String[] args) {

		SBIBank sbi = new SBIBank();
		ICICBank icici = new ICICBank();
		AxisBank axis = new AxisBank();
		System.out.println("SBI rateof Intrest: " + sbi.getRateofIntrest());
		System.out.println("ICICI bank ROI: " + icici.getRateofIntrest());
		System.out.println("AxisBank ROI: " + axis.getRateofIntrest());
		axis.getROI();
		Bank bank= new Bank();
		// bank.getROI();

	}
}
