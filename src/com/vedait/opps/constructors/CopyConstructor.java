package com.vedait.opps.constructors;

public class CopyConstructor {

	public CopyConstructor() {
		
		System.out.println("Defalult Construccotor");
	}

	public CopyConstructor(int a) {

		System.out.println("Paramertirized constructor int a" + a);
	}

	public CopyConstructor(int a, int b) {

		System.out.println("Parmeter int a, int b " + (a + b));
	}

	public void display() {
		System.out.println("Display");
	}
	
	public static void main(String[] args) {
		
		CopyConstructor s1=new CopyConstructor();
		CopyConstructor s2=new CopyConstructor(10);
		s2.display();

	}

}
