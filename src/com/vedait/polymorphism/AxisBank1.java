package com.vedait.polymorphism;

public class AxisBank1 extends Bank1 {

	@Override
	public double getBalace() {

		return 2800.84;
	}

	public static void main(String[] args) {
		
		Bank1 bank =new Bank1();
		double bankBalance = bank.getBalace();
		System.out.println("bank balance : "+ bankBalance);
		Bank1 bank1;
		
		ICICBank1  bank2 = new ICICBank1();
		// parent class reference and creation object for child class 
		double icicBankBalance = bank2.getBalace();
		System.out.println("icic bank balance : "+ icicBankBalance);
		bank1 = new AxisBank1();
		double axisBankBalance = bank1.getBalace();
		System.out.println(axisBankBalance);
		// down casting
		//ICICBank1  icic= (ICICBank1) new Bank1(); // the compltime error will gone
		
		System.out.println(bank2 instanceof Bank1);
	

	}

}
