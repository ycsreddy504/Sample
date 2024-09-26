package com.vedait.javaopps.misc;

public class WrapperClassEx {
	
	// Integer, Double, Float, Long, Boolean, Char, Short, Byte
	
	// autoBoxing 
	// the automatic conversion or primitive data type into its corresponding 
	// wraper class is know as autoboxking
	// byt to Byte, short to Short, int to Integer
	
	// unBoxing
	// wrapper class type to primivite tyeps 
	
	public static void main(String[] args) {
		
		int a=20;  // primitive data type
		
		Integer b=    Integer.valueOf(a); // 1.5
		Integer c = a; // autobaxing, now compiler will write Inger.valueOF(a) internaly

		System.out.println(c);
		
		Integer x = new Integer(10);
		int i = x.intValue(); // convert Interto int ex
		int j = x; // now compiler will write x.intValue() internally
		
		double currentVolume = 0.75;
		double increasedVolume = Math.min(currentVolume + 0.1, 1.0);
		System.out.println("Adjusted Volume: " + increasedVolume);

		// compound intrest calculaiton
		
		double principal = 100000.00;
		double rate = 12.00;
		int years = 1;
		double amount = principal * Math.pow(1 + rate / 100, years);
		System.out.println("Compound Interest: " +  amount);

	       
	}

}
