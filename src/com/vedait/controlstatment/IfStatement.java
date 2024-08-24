package com.vedait.controlstatment;

public class IfStatement {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		if (a > b) {
			System.out.println("A leass B: true");
		}

		if (a > b) {
			System.out.println("A leass B: true");
			if (b < a || a < b) {
				System.out.println("b<a || a<b");
			}
		} else {
			System.out.println("Else block executed");
			if (true != false) {
				System.out.println("Printing if inside elase block");
			}
		}

		if (a < b) {
			System.out.println("A leass B: true");
			if (b < a || a < b) {
				System.out.println("b<a || a<b");
			} else if (b > a ) {
				System.out.println("B>A is true");

			} else {
				System.out.println("Using Logical and operator else statment");
			}
		}

	}

}
