package com.vidait.opeators;

public class AssignmentOperators {

	public static void main(String[] args) {

		// =, +=, *=, /=, %=, -=

		int a = 5;

		a += 5;

		int b = 6;
		b -= 4;

		System.out.println("Additions :" + a);
		System.out.println(b);
		
		// Ternaroy and unary 
		// ++ and -- and ?:
		// true? "test": "not test";
		
		int c = 5;
		int d = 20;

		System.out.println((c > d) ? "Test" : "Not Test");
		
		// the value alias name

		System.out.println("Post increment : " + (c++)); // c=5 c=6
		System.out.println("Pre Increment: " + (++c)); // c=6 c=7

	}

}
