package com.vedait.practice.accessModifier;

public class PrivateAccessModifierEx {  // a classs can have only public, abstarct, final 
	
	private PrivateAccessModifierEx() {   // if we make constructor private we can't create instance of this class outside
		
		System.out.println("Constructor");
	}
	private String color="Color"; // we can't access the outside class or package it can be only with in the class
	
	
	private void m1() {
		System.out.println("This is private m1 method");
	}
	
	public static void main(String[] args) {
		PrivateAccessModifierEx a=new PrivateAccessModifierEx();
	}

}
