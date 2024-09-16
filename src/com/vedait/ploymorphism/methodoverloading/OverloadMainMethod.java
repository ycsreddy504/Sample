package com.vedait.ploymorphism.methodoverloading;

public class OverloadMainMethod {
	
	public static void main(String args) {
		System.out.println("Main method with String args");
	}
	public static void main() {
		System.out.println("main method");
	}
	
	public static void main(String[] args) {
		
		System.out.println("this is maian method");
		OverloadMainMethod.main();
		OverloadMainMethod.main("DUmmay");
	}

}
