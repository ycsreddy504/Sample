package com.vedait.practice.interfaces;

public interface Notes {
	
	// before 1.8 features
	// interface contain only abstaracct methods and contstans
	// we have method signature and static methods
	// claass A, interface B, interface C , A implements B,C
	// decoupling, multiple inheritance, polymorphism, design flexibility
	// we can't create object for interface, by using class we can create instance
	
	public static final double FIXED_RATE_OF_INTREST= 8.75; // constant variables
	
	public abstract void m1();
	
	public  void m2(); 

	default void m3() {
		// this with body
	}

	static void m4() {

	}
	
	
	
	
	
	

}
