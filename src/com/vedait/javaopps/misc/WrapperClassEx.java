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
		
	       
	}

}
