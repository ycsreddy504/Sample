package com.vedait.practice.accessModifier;

public class WithInthePackegeOtherClass {
	
	
	public static void main(String[] args) {
		//A a=new A();
		// a.m1();
		
		DefaultAccessModifierEx defaults=new DefaultAccessModifierEx();
		
		defaults.m1();
		
		ProtectedAccessModifierEx ex1=new ProtectedAccessModifierEx();
		ex1.m1();
		
	}
	
	
	

}
