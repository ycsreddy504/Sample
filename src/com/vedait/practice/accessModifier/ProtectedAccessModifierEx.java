package com.vedait.practice.accessModifier;

public class ProtectedAccessModifierEx {

	protected ProtectedAccessModifierEx() {

	}

	protected void m1() {
		System.out.println("This is protected method");
	}
	
	void m2() {
		System.out.println("This is a defult method");
	}

	public static void main(String[] args) {

		ProtectedAccessModifierEx ex = new ProtectedAccessModifierEx();
		ex.m1();
	}

}
