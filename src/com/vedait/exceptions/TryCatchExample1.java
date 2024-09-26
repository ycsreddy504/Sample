package com.vedait.exceptions;

public class TryCatchExample1 {

	public static void main(String[] args) {

		try {
			int data = 50 / 0; //
			System.out.println("Statment1");
		} catch (ArithmeticException e) {
			System.out.println(e);
		}

		System.out.println("Statment2");
		try {
			int data = 50 / 0; //
			System.out.println("Statment3");
		} catch (RuntimeException e) {
			System.out.println(e);
		}
		System.out.println("Statment4");
		
		try {
			int data = 50 / 0; //
			System.out.println("Statment4");
		} catch (Exception e) {
			System.out.println("Can't divided by zero");
		}
		System.out.println("Statment6");


	}

}
